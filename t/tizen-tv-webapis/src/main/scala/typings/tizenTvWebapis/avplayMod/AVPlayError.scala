package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayError extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayError")
@js.native
object AVPlayError extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayError with String] = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_CONNECTION_FAILED extends AVPlayError
  /* "PLAYER_ERROR_CONNECTION_FAILED" */ val PLAYER_ERROR_CONNECTION_FAILED: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_CONNECTION_FAILED with String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_GENEREIC extends AVPlayError
  /* "PLAYER_ERROR_GENEREIC" */ val PLAYER_ERROR_GENEREIC: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_GENEREIC with String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_INVALID_OPERATION extends AVPlayError
  /* "PLAYER_ERROR_INVALID_OPERATION" */ val PLAYER_ERROR_INVALID_OPERATION: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_INVALID_OPERATION with String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_INVALID_PARAMETER extends AVPlayError
  /* "PLAYER_ERROR_INVALID_PARAMETER" */ val PLAYER_ERROR_INVALID_PARAMETER: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_INVALID_PARAMETER with String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_INVALID_STATE extends AVPlayError
  /* "PLAYER_ERROR_INVALID_STATE" */ val PLAYER_ERROR_INVALID_STATE: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_INVALID_STATE with String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_INVALID_URI extends AVPlayError
  /* "PLAYER_ERROR_INVALID_URI" */ val PLAYER_ERROR_INVALID_URI: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_INVALID_URI with String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_NONE extends AVPlayError
  /* "PLAYER_ERROR_NONE" */ val PLAYER_ERROR_NONE: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_NONE with String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_NOT_SUPPORTED_FILE extends AVPlayError
  /* "PLAYER_ERROR_NOT_SUPPORTED_FILE" */ val PLAYER_ERROR_NOT_SUPPORTED_FILE: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_NOT_SUPPORTED_FILE with String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_NOT_SUPPORTED_FORMAT extends AVPlayError
  /* "PLAYER_ERROR_NOT_SUPPORTED_FORMAT" */ val PLAYER_ERROR_NOT_SUPPORTED_FORMAT: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_NOT_SUPPORTED_FORMAT with String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_NO_SUCH_FILE extends AVPlayError
  /* "PLAYER_ERROR_NO_SUCH_FILE" */ val PLAYER_ERROR_NO_SUCH_FILE: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_NO_SUCH_FILE with String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_SEEK_FAILED extends AVPlayError
  /* "PLAYER_ERROR_SEEK_FAILED" */ val PLAYER_ERROR_SEEK_FAILED: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_SEEK_FAILED with String = js.native
}
