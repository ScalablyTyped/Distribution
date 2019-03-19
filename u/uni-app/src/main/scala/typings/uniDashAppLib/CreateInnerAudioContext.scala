package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInnerAudioContext extends js.Object {
  /**
    * 是否自动开始播放，默认 false
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲
    */
  var buffered: js.UndefOr[scala.Double] = js.undefined
  /**
    * 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回
    */
  var currentTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * 当前音频的长度（单位：s），只有在当前有合法的 src 时返回
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * 是否循环播放，默认 false
    */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否遵循系统静音开关，当此参数为 false 时，即使用户打开了静音开关，也能继续发出声音，默认值 true
    */
  var obeyMuteSwitch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播放
    */
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 音频的数据链接，用于直接播放。
    */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 音频开始播放的位置（单位：s）
    */
  var startTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * 音量。范围 0~1。
    */
  var volume: js.UndefOr[scala.Double] = js.undefined
  /**
    * 销毁当前实例
    */
  def destroy(): scala.Unit
  /**
    * 取消监听 onCanplay 事件
    */
  def offCanplay(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 取消监听 onEnded 事件
    */
  def offEnded(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 取消监听 onWaiting 事件
    */
  def offError(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 取消监听 onPause 事件
    */
  def offPause(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 取消监听 onPlay 事件
    */
  def offPlay(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 取消监听 onSeeked 事件
    */
  def offSeeked(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 取消监听 onSeeking 事件
    */
  def offSeeking(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 取消监听 onStop 事件
    */
  def offStop(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 取消监听 onTimeUpdate 事件
    */
  def offTimeUpdate(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 取消监听 onWaiting 事件
    */
  def offWaiting(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 音频进入可以播放状态，但不保证后面可以流畅播放
    */
  def onCanplay(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 音频自然播放结束事件
    */
  def onEnded(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 音频播放错误事件
    */
  def onError(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 音频暂停事件
    */
  def onPause(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 音频播放事件
    */
  def onPlay(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 音频完成 seek 操作事件
    */
  def onSeeked(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 音频进行 seek 操作事件
    */
  def onSeeking(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 音频停止事件
    */
  def onStop(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 音频播放进度更新事件
    */
  def onTimeUpdate(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 音频加载中事件，当音频因为数据不足，需要停下来加载时会触发
    */
  def onWaiting(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 暂停
    */
  def pause(): scala.Unit
  /**
    * 播放
    */
  def play(): scala.Unit
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): scala.Unit
  /**
    * 停止
    */
  def stop(): scala.Unit
}

object CreateInnerAudioContext {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    offCanplay: js.Function0[scala.Unit] => scala.Unit,
    offEnded: js.Function0[scala.Unit] => scala.Unit,
    offError: js.Function0[scala.Unit] => scala.Unit,
    offPause: js.Function0[scala.Unit] => scala.Unit,
    offPlay: js.Function0[scala.Unit] => scala.Unit,
    offSeeked: js.Function0[scala.Unit] => scala.Unit,
    offSeeking: js.Function0[scala.Unit] => scala.Unit,
    offStop: js.Function0[scala.Unit] => scala.Unit,
    offTimeUpdate: js.Function0[scala.Unit] => scala.Unit,
    offWaiting: js.Function0[scala.Unit] => scala.Unit,
    onCanplay: js.Function0[scala.Unit] => scala.Unit,
    onEnded: js.Function0[scala.Unit] => scala.Unit,
    onError: js.Function0[scala.Unit] => scala.Unit,
    onPause: js.Function0[scala.Unit] => scala.Unit,
    onPlay: js.Function0[scala.Unit] => scala.Unit,
    onSeeked: js.Function0[scala.Unit] => scala.Unit,
    onSeeking: js.Function0[scala.Unit] => scala.Unit,
    onStop: js.Function0[scala.Unit] => scala.Unit,
    onTimeUpdate: js.Function0[scala.Unit] => scala.Unit,
    onWaiting: js.Function0[scala.Unit] => scala.Unit,
    pause: () => scala.Unit,
    play: () => scala.Unit,
    seek: () => scala.Unit,
    stop: () => scala.Unit,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    buffered: scala.Int | scala.Double = null,
    currentTime: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    obeyMuteSwitch: js.UndefOr[scala.Boolean] = js.undefined,
    paused: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String = null,
    startTime: scala.Int | scala.Double = null,
    volume: scala.Int | scala.Double = null
  ): CreateInnerAudioContext = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), offCanplay = js.Any.fromFunction1(offCanplay), offEnded = js.Any.fromFunction1(offEnded), offError = js.Any.fromFunction1(offError), offPause = js.Any.fromFunction1(offPause), offPlay = js.Any.fromFunction1(offPlay), offSeeked = js.Any.fromFunction1(offSeeked), offSeeking = js.Any.fromFunction1(offSeeking), offStop = js.Any.fromFunction1(offStop), offTimeUpdate = js.Any.fromFunction1(offTimeUpdate), offWaiting = js.Any.fromFunction1(offWaiting), onCanplay = js.Any.fromFunction1(onCanplay), onEnded = js.Any.fromFunction1(onEnded), onError = js.Any.fromFunction1(onError), onPause = js.Any.fromFunction1(onPause), onPlay = js.Any.fromFunction1(onPlay), onSeeked = js.Any.fromFunction1(onSeeked), onSeeking = js.Any.fromFunction1(onSeeking), onStop = js.Any.fromFunction1(onStop), onTimeUpdate = js.Any.fromFunction1(onTimeUpdate), onWaiting = js.Any.fromFunction1(onWaiting), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction0(seek), stop = js.Any.fromFunction0(stop))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (buffered != null) __obj.updateDynamic("buffered")(buffered.asInstanceOf[js.Any])
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(obeyMuteSwitch)) __obj.updateDynamic("obeyMuteSwitch")(obeyMuteSwitch)
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (src != null) __obj.updateDynamic("src")(src)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInnerAudioContext]
  }
}

