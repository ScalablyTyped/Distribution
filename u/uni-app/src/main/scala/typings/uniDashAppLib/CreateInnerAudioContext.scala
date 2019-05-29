package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInnerAudioContext extends js.Object {
  /**
    * 是否自动开始播放，默认 false
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.native
  /**
    * 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲
    */
  var buffered: js.UndefOr[scala.Double] = js.native
  /**
    * 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回
    */
  var currentTime: js.UndefOr[scala.Double] = js.native
  /**
    * 当前音频的长度（单位：s），只有在当前有合法的 src 时返回
    */
  var duration: js.UndefOr[scala.Double] = js.native
  /**
    * 是否循环播放，默认 false
    */
  var loop: js.UndefOr[scala.Boolean] = js.native
  /**
    * 是否遵循系统静音开关，当此参数为 false 时，即使用户打开了静音开关，也能继续发出声音，默认值 true
    */
  var obeyMuteSwitch: js.UndefOr[scala.Boolean] = js.native
  /**
    * 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播放
    */
  var paused: js.UndefOr[scala.Boolean] = js.native
  /**
    * 音频的数据链接，用于直接播放。
    */
  var src: js.UndefOr[java.lang.String] = js.native
  /**
    * 音频开始播放的位置（单位：s）
    */
  var startTime: js.UndefOr[scala.Double] = js.native
  /**
    * 音量。范围 0~1。
    */
  var volume: js.UndefOr[scala.Double] = js.native
  /**
    * 销毁当前实例
    */
  def destroy(): scala.Unit = js.native
  /**
    * 取消监听 onCanplay 事件
    */
  def offCanplay(): scala.Unit = js.native
  def offCanplay(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 取消监听 onEnded 事件
    */
  def offEnded(): scala.Unit = js.native
  def offEnded(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 取消监听 onWaiting 事件
    */
  def offError(): scala.Unit = js.native
  def offError(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 取消监听 onPause 事件
    */
  def offPause(): scala.Unit = js.native
  def offPause(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 取消监听 onPlay 事件
    */
  def offPlay(): scala.Unit = js.native
  def offPlay(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 取消监听 onSeeked 事件
    */
  def offSeeked(): scala.Unit = js.native
  def offSeeked(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 取消监听 onSeeking 事件
    */
  def offSeeking(): scala.Unit = js.native
  def offSeeking(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 取消监听 onStop 事件
    */
  def offStop(): scala.Unit = js.native
  def offStop(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 取消监听 onTimeUpdate 事件
    */
  def offTimeUpdate(): scala.Unit = js.native
  def offTimeUpdate(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 取消监听 onWaiting 事件
    */
  def offWaiting(): scala.Unit = js.native
  def offWaiting(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 音频进入可以播放状态，但不保证后面可以流畅播放
    */
  def onCanplay(): scala.Unit = js.native
  def onCanplay(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 音频自然播放结束事件
    */
  def onEnded(): scala.Unit = js.native
  def onEnded(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 音频播放错误事件
    */
  def onError(): scala.Unit = js.native
  def onError(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 音频暂停事件
    */
  def onPause(): scala.Unit = js.native
  def onPause(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 音频播放事件
    */
  def onPlay(): scala.Unit = js.native
  def onPlay(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 音频完成 seek 操作事件
    */
  def onSeeked(): scala.Unit = js.native
  def onSeeked(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 音频进行 seek 操作事件
    */
  def onSeeking(): scala.Unit = js.native
  def onSeeking(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 音频停止事件
    */
  def onStop(): scala.Unit = js.native
  def onStop(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 音频播放进度更新事件
    */
  def onTimeUpdate(): scala.Unit = js.native
  def onTimeUpdate(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 音频加载中事件，当音频因为数据不足，需要停下来加载时会触发
    */
  def onWaiting(): scala.Unit = js.native
  def onWaiting(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 暂停
    */
  def pause(): scala.Unit = js.native
  /**
    * 播放
    */
  def play(): scala.Unit = js.native
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): scala.Unit = js.native
  /**
    * 停止
    */
  def stop(): scala.Unit = js.native
}

