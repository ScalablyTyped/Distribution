package typings.webcryptoCore.mod

import typings.std.AesGcmParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("webcrypto-core", "AesGcmProvider")
@js.native
open class AesGcmProvider () extends AesProvider {
  
  def checkAlgorithmParams(algorithm: AesGcmParams): Unit = js.native
  
  def onDecrypt(algorithm: AesGcmParams, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onEncrypt(algorithm: AesGcmParams, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  @JSName("usages")
  var usages_AesGcmProvider: KeyUsages = js.native
}
