package typings.webcryptoCore.mod

import typings.std.AesCbcParams
import typings.std.JsonWebKey
import typings.std.KeyFormat
import typings.std.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("webcrypto-core", "DesProvider")
@js.native
open class DesProvider () extends ProviderCrypto {
  
  def checkAlgorithmParams(algorithm: AesCbcParams): Unit = js.native
  
  def checkDerivedKeyParams(algorithm: DesDerivedKeyParams): Unit = js.native
  
  def checkGenerateKeyParams(algorithm: DesKeyGenParams): Unit = js.native
  
  var ivSize: Double = js.native
  
  var keySizeBits: Double = js.native
  
  def onDecrypt(algorithm: DesParams, key: CryptoKey1, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onEncrypt(algorithm: DesParams, key: CryptoKey1, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onExportKey(format: KeyFormat, key: CryptoKey1, args: Any*): js.Promise[JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  
  def onGenerateKey(algorithm: DesKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[CryptoKey1] = js.native
  
  @JSName("usages")
  var usages_DesProvider: KeyUsages = js.native
}
