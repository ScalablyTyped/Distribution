package typings.webcryptoCore.mod

import typings.std.HmacImportParams
import typings.std.HmacKeyGenParams
import typings.std.JsonWebKey
import typings.std.KeyFormat
import typings.std.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "HmacProvider")
@js.native
abstract class HmacProvider () extends ProviderCrypto {
  
  def checkGenerateKeyParams(algorithm: HmacKeyGenParams): Unit = js.native
  
  def checkImportParams(algorithm: HmacImportParams): Unit = js.native
  
  /**
    * Returns default size in bits by hash algorithm name
    * @param algName Name of the hash algorithm
    */
  def getDefaultLength(algName: String): Double = js.native
  
  var hashAlgorithms: js.Array[String] = js.native
  
  def onExportKey(format: KeyFormat, key: CryptoKey1, args: Any*): js.Promise[JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  
  def onGenerateKey(algorithm: HmacKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[CryptoKey1] = js.native
  
  def onImportKey(
    format: KeyFormat,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[CryptoKey1] = js.native
  def onImportKey(
    format: KeyFormat,
    keyData: JsonWebKey,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[CryptoKey1] = js.native
  
  @JSName("usages")
  var usages_HmacProvider: KeyUsages = js.native
}
