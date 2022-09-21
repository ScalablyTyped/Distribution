package typings.trtcCallingJs.mod

import typings.trtcCallingJs.trtcCallingJsStrings.onCallEnd
import typings.trtcCallingJs.trtcCallingJsStrings.onCallingCancel
import typings.trtcCallingJs.trtcCallingJsStrings.onCallingTimeout
import typings.trtcCallingJs.trtcCallingJsStrings.onError
import typings.trtcCallingJs.trtcCallingJsStrings.onInvited
import typings.trtcCallingJs.trtcCallingJsStrings.onKickedOut
import typings.trtcCallingJs.trtcCallingJsStrings.onLineBusy
import typings.trtcCallingJs.trtcCallingJsStrings.onNoResp
import typings.trtcCallingJs.trtcCallingJsStrings.onReject
import typings.trtcCallingJs.trtcCallingJsStrings.onUserAudioAvailable
import typings.trtcCallingJs.trtcCallingJsStrings.onUserEnter
import typings.trtcCallingJs.trtcCallingJsStrings.onUserLeave
import typings.trtcCallingJs.trtcCallingJsStrings.onUserVideoAvailable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 监听事件类型 */
/* static member */
object EVENT {
  
  @JSImport("trtc-calling-js", "EVENT")
  @js.native
  val ^ : js.Any = js.native
  
  /** 本次通话被取消了 */
  @JSImport("trtc-calling-js", "EVENT.CALLING_CANCEL")
  @js.native
  def CALLING_CANCEL: onCallingCancel = js.native
  inline def CALLING_CANCEL_=(x: onCallingCancel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CALLING_CANCEL")(x.asInstanceOf[js.Any])
  
  /** 本次通话超时未应答 */
  @JSImport("trtc-calling-js", "EVENT.CALLING_TIMEOUT")
  @js.native
  def CALLING_TIMEOUT: onCallingTimeout = js.native
  inline def CALLING_TIMEOUT_=(x: onCallingTimeout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CALLING_TIMEOUT")(x.asInstanceOf[js.Any])
  
  /** 本次通话结束 */
  @JSImport("trtc-calling-js", "EVENT.CALL_END")
  @js.native
  def CALL_END: onCallEnd = js.native
  inline def CALL_END_=(x: onCallEnd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CALL_END")(x.asInstanceOf[js.Any])
  
  /** 错误 */
  @JSImport("trtc-calling-js", "EVENT.ERROR")
  @js.native
  def ERROR: onError = js.native
  inline def ERROR_=(x: onError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  /** 收到了邀请通知 */
  @JSImport("trtc-calling-js", "EVENT.INVITED")
  @js.native
  def INVITED: onInvited = js.native
  inline def INVITED_=(x: onInvited): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVITED")(x.asInstanceOf[js.Any])
  
  /** 重复登录，被踢出房间 */
  @JSImport("trtc-calling-js", "EVENT.KICKED_OUT")
  @js.native
  def KICKED_OUT: onKickedOut = js.native
  inline def KICKED_OUT_=(x: onKickedOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KICKED_OUT")(x.asInstanceOf[js.Any])
  
  /** 被邀用户正在通话中，忙线 */
  @JSImport("trtc-calling-js", "EVENT.LINE_BUSY")
  @js.native
  def LINE_BUSY: onLineBusy = js.native
  inline def LINE_BUSY_=(x: onLineBusy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE_BUSY")(x.asInstanceOf[js.Any])
  
  /** 被邀用户超时无应答 */
  @JSImport("trtc-calling-js", "EVENT.NO_RESP")
  @js.native
  def NO_RESP: onNoResp = js.native
  inline def NO_RESP_=(x: onNoResp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_RESP")(x.asInstanceOf[js.Any])
  
  /** 被邀用户拒绝通话 */
  @JSImport("trtc-calling-js", "EVENT.REJECT")
  @js.native
  def REJECT: onReject = js.native
  inline def REJECT_=(x: onReject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECT")(x.asInstanceOf[js.Any])
  
  /** 远端用户开启/关闭了麦克风 */
  @JSImport("trtc-calling-js", "EVENT.USER_AUDIO_AVAILABLE")
  @js.native
  def USER_AUDIO_AVAILABLE: onUserAudioAvailable = js.native
  inline def USER_AUDIO_AVAILABLE_=(x: onUserAudioAvailable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_AUDIO_AVAILABLE")(x.asInstanceOf[js.Any])
  
  /** 用户进房 */
  @JSImport("trtc-calling-js", "EVENT.USER_ENTER")
  @js.native
  def USER_ENTER: onUserEnter = js.native
  inline def USER_ENTER_=(x: onUserEnter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_ENTER")(x.asInstanceOf[js.Any])
  
  /** 用户退出房间 */
  @JSImport("trtc-calling-js", "EVENT.USER_LEAVE")
  @js.native
  def USER_LEAVE: onUserLeave = js.native
  inline def USER_LEAVE_=(x: onUserLeave): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_LEAVE")(x.asInstanceOf[js.Any])
  
  /** 远端用户开启/关闭了摄像头 */
  @JSImport("trtc-calling-js", "EVENT.USER_VIDEO_AVAILABLE")
  @js.native
  def USER_VIDEO_AVAILABLE: onUserVideoAvailable = js.native
  inline def USER_VIDEO_AVAILABLE_=(x: onUserVideoAvailable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_VIDEO_AVAILABLE")(x.asInstanceOf[js.Any])
}
