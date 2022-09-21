package typings.trtcJsSdk.mod

import typings.std.MediaStreamTrack
import typings.trtcJsSdk.trtcJsSdkStrings.audio
import typings.trtcJsSdk.trtcJsSdkStrings.detail
import typings.trtcJsSdk.trtcJsSdkStrings.high
import typings.trtcJsSdk.trtcJsSdkStrings.motion
import typings.trtcJsSdk.trtcJsSdkStrings.standard
import typings.trtcJsSdk.trtcJsSdkStrings.text
import typings.trtcJsSdk.trtcJsSdkStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalStream
  extends StObject
     with Stream {
  
  /**
    * 添加音频或视频轨道
    *
    * 调用该方法将音频或视频轨道添加到本地流，若该本地流已经被发布，则会自动更新发往远端的音视频流，此时远端会收到 `Client.on('stream-updated')` 事件通知。
    *
    * 新的音视频轨道可以通过 `createStream()` | `getAudioTrack()` | `getVideoTrack()` 获取，
    * 或者直接通过 [getUserMedia()](https://developer.mozilla.org/zh-CN/docs/Web/API/MediaDevices/getUserMedia)、
    * [captureStream()](https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/captureStream) 获取。
    *
    * **注意**
    * - 一个 Stream 对象中最多只能同时包含一路音频轨道和一路视频轨道。如果你想要更换同类型的轨道，请使用 `replaceTrack()`。
    * - 在增加视频轨道时，要求视频分辨率跟 `setVideoProfile()` 设置保持一致，否则会抛出异常。
    *
    * @example
    * ```javascript
    * const localStream = TRTC.createStream({ userId, audio: true, video: false });
    * localStream.initialize().then(() => {
    *   // 分布本地流（只有从麦克风采集的音频流）
    *   client.publish(localStream);
    * });
    *
    * // ...
    *
    * // 开启视频通话
    * const videoStream = TRTC.createStream({ userId, audio: false, video: true });
    * videoStream.initialize().then(() => {
    *   const videoTrack = videoStream.getVideoTrack();
    *   // 将从摄像头采集的视频轨道插入当前已发布的本地流对象LocalStream
    *   localStream.addTrack(videoTrack).then(() => {
    *     // 视频通话开启成功，远端流将会收到‘stream-updated’通知
    *   });
    * });
    * ```
    */
  def addTrack(track: MediaStreamTrack): js.Promise[Unit] = js.native
  
  /** 初始化本地音视频流对象, 初始化失败的错误信息请参考 [getUserMedia异常](https://developer.mozilla.org/zh-CN/docs/Web/API/MediaDevices/getUserMedia#%E8%AF%AD%E6%B3%95)。 */
  def initialize(): js.Promise[Unit] = js.native
  
  /**
    * 移除视频轨道
    *
    * 调用该方法会移除本地流中的视频轨道，若本地流已经被发布，则会自动更新发往远端的视频流，此时远端会收到 `Client.on('stream-updated')` 事件通知。
    *
    * **注意**
    * - 一个已经发布的Stream对象中至少要有一个媒体轨道，如果你想完全删除本地流中的音视频轨道，请直接通过 `unpublish()` 取消发布， 然后再通过 `close()` 关闭本地流。
    * - 目前尚不支持移除音频轨道，若想禁用音频，可通过调用 `muteAudio()` 实现。
    *
    * @example
    * ```javascript
    * // 关闭视频通话示例，对应addTrack接口的开启视频通话示例
    * const videoTrack = localStream.getVideoTrack();
    * if (videoTrack) {
    *   localStream.removeTrack(videoTrack).then(() => {
    *     // 关闭视频通话成功，停止videoTrack并释放摄像头资源
    *     videoTrack.stop();
    *   });
    * }
    * ```
    */
  def removeTrack(track: MediaStreamTrack): js.Promise[Unit] = js.native
  
  /**
    * 更换音频或视频轨道
    *
    * 调用该方法更换本地流中的同类型轨道，若本地流已经被发布，该方法会自动更新发往远端的音视频流，此时远端会收到 `Client.on('stream-updated')` 事件通知。
    *
    * 新的音视频轨道可以通过 `createStream()` | `getAudioTrack()` | `getVideoTrack()` 获取，
    * 或者直接通过 [getUserMedia()](https://developer.mozilla.org/zh-CN/docs/Web/API/MediaDevices/getUserMedia)、
    * [captureStream()](https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/captureStream) 获取。
    *
    * **注意**
    * - 如果需要更换媒体输入设备，推荐使用 `switchDevice()`。
    * - 在更换视频轨道时，要求视频分辨率跟 `setVideoProfile()` 设置保持一致，否则会抛出异常。
    * - 支持 Chrome 65+、Safari 浏览器。
    */
  def replaceTrack(track: MediaStreamTrack): js.Promise[Unit] = js.native
  
  /**
    * 设置音频 Profile,该方法需要在调用 `initialize()` 之前调用。
    * @param profile 音频 Profile, 默认 `standard`
    * - `standard` 采样率：48000，声道：单声道，码率：40kbps
    * - `high` 采样率：48000，声道：单声道，码率：128kbps
    */
  def setAudioProfile(profile: standard | high): Unit = js.native
  
  def setScreenProfile(profile: Profile): Unit = js.native
  /** 设置屏幕分享 Profile,该方法需要在调用 `initialize()` 之前调用。 */
  def setScreenProfile(profile: ScreenProfileString): Unit = js.native
  
  /**
    * 设置视频内容提示，主要用于提升在不同场景下的视频编码质量。该方法需要在调用 `initialize()` 成功之后调用。
    * @param hint 内容提示，参考 [MediaStreamTrack.contentHint](https://www.w3.org/TR/mst-content-hint/)
    * - `motion`：本地流视频内容为从摄像头采集的内容、电影或者视频游戏等。
    * - `detail`：本地视频内容为 ppt、带有文本内容、绘画或艺术线条的网页。一般屏幕分享默认使用这个提示。
    * - `text`：本地视频内容主要是含有文本的 ppt 或网页等。
    */
  def setVideoContentHint(hint: motion | detail | text): Unit = js.native
  
  def setVideoProfile(profile: Profile): Unit = js.native
  /**
    * 设置视频 Profile,该方法需要在调用 `initialize()` 之前调用。
    * @example
    * ```javascript
    * // 使用预定义Profile设置
    * localStream.setVideoProfile('480p');
    * localStream.initialize().then(() => {
    *   // local stream was initialized successfully.
    * });
    *
    * // 使用自定义视频Profile设置
    * localStream.setVideoProfile({
    *   width: 360, // 视频宽度
    *   height: 360, // 视频高度
    *   frameRate: 10, // 帧率
    *   bitrate: 400 // 比特率 kbps
    * });
    * localStream.initialize().then(() => {
    *   // local stream was initialized successfully.
    * });
    * ```
    */
  def setVideoProfile(profile: VideoProfileString): Unit = js.native
  
  /**
    * 切换本地流的媒体输入设备,该方法仅适用于从摄像头和麦克风采集音视频的本地流。
    *
    * 若该本地流已经被发布，该方法会自动更新发往远端的音视频流，此时，远端会收到 `Client.on('stream-updated')` 事件通知。
    * @param type 媒体类型
    * - `audio` 音频
    * - `video` 视频
    * @param deviceId 设备标识
    * - 摄像头设备标识通过 getCameras() 获取。在移动设备上，可以通过设置 deviceId 为 'user' 和 'environment' 来切换前置和后置摄像头。
    * - 麦克风设备标识通过 getMicrophones() 获取。
    */
  def switchDevice(`type`: audio | video, deviceId: String): js.Promise[Unit] = js.native
}
