package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayEvent extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayEvent")
@js.native
object AVPlayEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayEvent with String] = js.native
  
  @js.native
  sealed trait PLAYER_MSG_BITRATE_CHANGE extends AVPlayEvent
  /* "PLAYER_MSG_BITRATE_CHANGE" */ val PLAYER_MSG_BITRATE_CHANGE: typings.tizenTvWebapis.avplayMod.AVPlayEvent.PLAYER_MSG_BITRATE_CHANGE with String = js.native
  
  @js.native
  sealed trait PLAYER_MSG_DRM_CHALLENGE_DATA extends AVPlayEvent
  /* "PLAYER_MSG_DRM_CHALLENGE_DATA" */ val PLAYER_MSG_DRM_CHALLENGE_DATA: typings.tizenTvWebapis.avplayMod.AVPlayEvent.PLAYER_MSG_DRM_CHALLENGE_DATA with String = js.native
  
  @js.native
  sealed trait PLAYER_MSG_FRAGMENT_INFO extends AVPlayEvent
  /* "PLAYER_MSG_FRAGMENT_INFO" */ val PLAYER_MSG_FRAGMENT_INFO: typings.tizenTvWebapis.avplayMod.AVPlayEvent.PLAYER_MSG_FRAGMENT_INFO with String = js.native
  
  @js.native
  sealed trait PLAYER_MSG_HTTP_ERROR_CODE extends AVPlayEvent
  /* "PLAYER_MSG_HTTP_ERROR_CODE" */ val PLAYER_MSG_HTTP_ERROR_CODE: typings.tizenTvWebapis.avplayMod.AVPlayEvent.PLAYER_MSG_HTTP_ERROR_CODE with String = js.native
  
  @js.native
  sealed trait PLAYER_MSG_NONE extends AVPlayEvent
  /* "PLAYER_MSG_NONE" */ val PLAYER_MSG_NONE: typings.tizenTvWebapis.avplayMod.AVPlayEvent.PLAYER_MSG_NONE with String = js.native
  
  @js.native
  sealed trait PLAYER_MSG_RESOLUTION_CHANGED extends AVPlayEvent
  /* "PLAYER_MSG_RESOLUTION_CHANGED" */ val PLAYER_MSG_RESOLUTION_CHANGED: typings.tizenTvWebapis.avplayMod.AVPlayEvent.PLAYER_MSG_RESOLUTION_CHANGED with String = js.native
  
  @js.native
  sealed trait PLAYER_SPARSE_TRACK_DETECT extends AVPlayEvent
  /* "PLAYER_SPARSE_TRACK_DETECT" */ val PLAYER_SPARSE_TRACK_DETECT: typings.tizenTvWebapis.avplayMod.AVPlayEvent.PLAYER_SPARSE_TRACK_DETECT with String = js.native
  
  @js.native
  sealed trait PLAYER_STREAMING_EVENT extends AVPlayEvent
  /* "PLAYER_STREAMING_EVENT" */ val PLAYER_STREAMING_EVENT: typings.tizenTvWebapis.avplayMod.AVPlayEvent.PLAYER_STREAMING_EVENT with String = js.native
}
