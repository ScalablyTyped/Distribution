package typings.trtcJsSdk.mod

import typings.std.HTMLDivElement
import typings.std.MediaStreamTrack
import typings.trtcJsSdk.anon.State
import typings.trtcJsSdk.trtcJsSdkStrings.`player-state-changed`
import typings.trtcJsSdk.trtcJsSdkStrings.`screen-sharing-stopped`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  /** 关闭音视频流,对于本地流，该方法会关闭摄像头并释放摄像头和麦克风访问权限。 */
  def close(): Unit = js.native
  /**
    * 获取当前音量大小,只有当本地流或远端流中有音频数据才有效。
    * @returns 音量大小,返回值在`(0.0, 1.0)`之间，通常认为值大于`0.1`为用户正在说话。
    */
  def getAudioLevel(): Double = js.native
  /** 获取音频轨道 */
  def getAudioTrack(): Nullable[MediaStreamTrack] = js.native
  /** 获取 Stream 唯一标识ID */
  def getId(): String = js.native
  /** 获取该流所属的用户ID */
  def getUserId(): String = js.native
  /**
    * 获取当前视频帧
    * **注意** 该方法需要在 play() 后调用，并且 Stream 中有视频流才有效
    * @example
    * ```javascript
    * // 截取当前视频帧
    * const frame = stream.getVideoFrame();
    * if (frame) {
    *   const img = document.createElement('img');
    *   img.src = frame;
    * }
    * ```
    */
  def getVideoFrame(): Nullable[String] = js.native
  /** 获取视频轨道 */
  def getVideoTrack(): Nullable[MediaStreamTrack] = js.native
  /** 是否包含音频轨道 */
  def hasAudio(): Boolean = js.native
  /** 是否包含视频轨道 */
  def hasVideo(): Boolean = js.native
  /**
    * 禁用音频轨道
    * - 对于本地流，调用该方法会停止发送音频，远端会触发 `Client.on('mute-audio')` 事件。
    * - 对于远端流，调用该方法会停止播放音频，但是仍然接收音频数据。
    * @returns `true` 禁用音频轨道成功; `false` 禁用音频轨道失败，因为没有音频轨道。
    */
  def muteAudio(): Boolean = js.native
  /**
    * 禁用视频轨道
    * - 对于本地流，调用该方法会停止发送视频，远端会触发 `Client.on('mute-video')` 事件。如果视频是从摄像头采集，此时摄像头灯仍然是亮着的。若想完全禁用视频轨道(即关闭摄像头)，可以使用 `removeTrack()` 删除视频轨道然后调用 `MediaStreamTrack.stop()` 关闭视频轨道（关闭摄像头）。
    * - 对于远端流，调用该方法会停止播放视频，但是仍然接收视频数据
    * @returns `true` 禁用视频轨道成功; `false` 禁用视频轨道失败，因为没有视频轨道。
    */
  def muteVideo(): Boolean = js.native
  /** 监听Stream事件 */
  @JSName("on")
  def on_playerstatechanged(event: `player-state-changed`, handler: Callback[State]): Unit = js.native
  @JSName("on")
  def on_screensharingstopped(event: `screen-sharing-stopped`, handler: Callback[js.UndefOr[scala.Nothing]]): Unit = js.native
  /**
    * 播放该音视频流
    * @param elementId HTML <div> 标签ID，该方法内部自动创建的音视频标签将被添加到该容器中。
    * @param options 播放选项
    */
  def play(elementId: String): js.Promise[Unit] = js.native
  def play(elementId: String, options: PlayOptions): js.Promise[Unit] = js.native
  def play(elementId: HTMLDivElement): js.Promise[Unit] = js.native
  def play(elementId: HTMLDivElement, options: PlayOptions): js.Promise[Unit] = js.native
  /**
    * 恢复播放音视频
    * **注意** 在某些版本浏览器上移动传入 `play()` 的 div 容器可能会导致音视频播放器进入 `PAUSED` 状态，此时 需要调用该接口继续进行播放。
    * @example
    * ```javascript
    * stream.on('player-state-changed', event => {
    *   if (event.state === 'PAUSED') {
    *     // resume audio/video playback
    *     stream.resume();
    *   }
    * });
    * ```
    */
  def resume(): Unit = js.native
  /**
    * 设置声音输出设备
    * @param deviceId 设备标识，通过 `getSpeakers()` 获取
    */
  def setAudioOutput(deviceId: String): js.Promise[Unit] = js.native
  /**
    * 设置音量大小,主要用于调节远端流的音量大小。
    * @param volume 音量大小，取值在 `0.0 (静音) 到 1.0 (最大音量)` 之间。
    */
  def setAudioVolume(volume: Double): Unit = js.native
  /** 停止播放音视频流,该方法还会将由 `play()` 创建的音视频标签从 HTML 页面中删除。 */
  def stop(): Unit = js.native
  /**
    * 启用音频轨道
    * - 对于本地流，调用该方法会触发远端 `Client.on('unmute-audio')` 事件。
    * - 音频轨道默认是开启的，若你调用 `muteAudio()` 后可用该方法重新启用音频。
    * @returns `true` 启用音频轨道成功; `false` 启用音频轨道失败，因为没有音频轨道。
    */
  def unmuteAudio(): Boolean = js.native
  /**
    * 启用视频轨道
    * - 对于本地流，调用该方法会触发远端 `Client.on('unmute-video')` 事件。
    * - 视频轨道默认是开启的，若你调用 `muteVideo()` 后可用该方法重新启用视频。
    * @returns `true` 启用视频轨道成功; `false` 启用视频轨道失败，因为没有视频轨道。
    */
  def unmuteVideo(): Boolean = js.native
}

