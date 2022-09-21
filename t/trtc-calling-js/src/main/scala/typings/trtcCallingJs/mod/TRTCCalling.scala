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

/**
  * TRTCCalling 类，创建该类的实例可用于调用 TRTCCalling API
  * @see https://webim-1252463788.cos.ap-shanghai.myqcloud.com/trtc-calling/doc/TRTCCalling.html
  */
@js.native
trait TRTCCalling extends StObject {
  
  /** 接受当前的邀请 */
  def accept(options: AcceptOptions): js.Promise[Unit] = js.native
  
  /** 1对1通话邀请 */
  def call(options: CallOptions): js.Promise[Unit] = js.native
  
  /** 关闭摄像头 */
  def closeCamera(): Unit = js.native
  
  /** 群组通话邀请 */
  def groupCall(options: GroupCallOptions): js.Promise[Unit] = js.native
  
  /**
    * 1.当您处于通话中，可以调用该函数结束通话。
    * 2.当未拨通时, 可用来取消通话。
    */
  def hangup(): Unit = js.native
  
  /** 登录接口 */
  def login(options: LoginOptions): js.Promise[Unit] = js.native
  
  /** 登出接口 */
  def logout(): js.Promise[Unit] = js.native
  
  @JSName("off")
  def off_onCallEnd(eventName: onCallEnd, callback: Callback[Unit]): Unit = js.native
  @JSName("off")
  def off_onCallEnd(eventName: onCallEnd, callback: Callback[Unit], context: Any): Unit = js.native
  @JSName("off")
  def off_onCallingCancel(eventName: onCallingCancel, callback: Callback[Unit]): Unit = js.native
  @JSName("off")
  def off_onCallingCancel(eventName: onCallingCancel, callback: Callback[Unit], context: Any): Unit = js.native
  @JSName("off")
  def off_onCallingTimeout(eventName: onCallingTimeout, callback: Callback[Unit]): Unit = js.native
  @JSName("off")
  def off_onCallingTimeout(eventName: onCallingTimeout, callback: Callback[Unit], context: Any): Unit = js.native
  @JSName("off")
  def off_onError(eventName: onError, callback: Callback[Any]): Unit = js.native
  @JSName("off")
  def off_onError(eventName: onError, callback: Callback[Any], context: Any): Unit = js.native
  @JSName("off")
  def off_onInvited(eventName: onInvited, callback: Callback[InvitedInfo]): Unit = js.native
  @JSName("off")
  def off_onInvited(eventName: onInvited, callback: Callback[InvitedInfo], context: Any): Unit = js.native
  @JSName("off")
  def off_onKickedOut(eventName: onKickedOut, callback: Callback[Unit]): Unit = js.native
  @JSName("off")
  def off_onKickedOut(eventName: onKickedOut, callback: Callback[Unit], context: Any): Unit = js.native
  @JSName("off")
  def off_onLineBusy(eventName: onLineBusy, callback: Callback[UserInfo]): Unit = js.native
  @JSName("off")
  def off_onLineBusy(eventName: onLineBusy, callback: Callback[UserInfo], context: Any): Unit = js.native
  @JSName("off")
  def off_onNoResp(eventName: onNoResp, callback: Callback[UserInfo]): Unit = js.native
  @JSName("off")
  def off_onNoResp(eventName: onNoResp, callback: Callback[UserInfo], context: Any): Unit = js.native
  /** 用于取消事件监听 */
  @JSName("off")
  def off_onReject(eventName: onReject, callback: Callback[UserInfo]): Unit = js.native
  @JSName("off")
  def off_onReject(eventName: onReject, callback: Callback[UserInfo], context: Any): Unit = js.native
  @JSName("off")
  def off_onUserAudioAvailable(eventName: onUserAudioAvailable, callback: Callback[UserAudioInfo]): Unit = js.native
  @JSName("off")
  def off_onUserAudioAvailable(eventName: onUserAudioAvailable, callback: Callback[UserAudioInfo], context: Any): Unit = js.native
  @JSName("off")
  def off_onUserEnter(eventName: onUserEnter, callback: Callback[UserInfo]): Unit = js.native
  @JSName("off")
  def off_onUserEnter(eventName: onUserEnter, callback: Callback[UserInfo], context: Any): Unit = js.native
  @JSName("off")
  def off_onUserLeave(eventName: onUserLeave, callback: Callback[UserInfo]): Unit = js.native
  @JSName("off")
  def off_onUserLeave(eventName: onUserLeave, callback: Callback[UserInfo], context: Any): Unit = js.native
  @JSName("off")
  def off_onUserVideoAvailable(eventName: onUserVideoAvailable, callback: Callback[UserVideoInfo]): Unit = js.native
  @JSName("off")
  def off_onUserVideoAvailable(eventName: onUserVideoAvailable, callback: Callback[UserVideoInfo], context: Any): Unit = js.native
  
