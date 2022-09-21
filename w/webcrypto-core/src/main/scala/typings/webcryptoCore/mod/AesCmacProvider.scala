package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "AesCmacProvider")
@js.native
abstract class AesCmacProvider () extends AesProvider {
  
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
