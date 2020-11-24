package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayStreamingPropertyType extends js.Object
@JSImport("tizen-tv-webapis/avplay", "AVPlayStreamingPropertyType")
@js.native
object AVPlayStreamingPropertyType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayStreamingPropertyType with String] = js.native
  
  @js.native
  sealed trait ADAPTIVE_INFO extends AVPlayStreamingPropertyType
  /* "ADAPTIVE_INFO" */ @js.native
  object ADAPTIVE_INFO extends TopLevel[ADAPTIVE_INFO with String]
  
  @js.native
  sealed trait AVAILABLE_BITRATE extends AVPlayStreamingPropertyType
  /* "AVAILABLE_BITRATE" */ @js.native
  object AVAILABLE_BITRATE extends TopLevel[AVAILABLE_BITRATE with String]
  
  @js.native
  sealed trait COOKIE extends AVPlayStreamingPropertyType
  /* "COOKIE" */ @js.native
  object COOKIE extends TopLevel[COOKIE with String]
  
  @js.native
  sealed trait CURRENT_BANDWIDTH extends AVPlayStreamingPropertyType
  /* "CURRENT_BANDWIDTH" */ @js.native
  object CURRENT_BANDWIDTH extends TopLevel[CURRENT_BANDWIDTH with String]
  
  @js.native
  sealed trait GET_LIVE_DURATION extends AVPlayStreamingPropertyType
  /* "GET_LIVE_DURATION" */ @js.native
  object GET_LIVE_DURATION extends TopLevel[GET_LIVE_DURATION with String]
  
  @js.native
  sealed trait IS_LIVE extends AVPlayStreamingPropertyType
  /* "IS_LIVE" */ @js.native
  object IS_LIVE extends TopLevel[IS_LIVE with String]
  
  @js.native
  sealed trait LISTEN_SPARSE_TRACK extends AVPlayStreamingPropertyType
  /* "LISTEN_SPARSE_TRACK" */ @js.native
  object LISTEN_SPARSE_TRACK extends TopLevel[LISTEN_SPARSE_TRACK with String]
  
  @js.native
  sealed trait PORTRAIT_MODE extends AVPlayStreamingPropertyType
  /* "PORTRAIT_MODE" */ @js.native
  object PORTRAIT_MODE extends TopLevel[PORTRAIT_MODE with String]
  
  @js.native
  sealed trait PREBUFFER_MODE extends AVPlayStreamingPropertyType
  /* "PREBUFFER_MODE" */ @js.native
  object PREBUFFER_MODE extends TopLevel[PREBUFFER_MODE with String]
  
  @js.native
  sealed trait PROPERTY_HD_AUDIO extends AVPlayStreamingPropertyType
  /* "PROPERTY_HD_AUDIO" */ @js.native
  object PROPERTY_HD_AUDIO extends TopLevel[PROPERTY_HD_AUDIO with String]
  
  @js.native
  sealed trait SET_MIXEDFRAME extends AVPlayStreamingPropertyType
  /* "SET_MIXEDFRAME" */ @js.native
  object SET_MIXEDFRAME extends TopLevel[SET_MIXEDFRAME with String]
  
  @js.native
  sealed trait SET_MODE_4K extends AVPlayStreamingPropertyType
  /* "SET_MODE_4K" */ @js.native
  object SET_MODE_4K extends TopLevel[SET_MODE_4K with String]
  
  @js.native
  sealed trait SET_VR360_MODE extends AVPlayStreamingPropertyType
  /* "SET_VR360_MODE" */ @js.native
  object SET_VR360_MODE extends TopLevel[SET_VR360_MODE with String]
  
  @js.native
  sealed trait USER_AGENT extends AVPlayStreamingPropertyType
  /* "USER_AGENT" */ @js.native
  object USER_AGENT extends TopLevel[USER_AGENT with String]
  
  @js.native
  sealed trait USE_VIDEOMIXER extends AVPlayStreamingPropertyType
  /* "USE_VIDEOMIXER" */ @js.native
  object USE_VIDEOMIXER extends TopLevel[USE_VIDEOMIXER with String]
  
  @js.native
  sealed trait WIDEVINE extends AVPlayStreamingPropertyType
  /* "WIDEVINE" */ @js.native
  object WIDEVINE extends TopLevel[WIDEVINE with String]
}
