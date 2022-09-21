package typings.tinySecp256k1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateErrorMod {
  
  @JSImport("tiny-secp256k1/lib/validate_error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tiny-secp256k1/lib/validate_error", "ERROR_BAD_EXTRA_DATA")
  @js.native
  val ERROR_BAD_EXTRA_DATA: /* 5 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate_error", "ERROR_BAD_HASH")
  @js.native
  val ERROR_BAD_HASH: /* 3 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate_error", "ERROR_BAD_PARITY")
  @js.native
  val ERROR_BAD_PARITY: /* 6 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate_error", "ERROR_BAD_POINT")
  @js.native
  val ERROR_BAD_POINT: /* 1 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate_error", "ERROR_BAD_PRIVATE")
  @js.native
  val ERROR_BAD_PRIVATE: /* 0 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate_error", "ERROR_BAD_RECOVERY_ID")
  @js.native
  val ERROR_BAD_RECOVERY_ID: /* 7 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate_error", "ERROR_BAD_SIGNATURE")
  @js.native
  val ERROR_BAD_SIGNATURE: /* 4 */ Double = js.native
  
  @JSImport("tiny-secp256k1/lib/validate_error", "ERROR_BAD_TWEAK")
  @js.native
  val ERROR_BAD_TWEAK: /* 2 */ Double = js.native
  
  inline def throwError(errcode: Double): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(errcode.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
}
