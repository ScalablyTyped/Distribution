package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("webcrypto-core", "AesCmacProvider")
@js.native
open class AesCmacProvider () extends AesProvider {
  
  def checkAlgorithmParams(algorithm: AesCmacParams): Unit = js.native
  
  def onSign(algorithm: AesCmacParams, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onVerify(
    algorithm: AesCmacParams,
    key: typings.std.CryptoKey,
    signature: js.typedarray.ArrayBuffer,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[Boolean] = js.native
  
  @JSName("usages")
  var usages_AesCmacProvider: KeyUsages = js.native
}
