package typings.webcryptoCore.mod

import typings.std.AlgorithmIdentifier
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "JwkUtils")
@js.native
open class JwkUtils () extends StObject
object JwkUtils {
  
  @JSImport("webcrypto-core", "JwkUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def format(jwk: JsonWebKey): JsonWebKey = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(jwk.asInstanceOf[js.Any]).asInstanceOf[JsonWebKey]
  inline def format(jwk: JsonWebKey, remove: Boolean): JsonWebKey = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(jwk.asInstanceOf[js.Any], remove.asInstanceOf[js.Any])).asInstanceOf[JsonWebKey]
  
  /* static member */
  inline def thumbprint(hash: AlgorithmIdentifier, jwk: JsonWebKey, crypto: typings.std.Crypto): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("thumbprint")(hash.asInstanceOf[js.Any], jwk.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
}
