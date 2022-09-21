package typings.trtcJsSdk

import typings.trtcJsSdk.mod.ConnectionState
import typings.trtcJsSdk.trtcJsSdkStrings.PAUSED
import typings.trtcJsSdk.trtcJsSdkStrings.PLAYING
import typings.trtcJsSdk.trtcJsSdkStrings.STOPPED
import typings.trtcJsSdk.trtcJsSdkStrings.ended
import typings.trtcJsSdk.trtcJsSdkStrings.mute
import typings.trtcJsSdk.trtcJsSdkStrings.playing_
import typings.trtcJsSdk.trtcJsSdkStrings.unmute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Audio extends StObject {
    
    var audio: js.UndefOr[Boolean] = js.undefined
    
    var video: js.UndefOr[Boolean] = js.undefined
  }
  object Audio {
    
    inline def apply(): Audio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Audio]
    }
    
    extension [Self <: Audio](x: Self) {
      
      inline def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  trait IsBrowserSupported extends StObject {
    
    /** 当前浏览器是否是 SDK 支持的浏览器 */
    var isBrowserSupported: Boolean
    
    /** 当前浏览器是否支持 H264 编码 */
    var isH264Supported: Boolean
    
    /** 当前浏览器是否支持获取媒体设备及媒体流 */
    var isMediaDevicesSupported: Boolean
    
    /** 当前浏览器是否支持 webRTC */
    var isWebRTCSupported: Boolean
  }
  object IsBrowserSupported {
    
    inline def apply(
      isBrowserSupported: Boolean,
      isH264Supported: Boolean,
      isMediaDevicesSupported: Boolean,
      isWebRTCSupported: Boolean
    ): IsBrowserSupported = {
      val __obj = js.Dynamic.literal(isBrowserSupported = isBrowserSupported.asInstanceOf[js.Any], isH264Supported = isH264Supported.asInstanceOf[js.Any], isMediaDevicesSupported = isMediaDevicesSupported.asInstanceOf[js.Any], isWebRTCSupported = isWebRTCSupported.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsBrowserSupported]
    }
    
    extension [Self <: IsBrowserSupported](x: Self) {
      
      inline def setIsBrowserSupported(value: Boolean): Self = StObject.set(x, "isBrowserSupported", value.asInstanceOf[js.Any])
      
      inline def setIsH264Supported(value: Boolean): Self = StObject.set(x, "isH264Supported", value.asInstanceOf[js.Any])
      
      inline def setIsMediaDevicesSupported(value: Boolean): Self = StObject.set(x, "isMediaDevicesSupported", value.asInstanceOf[js.Any])
      
      inline def setIsWebRTCSupported(value: Boolean): Self = StObject.set(x, "isWebRTCSupported", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrevState extends StObject {
    
    var prevState: ConnectionState
    
    var state: ConnectionState
  }
  object PrevState {
    
    inline def apply(prevState: ConnectionState, state: ConnectionState): PrevState = {
      val __obj = js.Dynamic.literal(prevState = prevState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrevState]
    }
    
    extension [Self <: PrevState](x: Self) {
      
      inline def setPrevState(value: ConnectionState): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
      
      inline def setState(value: ConnectionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reason extends StObject {
    
    var reason: playing_ | mute | unmute | ended
    
    var state: PLAYING | PAUSED | STOPPED
    
    var `type`: String
  }
  object Reason {
    
    inline def apply(reason: playing_ | mute | unmute | ended, state: PLAYING | PAUSED | STOPPED, `type`: String): Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reason]
    }
    
    extension [Self <: Reason](x: Self) {
      
      inline def setReason(value: playing_ | mute | unmute | ended): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setState(value: PLAYING | PAUSED | STOPPED): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
