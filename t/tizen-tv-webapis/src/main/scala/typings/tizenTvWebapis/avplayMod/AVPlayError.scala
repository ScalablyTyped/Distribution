package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayError extends js.Object
@JSImport("tizen-tv-webapis/avplay", "AVPlayError")
@js.native
object AVPlayError extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayError with String] = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_CONNECTION_FAILED extends AVPlayError
  /* "PLAYER_ERROR_CONNECTION_FAILED" */ @js.native
  object PLAYER_ERROR_CONNECTION_FAILED extends TopLevel[PLAYER_ERROR_CONNECTION_FAILED with String]
  
  @js.native
  sealed trait PLAYER_ERROR_GENEREIC extends AVPlayError
  /* "PLAYER_ERROR_GENEREIC" */ @js.native
  object PLAYER_ERROR_GENEREIC extends TopLevel[PLAYER_ERROR_GENEREIC with String]
  
  @js.native
  sealed trait PLAYER_ERROR_INVALID_OPERATION extends AVPlayError
  /* "PLAYER_ERROR_INVALID_OPERATION" */ @js.native
  object PLAYER_ERROR_INVALID_OPERATION extends TopLevel[PLAYER_ERROR_INVALID_OPERATION with String]
  
  @js.native
  sealed trait PLAYER_ERROR_INVALID_PARAMETER extends AVPlayError
  /* "PLAYER_ERROR_INVALID_PARAMETER" */ @js.native
  object PLAYER_ERROR_INVALID_PARAMETER extends TopLevel[PLAYER_ERROR_INVALID_PARAMETER with String]
  
  @js.native
  sealed trait PLAYER_ERROR_INVALID_STATE extends AVPlayError
  /* "PLAYER_ERROR_INVALID_STATE" */ @js.native
  object PLAYER_ERROR_INVALID_STATE extends TopLevel[PLAYER_ERROR_INVALID_STATE with String]
  
  @js.native
  sealed trait PLAYER_ERROR_INVALID_URI extends AVPlayError
  /* "PLAYER_ERROR_INVALID_URI" */ @js.native
  object PLAYER_ERROR_INVALID_URI extends TopLevel[PLAYER_ERROR_INVALID_URI with String]
  
  @js.native
  sealed trait PLAYER_ERROR_NONE extends AVPlayError
  /* "PLAYER_ERROR_NONE" */ @js.native
  object PLAYER_ERROR_NONE extends TopLevel[PLAYER_ERROR_NONE with String]
  
  @js.native
  sealed trait PLAYER_ERROR_NOT_SUPPORTED_FILE extends AVPlayError
  /* "PLAYER_ERROR_NOT_SUPPORTED_FILE" */ @js.native
  object PLAYER_ERROR_NOT_SUPPORTED_FILE extends TopLevel[PLAYER_ERROR_NOT_SUPPORTED_FILE with String]
  
  @js.native
  sealed trait PLAYER_ERROR_NOT_SUPPORTED_FORMAT extends AVPlayError
  /* "PLAYER_ERROR_NOT_SUPPORTED_FORMAT" */ @js.native
  object PLAYER_ERROR_NOT_SUPPORTED_FORMAT extends TopLevel[PLAYER_ERROR_NOT_SUPPORTED_FORMAT with String]
  
  @js.native
  sealed trait PLAYER_ERROR_NO_SUCH_FILE extends AVPlayError
  /* "PLAYER_ERROR_NO_SUCH_FILE" */ @js.native
  object PLAYER_ERROR_NO_SUCH_FILE extends TopLevel[PLAYER_ERROR_NO_SUCH_FILE with String]
  
  @js.native
  sealed trait PLAYER_ERROR_SEEK_FAILED extends AVPlayError
  /* "PLAYER_ERROR_SEEK_FAILED" */ @js.native
  object PLAYER_ERROR_SEEK_FAILED extends TopLevel[PLAYER_ERROR_SEEK_FAILED with String]
}
