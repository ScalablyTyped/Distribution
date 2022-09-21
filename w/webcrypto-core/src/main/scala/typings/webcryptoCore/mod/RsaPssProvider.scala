package typings.webcryptoCore.mod

import typings.std.RsaPssParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "RsaPssProvider")
@js.native
abstract class RsaPssProvider () extends RsaProvider {
  
  def checkAlgorithmParams(algorithm: RsaPssParams): Unit = js.native
  
  def onSign(algorithm: RsaPssParams, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onVerify(
    algorithm: RsaPssParams,
    key: typings.std.CryptoKey,
    signature: js.typedarray.ArrayBuffer,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[Boolean] = js.native
}
