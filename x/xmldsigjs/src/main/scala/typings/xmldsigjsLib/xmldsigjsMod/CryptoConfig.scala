package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "CryptoConfig")
@js.native
class CryptoConfig ()
  extends xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.CryptoConfig

@JSImport("xmldsigjs", "CryptoConfig")
@js.native
object CryptoConfig extends js.Object {
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
  def CreateFromName(): xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.Transform = js.native
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
  def CreateFromName(name: java.lang.String): xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.Transform = js.native
  def CreateHashAlgorithm(namespace: java.lang.String): xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.HashAlgorithm = js.native
  def CreateSignatureAlgorithm(method: xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.SignatureMethod): xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.SignatureAlgorithm = js.native
  def GetHashAlgorithm(algorithm: stdLib.AlgorithmIdentifier): xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.IHashAlgorithm = js.native
  def GetSignatureAlgorithm(algorithm: stdLib.Algorithm): xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.ISignatureAlgorithm = js.native
}

