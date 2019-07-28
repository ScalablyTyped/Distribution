package typings.xmldsigjs.xmldsigjsMod

import typings.std.Algorithm
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignatureAlgorithm extends IAlgorithm {
  def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Thenable[ArrayBuffer] = js.native
  def Verify(signedInfo: String, key: CryptoKey, signatureValue: Uint8Array): js.Thenable[Boolean] = js.native
  def Verify(signedInfo: String, key: CryptoKey, signatureValue: Uint8Array, algorithm: Algorithm): js.Thenable[Boolean] = js.native
}

