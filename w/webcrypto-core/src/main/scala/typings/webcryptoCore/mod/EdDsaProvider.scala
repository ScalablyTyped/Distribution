package typings.webcryptoCore.mod

import typings.std.EcdsaParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("webcrypto-core", "EdDsaProvider")
@js.native
open class EdDsaProvider () extends EllipticProvider {
  
  def onSign(algorithm: EcdsaParams, key: typings.std.CryptoKey, data: js.typedarray.ArrayBuffer, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onVerify(
    algorithm: EcdsaParams,
    key: typings.std.CryptoKey,
    signature: js.typedarray.ArrayBuffer,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[Boolean] = js.native
}
