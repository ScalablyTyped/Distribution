package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayEvent extends js.Object
@JSImport("tizen-tv-webapis/avplay", "AVPlayEvent")
@js.native
object AVPlayEvent extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayEvent with String] = js.native
  
  @js.native
  sealed trait PLAYER_MSG_BITRATE_CHANGE extends AVPlayEvent
  /* "PLAYER_MSG_BITRATE_CHANGE" */ @js.native
  object PLAYER_MSG_BITRATE_CHANGE extends TopLevel[PLAYER_MSG_BITRATE_CHANGE with String]
  
  @js.native
  sealed trait PLAYER_MSG_DRM_CHALLENGE_DATA extends AVPlayEvent
  /* "PLAYER_MSG_DRM_CHALLENGE_DATA" */ @js.native
  object PLAYER_MSG_DRM_CHALLENGE_DATA extends TopLevel[PLAYER_MSG_DRM_CHALLENGE_DATA with String]
  
  @js.native
  sealed trait PLAYER_MSG_FRAGMENT_INFO extends AVPlayEvent
  /* "PLAYER_MSG_FRAGMENT_INFO" */ @js.native
  object PLAYER_MSG_FRAGMENT_INFO extends TopLevel[PLAYER_MSG_FRAGMENT_INFO with String]
  
  @js.native
  sealed trait PLAYER_MSG_HTTP_ERROR_CODE extends AVPlayEvent
  /* "PLAYER_MSG_HTTP_ERROR_CODE" */ @js.native
  object PLAYER_MSG_HTTP_ERROR_CODE extends TopLevel[PLAYER_MSG_HTTP_ERROR_CODE with String]
  
  @js.native
  sealed trait PLAYER_MSG_NONE extends AVPlayEvent
  /* "PLAYER_MSG_NONE" */ @js.native
  object PLAYER_MSG_NONE extends TopLevel[PLAYER_MSG_NONE with String]
  
  @js.native
  sealed trait PLAYER_MSG_RESOLUTION_CHANGED extends AVPlayEvent
  /* "PLAYER_MSG_RESOLUTION_CHANGED" */ @js.native
  object PLAYER_MSG_RESOLUTION_CHANGED extends TopLevel[PLAYER_MSG_RESOLUTION_CHANGED with String]
  
  @js.native
  sealed trait PLAYER_SPARSE_TRACK_DETECT extends AVPlayEvent
  /* "PLAYER_SPARSE_TRACK_DETECT" */ @js.native
  object PLAYER_SPARSE_TRACK_DETECT extends TopLevel[PLAYER_SPARSE_TRACK_DETECT with String]
  
  @js.native
  sealed trait PLAYER_STREAMING_EVENT extends AVPlayEvent
  /* "PLAYER_STREAMING_EVENT" */ @js.native
  object PLAYER_STREAMING_EVENT extends TopLevel[PLAYER_STREAMING_EVENT with String]
}