  @JSName("on")
  def on_onCallEnd(eventName: onCallEnd, callback: Callback[Unit]): Unit = js.native
  @JSName("on")
  def on_onCallEnd(eventName: onCallEnd, callback: Callback[Unit], context: Any): Unit = js.native
  @JSName("on")
  def on_onCallingCancel(eventName: onCallingCancel, callback: Callback[Unit]): Unit = js.native
  @JSName("on")
  def on_onCallingCancel(eventName: onCallingCancel, callback: Callback[Unit], context: Any): Unit = js.native
  @JSName("on")
  def on_onCallingTimeout(eventName: onCallingTimeout, callback: Callback[Unit]): Unit = js.native
  @JSName("on")
  def on_onCallingTimeout(eventName: onCallingTimeout, callback: Callback[Unit], context: Any): Unit = js.native
  @JSName("on")
  def on_onError(eventName: onError, callback: Callback[Any]): Unit = js.native
  @JSName("on")
  def on_onError(eventName: onError, callback: Callback[Any], context: Any): Unit = js.native
  @JSName("on")
  def on_onInvited(eventName: onInvited, callback: Callback[InvitedInfo]): Unit = js.native
  @JSName("on")
  def on_onInvited(eventName: onInvited, callback: Callback[InvitedInfo], context: Any): Unit = js.native
  @JSName("on")
  def on_onKickedOut(eventName: onKickedOut, callback: Callback[Unit]): Unit = js.native
  @JSName("on")
  def on_onKickedOut(eventName: onKickedOut, callback: Callback[Unit], context: Any): Unit = js.native
  @JSName("on")
  def on_onLineBusy(eventName: onLineBusy, callback: Callback[UserInfo]): Unit = js.native
  @JSName("on")
  def on_onLineBusy(eventName: onLineBusy, callback: Callback[UserInfo], context: Any): Unit = js.native
  @JSName("on")
  def on_onNoResp(eventName: onNoResp, callback: Callback[UserInfo]): Unit = js.native
  @JSName("on")
  def on_onNoResp(eventName: onNoResp, callback: Callback[UserInfo], context: Any): Unit = js.native
  /** 用于监听组件派发的事件 */
  @JSName("on")
  def on_onReject(eventName: onReject, callback: Callback[UserInfo]): Unit = js.native
  @JSName("on")
  def on_onReject(eventName: onReject, callback: Callback[UserInfo], context: Any): Unit = js.native
  @JSName("on")
  def on_onUserAudioAvailable(eventName: onUserAudioAvailable, callback: Callback[UserAudioInfo]): Unit = js.native
  @JSName("on")
  def on_onUserAudioAvailable(eventName: onUserAudioAvailable, callback: Callback[UserAudioInfo], context: Any): Unit = js.native
  @JSName("on")
  def on_onUserEnter(eventName: onUserEnter, callback: Callback[UserInfo]): Unit = js.native
  @JSName("on")
  def on_onUserEnter(eventName: onUserEnter, callback: Callback[UserInfo], context: Any): Unit = js.native
  @JSName("on")
  def on_onUserLeave(eventName: onUserLeave, callback: Callback[UserInfo]): Unit = js.native
  @JSName("on")
  def on_onUserLeave(eventName: onUserLeave, callback: Callback[UserInfo], context: Any): Unit = js.native
  @JSName("on")
  def on_onUserVideoAvailable(eventName: onUserVideoAvailable, callback: Callback[UserVideoInfo]): Unit = js.native
  @JSName("on")
  def on_onUserVideoAvailable(eventName: onUserVideoAvailable, callback: Callback[UserVideoInfo], context: Any): Unit = js.native
  
  /** 开启本地摄像头 */
  def openCamera(): Unit = js.native
  
  /** 拒绝当前的邀请 */
  def reject(options: RejectOptions): Unit = js.native
  
  /**
    * 设置日志输出等级
    * 0 普通级别，日志量较多，接入时建议使用
    * 1 release级别，SDK 输出关键信息，生产环境时建议使用
    * 2 告警级别，SDK 只输出告警和错误级别的日志
    * 3 错误级别，SDK 只输出错误级别的日志
    * 4 无日志级别，SDK 将不打印任何日志
    */
  def setLogLevel(level: LogLevel): Unit = js.native
  
  /** 开启/关闭麦克风 */
  def setMicMute(isMute: Boolean): Unit = js.native
  
  /** 将本地用户的摄像头数据渲染到指定的 DOM ID 节点里 */
  def startLocalView(options: ViewOptions): js.Promise[Unit] = js.native
  
  /** 将远端用户的摄像头数据渲染到指定的 DOM ID 节点里 */
  def startRemoteView(options: ViewOptions): js.Promise[Unit] = js.native
  
  /** 将本地用户的摄像头数据渲染的 DOM 节点删除 */
  def stopLocalView(options: ViewOptions): Unit = js.native
  
  /** 将远端用户的摄像头数据渲染的 DOM 节点删除 */
  def stopRemoteView(options: ViewOptions): Unit = js.native
}
