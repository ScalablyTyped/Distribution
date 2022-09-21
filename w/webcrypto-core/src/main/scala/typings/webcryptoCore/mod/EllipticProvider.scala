package typings.webcryptoCore.mod

import typings.std.CryptoKeyPair
import typings.std.EcKeyGenParams
import typings.std.EcKeyImportParams
import typings.std.JsonWebKey
import typings.std.KeyFormat
import typings.std.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "EllipticProvider")
@js.native
abstract class EllipticProvider () extends ProviderCrypto {
  
  def checkGenerateKeyParams(algorithm: EcKeyGenParams): Unit = js.native
  
  def checkNamedCurve(namedCurve: String): Unit = js.native
  
  var namedCurves: js.Array[String] = js.native
  
  def onExportKey(format: KeyFormat, key: CryptoKey1, args: Any*): js.Promise[JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  
  def onGenerateKey(algorithm: EcKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[CryptoKeyPair] = js.native
  
  def onImportKey(
    format: KeyFormat,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[CryptoKey1] = js.native
  def onImportKey(
    format: KeyFormat,
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[CryptoKey1] = js.native
}
