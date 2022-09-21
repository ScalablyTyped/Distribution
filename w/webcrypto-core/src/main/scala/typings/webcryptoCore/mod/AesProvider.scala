package typings.webcryptoCore.mod

import typings.std.AesKeyGenParams
import typings.std.JsonWebKey
import typings.std.KeyFormat
import typings.std.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "AesProvider")
@js.native
abstract class AesProvider () extends ProviderCrypto {
  
  def checkDerivedKeyParams(algorithm: AesKeyGenParams): Unit = js.native
  
  def checkGenerateKeyParams(algorithm: AesKeyGenParams): Unit = js.native
  
  def onExportKey(format: KeyFormat, key: CryptoKey1, args: Any*): js.Promise[JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  
  def onGenerateKey(algorithm: AesKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[CryptoKey1] = js.native
}
