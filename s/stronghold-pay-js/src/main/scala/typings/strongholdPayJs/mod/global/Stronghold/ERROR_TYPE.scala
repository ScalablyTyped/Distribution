package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERROR_TYPE extends js.Object
@JSGlobal("Stronghold.ERROR_TYPE")
@js.native
object ERROR_TYPE extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ERROR_TYPE with String] = js.native
  
  @js.native
  sealed trait API_ERROR extends ERROR_TYPE
  /* "api_error" */ @js.native
  object API_ERROR extends TopLevel[API_ERROR with String]
  
  @js.native
  sealed trait AUTH_ERROR extends ERROR_TYPE
  /* "auth_error" */ @js.native
  object AUTH_ERROR extends TopLevel[AUTH_ERROR with String]
  
  @js.native
  sealed trait INVALID_REQUEST_ERROR extends ERROR_TYPE
  /* "invalid_request_error" */ @js.native
  object INVALID_REQUEST_ERROR extends TopLevel[INVALID_REQUEST_ERROR with String]
  
  @js.native
  sealed trait OBJECT_ERROR extends ERROR_TYPE
  /* "object_error" */ @js.native
  object OBJECT_ERROR extends TopLevel[OBJECT_ERROR with String]
  
  @js.native
  sealed trait VALIDATION_ERROR extends ERROR_TYPE
  /* "validation_error" */ @js.native
  object VALIDATION_ERROR extends TopLevel[VALIDATION_ERROR with String]
}
