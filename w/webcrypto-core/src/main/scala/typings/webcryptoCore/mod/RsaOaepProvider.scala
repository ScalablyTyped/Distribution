package typings.webcryptoCore.mod

import typings.std.RsaOaepParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "RsaOaepProvider")
@js.native
abstract class RsaOaepProvider () extends RsaProvider {
  
  def checkAlgorithmParams(algorithm: RsaOaepParams): Unit = js.native
  
  def onDecrypt(algorithm: RsaOaepParams, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onEncrypt(algorithm: RsaOaepParams, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
}
