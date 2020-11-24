package typings.tizenTvWebapis.avplayMod

import typings.tizenTvWebapis.tizenTvWebapisStrings.EME_PLAYREADY
import typings.tizenTvWebapis.tizenTvWebapisStrings.EME_WIDEVINE_CDM
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_ERROR_CONNECTION_FAILED
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_ERROR_GENEREIC
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_ERROR_INVALID_OPERATION
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_ERROR_INVALID_PARAMETER
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_ERROR_INVALID_STATE
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_ERROR_INVALID_URI
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_ERROR_NONE
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_ERROR_NOT_SUPPORTED_FILE
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_ERROR_NOT_SUPPORTED_FORMAT
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_ERROR_NO_SUCH_FILE
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_ERROR_SEEK_FAILED
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_MSG_BITRATE_CHANGE
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_MSG_DRM_CHALLENGE_DATA
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_MSG_FRAGMENT_INFO
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_MSG_HTTP_ERROR_CODE
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_MSG_NONE
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_MSG_RESOLUTION_CHANGED
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_SPARSE_TRACK_DETECT
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_STREAMING_EVENT
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYREADY
import typings.tizenTvWebapis.tizenTvWebapisStrings.VERIMATRIX
import typings.tizenTvWebapis.tizenTvWebapisStrings.WIDEVINE_CDM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AVPlayPlaybackCallback extends js.Object {
  
  /**
    * Callback method for asynchronous buffering complete notifications.
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    */
  var onbufferingcomplete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback method for asynchronous buffering progress notifications.
    * @param percent unsigned long
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    */
  var onbufferingprogress: js.UndefOr[js.Function1[/* percent */ Double, Unit]] = js.native
  
  /**
    * Callback method for asynchronous buffering started notifications.
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    */
  var onbufferingstart: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback method for the current playback time.
    * @param currentTime unsigned long
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    */
  var oncurrentplaytime: js.UndefOr[js.Function1[/* currentTime */ Double, Unit]] = js.native
  
  /**
    * Callback method for DRM information notifications.
    * @param type AVPlayDrmType object
    * @param data drmData
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    */
  var ondrmevent: js.UndefOr[
    js.Function2[
      /* type */ AVPlayDrmType | PLAYREADY | EME_PLAYREADY | VERIMATRIX | WIDEVINE_CDM | EME_WIDEVINE_CDM, 
      /* data */ js.Object, 
      Unit
    ]
  ] = js.native
  
  /**
    * Callback method for AVPlay error notifications.
    * @param eventid AVPlayError object
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    */
  var onerror: js.UndefOr[
    js.Function1[
      /* eventid */ AVPlayError | PLAYER_ERROR_NONE | PLAYER_ERROR_INVALID_PARAMETER | PLAYER_ERROR_NO_SUCH_FILE | PLAYER_ERROR_INVALID_OPERATION | PLAYER_ERROR_SEEK_FAILED | PLAYER_ERROR_INVALID_STATE | PLAYER_ERROR_NOT_SUPPORTED_FILE | PLAYER_ERROR_NOT_SUPPORTED_FORMAT | PLAYER_ERROR_INVALID_URI | PLAYER_ERROR_CONNECTION_FAILED | PLAYER_ERROR_GENEREIC, 
      Unit
    ]
  ] = js.native
  
  /**
    * Callback method for asynchronous event notifications.
    * @param eventid AVPlayEvent object
    * @param data DOMString
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    */
  var onevent: js.UndefOr[
    js.Function2[
      /* eventid */ AVPlayEvent | PLAYER_MSG_NONE | PLAYER_MSG_RESOLUTION_CHANGED | PLAYER_MSG_BITRATE_CHANGE | PLAYER_MSG_FRAGMENT_INFO | PLAYER_SPARSE_TRACK_DETECT | PLAYER_STREAMING_EVENT | PLAYER_MSG_HTTP_ERROR_CODE | PLAYER_MSG_DRM_CHALLENGE_DATA, 
      /* data */ String, 
      Unit
    ]
  ] = js.native
  
  /**
    * Callback method for asynchronous playback finished notifications.
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    */
  var onstreamcompleted: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback method for asynchronous subtitle change notifications.
    * @param duration unsigned long
    * @param subtitles DOMString
    * @param type unsigned long
    * @param attributes AVPlaySubtitleAttribute "attr_type": "AttributeType:value"; "start_pos": start position as long; "stop_pos": stop position as long
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    */
  var onsubtitlechange: js.UndefOr[
    js.Function4[
      /* duration */ Double, 
      /* subtitles */ String, 
      /* type */ Double, 
      /* attributes */ AVPlaySubtitleAttribute, 
      Unit
    ]
  ] = js.native
}
object AVPlayPlaybackCallback {
  
