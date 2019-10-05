package typings.xmldsigjs.xmldsigjsMod

import typings.std.Algorithm
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.xmldsigjs.xmldsigjsMod.IAlgorithm because Already inherited
- typings.xmldsigjs.xmldsigjsMod.ISignatureAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Sign, Verify, Verify */ @JSImport("xmldsigjs", "SignatureAlgorithm")
@js.native
abstract class SignatureAlgorithm () extends XmlAlgorithm {
  /**
    * Sign the given string using the given key
    */
  def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Thenable[ArrayBuffer] = js.native
  /**
    * Verify the given signature of the given string using key
    */
  def Verify(signedInfo: String, key: CryptoKey, signatureValue: Uint8Array): js.Thenable[Boolean] = js.native
  def Verify(signedInfo: String, key: CryptoKey, signatureValue: Uint8Array, algorithm: Algorithm): js.Thenable[Boolean] = js.native
}

