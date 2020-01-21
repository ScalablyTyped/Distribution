package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.createAudioContext")
@js.native
object createAudioContext extends js.Object {
  /**
  	 * 创建并返回 audio 上下文 audioContext 对象
  	 * @param audioId audio标签id <audio  src="{{src}}" id="myAudio" ></audio>
  	 * @example
  	 * <!-- audio.wxml -->
  	 * <audio  src="{{src}}" id="myAudio" ></audio>
  	 * <button type="primary" bindtap="audioPlay">播放</button>
  	 * <button type="primary" bindtap="audioPause">暂停</button>
  	 * <button type="primary" bindtap="audio14">设置当前播放时间为14秒</button>
  	 * <button type="primary" bindtap="audioStart">回到开头</button>
  	 * // audio.js
  	 * Page({
  	 * onReady: function (e) {
  	 *   // 使用 wx.createAudioContext 获取 audio 上下文 context
  	 *   this.audioCtx = wx.createAudioContext('myAudio')
  	 *   this.audioCtx.setSrc('http://ws.stream.qqmusic.qq.com/
  	 * M500001VfvsJ21xFqb.mp3?guid=ffffffff82def4af4b12b3cd9337d5e7&
  	 * uin=346897220&vkey=6292F51E1E384E06DCBDC9AB7C49FD713D632D313AC4858BACB8DDD29067D3C601481D36E62053BF8DFEAF74C0A5CCFADD6471160CAF3E6A&
  	 * fromtag=46')
  	 *   this.audioCtx.play()
  	 * },
  	 * data: {
  	 *   src: ''
  	 * },
  	 * audioPlay: function () {
  	 *   this.audioCtx.play()
  	 * },
  	 * audioPause: function () {
  	 *   this.audioCtx.pause()
  	 * },
  	 * audio14: function () {
  	 *   this.audioCtx.seek(14)
  	 * },
  	 * audioStart: function () {
  	 *   this.audioCtx.seek(0)
  	 * }
  	 * })
  	 * @deprecated 1.6.0
  	 */
  def apply(audioId: String, instance: js.Any): AudioContext = js.native
}

