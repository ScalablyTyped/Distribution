package typings.trtcJsSdk.mod

import typings.trtcJsSdk.anon.Audio
import typings.trtcJsSdk.anon.CurState
import typings.trtcJsSdk.trtcJsSdkStrings.Asterisk
import typings.trtcJsSdk.trtcJsSdkStrings.`client-banned`
import typings.trtcJsSdk.trtcJsSdkStrings.`connection-state-changed`
import typings.trtcJsSdk.trtcJsSdkStrings.`mute-audio`
import typings.trtcJsSdk.trtcJsSdkStrings.`mute-video`
import typings.trtcJsSdk.trtcJsSdkStrings.`peer-join`
import typings.trtcJsSdk.trtcJsSdkStrings.`peer-leave`
import typings.trtcJsSdk.trtcJsSdkStrings.`stream-added`
import typings.trtcJsSdk.trtcJsSdkStrings.`stream-removed`
import typings.trtcJsSdk.trtcJsSdkStrings.`stream-subscribed`
import typings.trtcJsSdk.trtcJsSdkStrings.`stream-updated`
import typings.trtcJsSdk.trtcJsSdkStrings.`unmute-audio`
import typings.trtcJsSdk.trtcJsSdkStrings.`unmute-video`
import typings.trtcJsSdk.trtcJsSdkStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends js.Object {
  
  /** 获取当前已发布本地流的音频统计数据 */
  def getLocalAudioStats(): js.Promise[LocalAudioStatsMap] = js.native
  
  /** 获取当前已发布本地流的视频统计数据 */
  def getLocalVideoStats(): js.Promise[LocalVideoStatsMap] = js.native
  
  /** 获取当前所有远端流的音频统计数据 */
  def getRemoteAudioStats(): js.Promise[RemoteAudioStatsMap] = js.native
  
  /** 获取当前房间内远端用户音视频 mute 状态列表。 */
  def getRemoteMutedState(): js.Array[RemoteMutedState] = js.native
  
  /** 获取当前所有远端流的视频统计数据 */
  def getRemoteVideoStats(): js.Promise[RemoteVideoStatsMap] = js.native
  
  /** 获取当前网络传输状况统计数据, 该方法需要在 `publish()` 后调用 */
  def getTransportStats(): js.Promise[TransportStats] = js.native
  
  /**
    * 加入一个音视频通话房间。
    *
    * 进房代表开始一个音视频通话会话，这时候 SDK 会监听远端用户进房退房情况，若有远端用户进房并且发布流，本地会收到 'stream-added' 事件。
    *
    * 进房后用户可以通过 publish() 发布本地流，本地流发布成功后远端用户就会收到相应 'stream-added' 事件通知从而完成一个双向的音视频通话连接。
    */
  def join(options: JoinOptions): js.Promise[Unit] = js.native
  
  /** 退出当前音视频通话房间，结束一次音视频通话会话。 */
  def leave(): js.Promise[Unit] = js.native
  
  /** 取消所有事件绑定 */
  def off(event: Asterisk): Unit = js.native
  @JSName("off")
  def off_clientbanned(event: `client-banned`, handler: Callback[RtcError]): Unit = js.native
  @JSName("off")
  def off_connectionstatechanged(event: `connection-state-changed`, handler: Callback[CurState]): Unit = js.native
  @JSName("off")
  def off_error(event: error, handler: Callback[RtcError]): Unit = js.native
  @JSName("off")
  def off_muteaudio(event: `mute-audio`, handler: Callback[RemoteUserInfo]): Unit = js.native
  @JSName("off")
  def off_mutevideo(event: `mute-video`, handler: Callback[RemoteUserInfo]): Unit = js.native
  @JSName("off")
  def off_peerjoin(event: `peer-join`, handler: Callback[RemoteUserInfo]): Unit = js.native
  @JSName("off")
  def off_peerleave(event: `peer-leave`, handler: Callback[RemoteUserInfo]): Unit = js.native
  /** 取消事件绑定 */
  @JSName("off")
  def off_streamadded(event: `stream-added`, handler: Callback[RemoteStreamInfo]): Unit = js.native
  @JSName("off")
  def off_streamremoved(event: `stream-removed`, handler: Callback[RemoteStreamInfo]): Unit = js.native
  @JSName("off")
  def off_streamsubscribed(event: `stream-subscribed`, handler: Callback[RemoteStreamInfo]): Unit = js.native
  @JSName("off")
  def off_streamupdated(event: `stream-updated`, handler: Callback[RemoteStreamInfo]): Unit = js.native
  @JSName("off")
  def off_unmuteaudio(event: `unmute-audio`, handler: Callback[RemoteUserInfo]): Unit = js.native
  @JSName("off")
  def off_unmutevideo(event: `unmute-video`, handler: Callback[RemoteUserInfo]): Unit = js.native
  
  @JSName("on")
  def on_clientbanned(event: `client-banned`, handler: Callback[RtcError]): Unit = js.native
  @JSName("on")
  def on_connectionstatechanged(event: `connection-state-changed`, handler: Callback[CurState]): Unit = js.native
  @JSName("on")
  def on_error(event: error, handler: Callback[RtcError]): Unit = js.native
  @JSName("on")
  def on_muteaudio(event: `mute-audio`, handler: Callback[RemoteUserInfo]): Unit = js.native
  @JSName("on")
  def on_mutevideo(event: `mute-video`, handler: Callback[RemoteUserInfo]): Unit = js.native
  @JSName("on")
  def on_peerjoin(event: `peer-join`, handler: Callback[RemoteUserInfo]): Unit = js.native
  @JSName("on")
  def on_peerleave(event: `peer-leave`, handler: Callback[RemoteUserInfo]): Unit = js.native
  /** 监听客户端对象事件 */
  @JSName("on")
  def on_streamadded(event: `stream-added`, handler: Callback[RemoteStreamInfo]): Unit = js.native
  @JSName("on")
  def on_streamremoved(event: `stream-removed`, handler: Callback[RemoteStreamInfo]): Unit = js.native
  @JSName("on")
  def on_streamsubscribed(event: `stream-subscribed`, handler: Callback[RemoteStreamInfo]): Unit = js.native
  @JSName("on")
  def on_streamupdated(event: `stream-updated`, handler: Callback[RemoteStreamInfo]): Unit = js.native
  @JSName("on")
  def on_unmuteaudio(event: `unmute-audio`, handler: Callback[RemoteUserInfo]): Unit = js.native
  @JSName("on")
  def on_unmutevideo(event: `unmute-video`, handler: Callback[RemoteUserInfo]): Unit = js.native
  
  /**
    * 发布本地音视频流。
    * - 该方法需要在 join() 进房后调用，一次音视频会话中只能发布一个本地流。若想发布另外一个本地流，可先通过 unpublish() 取消发布当前本地流后再发布新的本地流。
    * - 在发布本地流后，可通过 removeTrack()、addTrack()、 replaceTrack() 来更新本地流中的某个音频或视频流。
    * - 发布本地流后远端会收到 ‘stream-added’ 事件通知。
    */
  def publish(stream: LocalStream): js.Promise[Unit] = js.native
  
  /**
    * 设置是否默认接收远端流。该方法可在 join() 调用前使用，若在进房后调用，会接收不到后续进房的远端用户音视频流。
    * @param muted 是否默认不接收远端流: true true 默认不接收任何远端流。false 默认接收所有远端流。（默认）
    */
  def setDefaultMuteRemoteStreams(muted: Boolean): Unit = js.native
  
  /**
    * 设置代理服务器。该方法适用于企业自己部署代理服务器，如 ngnix+coturn 方案。
    *
    * **注意** 该方法需要在 join() 之前调用。
    */
  def setProxyServer(url: String): Unit = js.native
  
  /**
    * 设置 TURN 服务器，该方法配合 setProxyServer() 使用，适用于企业自己部署代理服务器和 TURN 中转。
    *
    * **注意** 该方法需要在 join() 之前调用。
    */
  def setTurnServer(config: TurnServerConfig): Unit = js.native
  
  /**
    * 订阅远端流
    * @param stream 远端流，通过监听 'stream-added' 事件获得。
    *
    * @example
    * ```javascript
    * // 监听远端流订阅成功事件
    * client.on('stream-subscribed', event => {
    *  const remoteStream = event.stream;
    *  // 远端流订阅成功，播放远端音视频流
    *  remoteStream.play('remote_stream');
    * });
    * // 监听远端流增加事件
    * client.on('stream-added', event => {
    *  const remoteStream = event.stream;
    *  // 订阅远端音频和视频流
    *  client.subscribe(remoteStream, { audio: true, video: true });
    *
    *  // 仅订阅音频数据
    *  // client.subscribe(remoteStream, { audio: true, video: false });
    * });
    * ```
    */
  def subscribe(stream: RemoteStream): Unit = js.native
  def subscribe(stream: RemoteStream, options: Audio): Unit = js.native
  
  /** 切换用户角色 */
  def switchRole(role: Role): js.Promise[Unit] = js.native
  
  /** 取消发布本地流。 取消发布本地流后远端会收到 'stream-removed' 事件通知。 */
  def unpublish(stream: LocalStream): js.Promise[Unit] = js.native
  
  /**
    * 取消订阅远端流
    * @param stream 远端流，通过监听 'stream-added' 事件获得。
    */
  def unsubscribe(stream: RemoteStream): Unit = js.native
}
