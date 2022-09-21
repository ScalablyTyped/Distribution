package typings.webcryptoCore.mod

import typings.std.AesCbcParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "AesCbcProvider")
@js.native
abstract class AesCbcProvider () extends AesProvider {
  
  def checkAlgorithmParams(algorithm: AesCbcParams): Unit = js.native
  
  def onDecrypt(algorithm: AesCbcParams, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onEncrypt(algorithm: AesCbcParams, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  @JSName("usages")
  var usages_AesCbcProvider: KeyUsages = js.native
}