  @scala.inline
  def apply(): AVPlayPlaybackCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AVPlayPlaybackCallback]
  }
  
  @scala.inline
  implicit class AVPlayPlaybackCallbackOps[Self <: AVPlayPlaybackCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnbufferingcomplete(value: () => Unit): Self = this.set("onbufferingcomplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnbufferingcomplete: Self = this.set("onbufferingcomplete", js.undefined)
    
    @scala.inline
    def setOnbufferingprogress(value: /* percent */ Double => Unit): Self = this.set("onbufferingprogress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnbufferingprogress: Self = this.set("onbufferingprogress", js.undefined)
    
    @scala.inline
    def setOnbufferingstart(value: () => Unit): Self = this.set("onbufferingstart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnbufferingstart: Self = this.set("onbufferingstart", js.undefined)
    
    @scala.inline
    def setOncurrentplaytime(value: /* currentTime */ Double => Unit): Self = this.set("oncurrentplaytime", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOncurrentplaytime: Self = this.set("oncurrentplaytime", js.undefined)
    
    @scala.inline
    def setOndrmevent(
      value: (/* type */ AVPlayDrmType | PLAYREADY | EME_PLAYREADY | VERIMATRIX | WIDEVINE_CDM | EME_WIDEVINE_CDM, /* data */ js.Object) => Unit
    ): Self = this.set("ondrmevent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOndrmevent: Self = this.set("ondrmevent", js.undefined)
    
    @scala.inline
    def setOnerror(
      value: /* eventid */ AVPlayError | PLAYER_ERROR_NONE | PLAYER_ERROR_INVALID_PARAMETER | PLAYER_ERROR_NO_SUCH_FILE | PLAYER_ERROR_INVALID_OPERATION | PLAYER_ERROR_SEEK_FAILED | PLAYER_ERROR_INVALID_STATE | PLAYER_ERROR_NOT_SUPPORTED_FILE | PLAYER_ERROR_NOT_SUPPORTED_FORMAT | PLAYER_ERROR_INVALID_URI | PLAYER_ERROR_CONNECTION_FAILED | PLAYER_ERROR_GENEREIC => Unit
    ): Self = this.set("onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnevent(
      value: (/* eventid */ AVPlayEvent | PLAYER_MSG_NONE | PLAYER_MSG_RESOLUTION_CHANGED | PLAYER_MSG_BITRATE_CHANGE | PLAYER_MSG_FRAGMENT_INFO | PLAYER_SPARSE_TRACK_DETECT | PLAYER_STREAMING_EVENT | PLAYER_MSG_HTTP_ERROR_CODE | PLAYER_MSG_DRM_CHALLENGE_DATA, /* data */ String) => Unit
    ): Self = this.set("onevent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnevent: Self = this.set("onevent", js.undefined)
    
    @scala.inline
    def setOnstreamcompleted(value: () => Unit): Self = this.set("onstreamcompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnstreamcompleted: Self = this.set("onstreamcompleted", js.undefined)
    
    @scala.inline
    def setOnsubtitlechange(
      value: (/* duration */ Double, /* subtitles */ String, /* type */ Double, /* attributes */ AVPlaySubtitleAttribute) => Unit
    ): Self = this.set("onsubtitlechange", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnsubtitlechange: Self = this.set("onsubtitlechange", js.undefined)
  }
}
