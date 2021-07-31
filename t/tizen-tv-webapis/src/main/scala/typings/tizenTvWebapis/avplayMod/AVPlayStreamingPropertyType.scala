package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AVPlayStreamingPropertyType extends StObject
@JSImport("tizen-tv-webapis/avplay", "AVPlayStreamingPropertyType")
@js.native
object AVPlayStreamingPropertyType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AVPlayStreamingPropertyType & String] = js.native
  
  @js.native
  sealed trait ADAPTIVE_INFO
    extends StObject
       with AVPlayStreamingPropertyType
  /* "ADAPTIVE_INFO" */ val ADAPTIVE_INFO: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.ADAPTIVE_INFO & String = js.native
  
  @js.native
  sealed trait AVAILABLE_BITRATE
    extends StObject
       with AVPlayStreamingPropertyType
  /* "AVAILABLE_BITRATE" */ val AVAILABLE_BITRATE: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.AVAILABLE_BITRATE & String = js.native
  
  @js.native
  sealed trait COOKIE
    extends StObject
       with AVPlayStreamingPropertyType
  /* "COOKIE" */ val COOKIE: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.COOKIE & String = js.native
  
  @js.native
  sealed trait CURRENT_BANDWIDTH
    extends StObject
       with AVPlayStreamingPropertyType
  /* "CURRENT_BANDWIDTH" */ val CURRENT_BANDWIDTH: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.CURRENT_BANDWIDTH & String = js.native
  
  @js.native
  sealed trait GET_LIVE_DURATION
    extends StObject
       with AVPlayStreamingPropertyType
  /* "GET_LIVE_DURATION" */ val GET_LIVE_DURATION: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.GET_LIVE_DURATION & String = js.native
  
  @js.native
  sealed trait IS_LIVE
    extends StObject
       with AVPlayStreamingPropertyType
  /* "IS_LIVE" */ val IS_LIVE: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.IS_LIVE & String = js.native
  
  @js.native
  sealed trait LISTEN_SPARSE_TRACK
    extends StObject
       with AVPlayStreamingPropertyType
  /* "LISTEN_SPARSE_TRACK" */ val LISTEN_SPARSE_TRACK: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.LISTEN_SPARSE_TRACK & String = js.native
  
  @js.native
  sealed trait PORTRAIT_MODE
    extends StObject
       with AVPlayStreamingPropertyType
  /* "PORTRAIT_MODE" */ val PORTRAIT_MODE: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.PORTRAIT_MODE & String = js.native
  
  @js.native
  sealed trait PREBUFFER_MODE
    extends StObject
       with AVPlayStreamingPropertyType
  /* "PREBUFFER_MODE" */ val PREBUFFER_MODE: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.PREBUFFER_MODE & String = js.native
  
  @js.native
  sealed trait PROPERTY_HD_AUDIO
    extends StObject
       with AVPlayStreamingPropertyType
  /* "PROPERTY_HD_AUDIO" */ val PROPERTY_HD_AUDIO: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.PROPERTY_HD_AUDIO & String = js.native
  
  @js.native
  sealed trait SET_MIXEDFRAME
    extends StObject
       with AVPlayStreamingPropertyType
  /* "SET_MIXEDFRAME" */ val SET_MIXEDFRAME: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.SET_MIXEDFRAME & String = js.native
  
  @js.native
  sealed trait SET_MODE_4K
    extends StObject
       with AVPlayStreamingPropertyType
  /* "SET_MODE_4K" */ val SET_MODE_4K: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.SET_MODE_4K & String = js.native
  
  @js.native
  sealed trait SET_VR360_MODE
    extends StObject
       with AVPlayStreamingPropertyType
  /* "SET_VR360_MODE" */ val SET_VR360_MODE: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.SET_VR360_MODE & String = js.native
  
  @js.native
  sealed trait USER_AGENT
    extends StObject
       with AVPlayStreamingPropertyType
  /* "USER_AGENT" */ val USER_AGENT: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.USER_AGENT & String = js.native
  
  @js.native
  sealed trait USE_VIDEOMIXER
    extends StObject
       with AVPlayStreamingPropertyType
  /* "USE_VIDEOMIXER" */ val USE_VIDEOMIXER: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.USE_VIDEOMIXER & String = js.native
  
  @js.native
  sealed trait WIDEVINE
    extends StObject
       with AVPlayStreamingPropertyType
  /* "WIDEVINE" */ val WIDEVINE: typings.tizenTvWebapis.avplayMod.AVPlayStreamingPropertyType.WIDEVINE & String = js.native
}
