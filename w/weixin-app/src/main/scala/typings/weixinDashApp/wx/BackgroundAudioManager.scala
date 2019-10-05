package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundAudioManager extends js.Object {
  /** 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲。 是 */
  var buffered: Double
  /** 封面图url，用于做原生音频播放器背景图。原生音频播放器中的分享功能，分享出去的卡片配图及背景也将使用该图。 */
  var coverImgUrl: String
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回 */
  val currentTime: Double
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返回 */
  val duration: Double
  /** 专辑名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var epname: String
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播放 */
  val paused: Boolean
  /** 歌手名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var singer: String
  /** 音频的数据源，默认为空字符串，当设置了新的 src 时，会自动开始播放 ，目前支持的格式有 m4a, aac, mp3, wav */
  var src: String
  /** 音频开始播放的位置（单位：s） */
  var startTime: Double
  /** 音频标题，用于做原生音频播放器音频标题。原生音频播放器中的分享功能，分享出去的卡片标题，也将使用该值。 */
  var title: String
  /** 页面链接，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var webUrl: String
  /** 背景音频进入可以播放状态，但不保证后面可以流畅播放 */
  def onCanplay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 背景音频自然播放结束事件 */
  def onEnded(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 背景音频播放错误事件 */
  def onError(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 用户在系统音乐播放面板点击下一曲事件（iOS only） */
  def onNext(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 背景音频暂停事件 */
  def onPause(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 背景音频播放事件 */
  def onPlay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 用户在系统音乐播放面板点击上一曲事件（iOS only） */
  def onPrev(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 背景音频停止事件 */
  def onStop(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 背景音频播放进度更新事件 */
  def onTimeUpdate(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频加载中事件，当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 暂停 */
  def pause(): Unit
  /** 播放 */
  def play(): Unit
  /** 跳转到指定位置，单位 s */
  def seek(position: Double): Unit
  /** 停止 */
  def stop(): Unit
}

object BackgroundAudioManager {
  @scala.inline
  def apply(
    buffered: Double,
    coverImgUrl: String,
    currentTime: Double,
    duration: Double,
    epname: String,
    onCanplay: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onEnded: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onError: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onNext: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onPause: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onPlay: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onPrev: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onStop: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onTimeUpdate: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onWaiting: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    pause: () => Unit,
    paused: Boolean,
    play: () => Unit,
    seek: Double => Unit,
    singer: String,
    src: String,
    startTime: Double,
    stop: () => Unit,
    title: String,
    webUrl: String
  ): BackgroundAudioManager = {
    val __obj = js.Dynamic.literal(buffered = buffered, coverImgUrl = coverImgUrl, currentTime = currentTime, duration = duration, epname = epname, onCanplay = js.Any.fromFunction1(onCanplay), onEnded = js.Any.fromFunction1(onEnded), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onPause = js.Any.fromFunction1(onPause), onPlay = js.Any.fromFunction1(onPlay), onPrev = js.Any.fromFunction1(onPrev), onStop = js.Any.fromFunction1(onStop), onTimeUpdate = js.Any.fromFunction1(onTimeUpdate), onWaiting = js.Any.fromFunction1(onWaiting), pause = js.Any.fromFunction0(pause), paused = paused, play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), singer = singer, src = src, startTime = startTime, stop = js.Any.fromFunction0(stop), title = title, webUrl = webUrl)
  
    __obj.asInstanceOf[BackgroundAudioManager]
  }
}

