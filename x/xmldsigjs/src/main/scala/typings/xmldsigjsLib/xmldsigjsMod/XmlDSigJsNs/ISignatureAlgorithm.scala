package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignatureAlgorithm extends IAlgorithm {
  def Sign(signedInfo: java.lang.String, signingKey: stdLib.CryptoKey, algorithm: stdLib.Algorithm): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  def Verify(signedInfo: java.lang.String, key: stdLib.CryptoKey, signatureValue: stdLib.Uint8Array): stdLib.PromiseLike[scala.Boolean] = js.native
  def Verify(
    signedInfo: java.lang.String,
    key: stdLib.CryptoKey,
    signatureValue: stdLib.Uint8Array,
    algorithm: stdLib.Algorithm
  ): stdLib.PromiseLike[scala.Boolean] = js.native
}

