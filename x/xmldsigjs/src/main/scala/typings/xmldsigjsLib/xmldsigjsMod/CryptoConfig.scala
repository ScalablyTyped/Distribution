package typings
package xmldsigjsLib.xmldsigjsMod

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
  def CreateFromName(): xmldsigjsLib.xmldsigjsMod.Transform = js.native
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
  def CreateFromName(name: java.lang.String): xmldsigjsLib.xmldsigjsMod.Transform = js.native
  def CreateHashAlgorithm(namespace: java.lang.String): xmldsigjsLib.xmldsigjsMod.HashAlgorithm = js.native
  def CreateSignatureAlgorithm(method: xmldsigjsLib.xmldsigjsMod.SignatureMethod): xmldsigjsLib.xmldsigjsMod.SignatureAlgorithm = js.native
  def GetHashAlgorithm(algorithm: stdLib.AlgorithmIdentifier): xmldsigjsLib.xmldsigjsMod.IHashAlgorithm = js.native
  def GetSignatureAlgorithm(algorithm: stdLib.Algorithm): xmldsigjsLib.xmldsigjsMod.ISignatureAlgorithm = js.native
}

