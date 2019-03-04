package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerAudioContext extends js.Object {
  /** 是否自动开始播放，默认 false */
  var autoplay: scala.Boolean
  /**  音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲 */
  val buffered: scala.Double
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回，时间不取整，保留小数点后 6  */
  val currentTime: scala.Double
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返 */
  val duration: scala.Double
  /** 是否循环播放，默认 false */
  var loop: scala.Boolean
  /** 是否遵循系统静音开关，当此参数为 false 时，即使用户打开了静音开关，也能继续发出声音，默认值 true */
  var obeyMuteSwitch: scala.Boolean
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播 */
  val paused: scala.Boolean
  /** 音频的数据链接，用于直接播放。 */
  var src: java.lang.String
  /** 开始播放的位置（单位：s），默认 0 */
  var startTime: scala.Double
  /** 销毁当前实例 */
  def destroy(): scala.Unit
  /** 音频进入可以播放状态，但不保证后面可以流畅播放 */
  def onCanplay(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频自然播放结束事件 */
  def onEnded(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频播放错误事件 */
  def onError(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频暂停事件 */
  def onPause(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频播放事件 */
  def onPlay(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频完成 seek 操作事件 */
  def onSeeked(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频进行 seek 操作事件 */
  def onSeeking(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频停止事件 */
  def onStop(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频播放进度更新事件 */
  def onTimeUpdate(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频加载中事件，当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 暂停 */
  def pause(): scala.Unit
  /** 播放 */
  def play(): scala.Unit
  /** 跳转到指定位置，单位 s */
  def seek(position: scala.Double): scala.Unit
  /** 停止 */
  def stop(): scala.Unit
}

object InnerAudioContext {
  @scala.inline
  def apply(
    autoplay: scala.Boolean,
    buffered: scala.Double,
    currentTime: scala.Double,
    destroy: js.Function0[scala.Unit],
    duration: scala.Double,
    loop: scala.Boolean,
    obeyMuteSwitch: scala.Boolean,
    onCanplay: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onEnded: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onError: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onPause: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onPlay: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onSeeked: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onSeeking: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onStop: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onTimeUpdate: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onWaiting: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    pause: js.Function0[scala.Unit],
    paused: scala.Boolean,
    play: js.Function0[scala.Unit],
    seek: js.Function1[scala.Double, scala.Unit],
    src: java.lang.String,
    startTime: scala.Double,
    stop: js.Function0[scala.Unit]
  ): InnerAudioContext = {
    val __obj = js.Dynamic.literal(autoplay = autoplay, buffered = buffered, currentTime = currentTime, destroy = destroy, duration = duration, loop = loop, obeyMuteSwitch = obeyMuteSwitch, onCanplay = onCanplay, onEnded = onEnded, onError = onError, onPause = onPause, onPlay = onPlay, onSeeked = onSeeked, onSeeking = onSeeking, onStop = onStop, onTimeUpdate = onTimeUpdate, onWaiting = onWaiting, pause = pause, paused = paused, play = play, seek = seek, src = src, startTime = startTime, stop = stop)
  
    __obj.asInstanceOf[InnerAudioContext]
  }
}

