package typings.xmldsigjs.algorithmMod

import typings.std.Algorithm
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISignatureAlgorithm extends IAlgorithm {
  
  def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Promise[ArrayBuffer] = js.native
  
  def Verify(signedInfo: String, key: CryptoKey, signatureValue: Uint8Array): js.Promise[Boolean] = js.native
  def Verify(signedInfo: String, key: CryptoKey, signatureValue: Uint8Array, algorithm: Algorithm): js.Promise[Boolean] = js.native
}
