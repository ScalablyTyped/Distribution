package typings.webcryptoCore.mod

import typings.std.CryptoKeyPair
import typings.std.JsonWebKey
import typings.std.KeyFormat
import typings.std.KeyUsage
import typings.std.RsaHashedImportParams
import typings.std.RsaHashedKeyGenParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "RsaProvider")
@js.native
abstract class RsaProvider () extends ProviderCrypto {
  
  def checkGenerateKeyParams(algorithm: RsaHashedKeyGenParams): Unit = js.native
  
  def checkImportParams(algorithm: RsaHashedImportParams): Unit = js.native
  
  var hashAlgorithms: js.Array[String] = js.native
  
  def onExportKey(format: KeyFormat, key: CryptoKey1, args: Any*): js.Promise[JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  
  def onGenerateKey(algorithm: RsaHashedKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[CryptoKeyPair] = js.native
  
  def onImportKey(
    format: KeyFormat,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[CryptoKey1] = js.native
  def onImportKey(
    format: KeyFormat,
    keyData: JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[CryptoKey1] = js.native
}
