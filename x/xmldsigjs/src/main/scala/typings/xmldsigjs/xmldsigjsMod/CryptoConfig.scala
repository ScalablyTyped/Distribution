package typings.xmldsigjs.xmldsigjsMod

import typings.std.Algorithm
import typings.std.AlgorithmIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "CryptoConfig")
@js.native
class CryptoConfig () extends js.Object

/* static members */
@JSImport("xmldsigjs", "CryptoConfig")
@js.native
object CryptoConfig extends js.Object {
  def CreateFromName(): Transform = js.native
  /**
    * Creates Transform from given name
    * if name is not exist then throws error
    *
    * @static
    * @param {(string |)} [name=null]
    * @returns
    *
    * @memberOf CryptoConfig
    */
  def CreateFromName(name: String): Transform = js.native
  def CreateHashAlgorithm(namespace: String): HashAlgorithm = js.native
  def CreateSignatureAlgorithm(method: SignatureMethod): SignatureAlgorithm = js.native
  def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = js.native
  def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = js.native
}

