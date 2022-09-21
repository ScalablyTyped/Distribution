package typings.webcryptoCore.mod

import typings.std.AesCtrParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "AesCtrProvider")
@js.native
abstract class AesCtrProvider () extends AesProvider {
  
  def checkAlgorithmParams(algorithm: AesCtrParams): Unit = js.native
  
  def onDecrypt(algorithm: AesCtrParams, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onEncrypt(algorithm: AesCtrParams, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  @JSName("usages")
  var usages_AesCtrProvider: KeyUsages = js.native
}
