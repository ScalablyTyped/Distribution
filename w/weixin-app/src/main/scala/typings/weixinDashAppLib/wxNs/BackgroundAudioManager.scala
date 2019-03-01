package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundAudioManager extends js.Object {
  /** 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲。 是 */
  var buffered: scala.Double
  /** 封面图url，用于做原生音频播放器背景图。原生音频播放器中的分享功能，分享出去的卡片配图及背景也将使用该图。 */
  var coverImgUrl: java.lang.String
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回 */
  val currentTime: scala.Double
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返回 */
  val duration: scala.Double
  /** 专辑名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var epname: java.lang.String
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播放 */
  val paused: scala.Boolean
  /** 歌手名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var singer: java.lang.String
  /** 音频的数据源，默认为空字符串，当设置了新的 src 时，会自动开始播放 ，目前支持的格式有 m4a, aac, mp3, wav */
  var src: java.lang.String
  /** 音频开始播放的位置（单位：s） */
  var startTime: scala.Double
  /** 音频标题，用于做原生音频播放器音频标题。原生音频播放器中的分享功能，分享出去的卡片标题，也将使用该值。 */
  var title: java.lang.String
  /** 页面链接，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var webUrl: java.lang.String
  /** 背景音频进入可以播放状态，但不保证后面可以流畅播放 */
  def onCanplay(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 背景音频自然播放结束事件 */
  def onEnded(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 背景音频播放错误事件 */
  def onError(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 用户在系统音乐播放面板点击下一曲事件（iOS only） */
  def onNext(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 背景音频暂停事件 */
  def onPause(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 背景音频播放事件 */
  def onPlay(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 用户在系统音乐播放面板点击上一曲事件（iOS only） */
  def onPrev(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 背景音频停止事件 */
  def onStop(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 背景音频播放进度更新事件 */
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

object BackgroundAudioManager {
  @scala.inline
  def apply(
    buffered: scala.Double,
    coverImgUrl: java.lang.String,
    currentTime: scala.Double,
    duration: scala.Double,
    epname: java.lang.String,
    onCanplay: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onEnded: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onError: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onNext: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onPause: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onPlay: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onPrev: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onStop: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onTimeUpdate: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onWaiting: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    pause: js.Function0[scala.Unit],
    paused: scala.Boolean,
    play: js.Function0[scala.Unit],
    seek: js.Function1[scala.Double, scala.Unit],
    singer: java.lang.String,
    src: java.lang.String,
    startTime: scala.Double,
    stop: js.Function0[scala.Unit],
    title: java.lang.String,
    webUrl: java.lang.String
  ): BackgroundAudioManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffered")(buffered)
    __obj.updateDynamic("coverImgUrl")(coverImgUrl)
    __obj.updateDynamic("currentTime")(currentTime)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("epname")(epname)
    __obj.updateDynamic("onCanplay")(onCanplay)
    __obj.updateDynamic("onEnded")(onEnded)
    __obj.updateDynamic("onError")(onError)
    __obj.updateDynamic("onNext")(onNext)
    __obj.updateDynamic("onPause")(onPause)
    __obj.updateDynamic("onPlay")(onPlay)
    __obj.updateDynamic("onPrev")(onPrev)
    __obj.updateDynamic("onStop")(onStop)
    __obj.updateDynamic("onTimeUpdate")(onTimeUpdate)
    __obj.updateDynamic("onWaiting")(onWaiting)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("paused")(paused)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("seek")(seek)
    __obj.updateDynamic("singer")(singer)
    __obj.updateDynamic("src")(src)
    __obj.updateDynamic("startTime")(startTime)
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[BackgroundAudioManager]
  }
}

