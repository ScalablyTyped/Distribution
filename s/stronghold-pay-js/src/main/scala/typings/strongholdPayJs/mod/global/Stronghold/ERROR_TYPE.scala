package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERROR_TYPE extends StObject
@JSGlobal("Stronghold.ERROR_TYPE")
@js.native
object ERROR_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ERROR_TYPE with String] = js.native
  
  @js.native
  sealed trait API_ERROR extends ERROR_TYPE
  /* "api_error" */ val API_ERROR: typings.strongholdPayJs.mod.global.Stronghold.ERROR_TYPE.API_ERROR with String = js.native
  
  @js.native
  sealed trait AUTH_ERROR extends ERROR_TYPE
  /* "auth_error" */ val AUTH_ERROR: typings.strongholdPayJs.mod.global.Stronghold.ERROR_TYPE.AUTH_ERROR with String = js.native
  
  @js.native
  sealed trait INVALID_REQUEST_ERROR extends ERROR_TYPE
  /* "invalid_request_error" */ val INVALID_REQUEST_ERROR: typings.strongholdPayJs.mod.global.Stronghold.ERROR_TYPE.INVALID_REQUEST_ERROR with String = js.native
  
  @js.native
  sealed trait OBJECT_ERROR extends ERROR_TYPE
  /* "object_error" */ val OBJECT_ERROR: typings.strongholdPayJs.mod.global.Stronghold.ERROR_TYPE.OBJECT_ERROR with String = js.native
  
  @js.native
  sealed trait VALIDATION_ERROR extends ERROR_TYPE
  /* "validation_error" */ val VALIDATION_ERROR: typings.strongholdPayJs.mod.global.Stronghold.ERROR_TYPE.VALIDATION_ERROR with String = js.native
}
