package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayError extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayError")
@js.native
object AVPlayError extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayError & String] = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_CONNECTION_FAILED
    extends StObject
       with AVPlayError
  /* "PLAYER_ERROR_CONNECTION_FAILED" */ val PLAYER_ERROR_CONNECTION_FAILED: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_CONNECTION_FAILED & String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_GENEREIC
    extends StObject
       with AVPlayError
  /* "PLAYER_ERROR_GENEREIC" */ val PLAYER_ERROR_GENEREIC: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_GENEREIC & String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_INVALID_OPERATION
    extends StObject
       with AVPlayError
  /* "PLAYER_ERROR_INVALID_OPERATION" */ val PLAYER_ERROR_INVALID_OPERATION: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_INVALID_OPERATION & String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_INVALID_PARAMETER
    extends StObject
       with AVPlayError
  /* "PLAYER_ERROR_INVALID_PARAMETER" */ val PLAYER_ERROR_INVALID_PARAMETER: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_INVALID_PARAMETER & String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_INVALID_STATE
    extends StObject
       with AVPlayError
  /* "PLAYER_ERROR_INVALID_STATE" */ val PLAYER_ERROR_INVALID_STATE: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_INVALID_STATE & String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_INVALID_URI
    extends StObject
       with AVPlayError
  /* "PLAYER_ERROR_INVALID_URI" */ val PLAYER_ERROR_INVALID_URI: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_INVALID_URI & String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_NONE
    extends StObject
       with AVPlayError
  /* "PLAYER_ERROR_NONE" */ val PLAYER_ERROR_NONE: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_NONE & String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_NOT_SUPPORTED_FILE
    extends StObject
       with AVPlayError
  /* "PLAYER_ERROR_NOT_SUPPORTED_FILE" */ val PLAYER_ERROR_NOT_SUPPORTED_FILE: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_NOT_SUPPORTED_FILE & String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_NOT_SUPPORTED_FORMAT
    extends StObject
       with AVPlayError
  /* "PLAYER_ERROR_NOT_SUPPORTED_FORMAT" */ val PLAYER_ERROR_NOT_SUPPORTED_FORMAT: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_NOT_SUPPORTED_FORMAT & String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_NO_SUCH_FILE
    extends StObject
       with AVPlayError
  /* "PLAYER_ERROR_NO_SUCH_FILE" */ val PLAYER_ERROR_NO_SUCH_FILE: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_NO_SUCH_FILE & String = js.native
  
  @js.native
  sealed trait PLAYER_ERROR_SEEK_FAILED
    extends StObject
       with AVPlayError
  /* "PLAYER_ERROR_SEEK_FAILED" */ val PLAYER_ERROR_SEEK_FAILED: typings.tizenTvWebapis.avplayMod.AVPlayError.PLAYER_ERROR_SEEK_FAILED & String = js.native
}
