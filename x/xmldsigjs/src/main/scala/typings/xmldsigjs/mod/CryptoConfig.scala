package typings.xmldsigjs.mod

import typings.std.Algorithm
import typings.std.AlgorithmIdentifier
import typings.xmldsigjs.algorithmMod.HashAlgorithm
import typings.xmldsigjs.algorithmMod.IHashAlgorithm
import typings.xmldsigjs.algorithmMod.ISignatureAlgorithm
import typings.xmldsigjs.algorithmMod.SignatureAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "CryptoConfig")
@js.native
class CryptoConfig ()
  extends typings.xmldsigjs.cryptoConfigMod.CryptoConfig

/* static members */
@JSImport("xmldsigjs", "CryptoConfig")
@js.native
object CryptoConfig extends js.Object {
  def CreateFromName(): typings.xmldsigjs.xmlMod.Transform = js.native
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
  def CreateFromName(name: String): typings.xmldsigjs.xmlMod.Transform = js.native
  def CreateHashAlgorithm(namespace: String): HashAlgorithm = js.native
  def CreateSignatureAlgorithm(method: typings.xmldsigjs.signatureMethodMod.SignatureMethod): SignatureAlgorithm = js.native
  def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = js.native
  def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = js.native
}

