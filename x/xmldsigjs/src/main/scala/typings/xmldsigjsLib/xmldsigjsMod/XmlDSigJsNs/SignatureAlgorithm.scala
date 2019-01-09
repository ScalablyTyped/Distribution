package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.ISignatureAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Sign, Verify, Verify */ @js.native
trait SignatureAlgorithm extends XmlAlgorithm {
  /**
    * Sign the given string using the given key
    */
  def Sign(signedInfo: java.lang.String, signingKey: stdLib.CryptoKey, algorithm: stdLib.Algorithm): js.Thenable[stdLib.ArrayBuffer] = js.native
  /**
    * Verify the given signature of the given string using key
    */
  def Verify(signedInfo: java.lang.String, key: stdLib.CryptoKey, signatureValue: stdLib.Uint8Array): js.Thenable[scala.Boolean] = js.native
  def Verify(
    signedInfo: java.lang.String,
    key: stdLib.CryptoKey,
    signatureValue: stdLib.Uint8Array,
    algorithm: stdLib.Algorithm
  ): js.Thenable[scala.Boolean] = js.native
}

