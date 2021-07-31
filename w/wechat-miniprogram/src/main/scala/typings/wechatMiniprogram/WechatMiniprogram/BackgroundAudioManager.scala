package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** BackgroundAudioManager 实例，可通过 [wx.getBackgroundAudioManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/wx.getBackgroundAudioManager.html) 获取。
*
* **示例代码**
*
*
* ```js
const backgroundAudioManager = wx.getBackgroundAudioManager()
backgroundAudioManager.title = '此时此刻'
backgroundAudioManager.epname = '此时此刻'
backgroundAudioManager.singer = '许巍'
backgroundAudioManager.coverImgUrl = 'http://y.gtimg.cn/music/photo_new/T002R300x300M000003rsKF44GyaSk.jpg?max_age=2592000'
// 设置了 src 之后会自动播放
backgroundAudioManager.src = 'http://ws.stream.qqmusic.qq.com/M500001VfvsJ21xFqb.mp3?guid=ffffffff82def4af4b12b3cd9337d5e7&uin=346897220&vkey=6292F51E1E384E061FF02C31F716658E5C81F5594D561F2E88B854E81CAAB7806D5E4F103E55D33C16F3FAC506D1AB172DE8600B37E43FAD&fromtag=46'
``` */
trait BackgroundAudioManager extends StObject {
  
  /** 音频已缓冲的时间，仅保证当前播放时间点到此时间点内容已缓冲。（只读） */
  var buffered: Double
  
  /** 封面图 URL，用于做原生音频播放器背景图。原生音频播放器中的分享功能，分享出去的卡片配图及背景也将使用该图。 */
  var coverImgUrl: String
  
  /** 当前音频的播放位置（单位：s），只有在有合法 src 时返回。（只读） */
  var currentTime: Double
  
  /** 当前音频的长度（单位：s），只有在有合法 src 时返回。（只读） */
  var duration: Double
  
  /** 专辑名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值。 */
  var epname: String
  
  /** [BackgroundAudioManager.onCanplay(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.onCanplay.html)
    *
    * 监听背景音频进入可播放状态事件。 但不保证后面可以流畅播放 */
  def onCanplay(/** 背景音频进入可播放状态事件的回调函数 */
  callback: OnCanplayCallback): Unit
  
  /** [BackgroundAudioManager.onEnded(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.onEnded.html)
    *
    * 监听背景音频自然播放结束事件 */
  def onEnded(/** 背景音频自然播放结束事件的回调函数 */
  callback: OnEndedCallback): Unit
  
  /** [BackgroundAudioManager.onError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.onError.html)
    *
    * 监听背景音频播放错误事件 */
  def onError(/** 背景音频播放错误事件的回调函数 */
  callback: BackgroundAudioManagerOnErrorCallback): Unit
  
  /** [BackgroundAudioManager.onNext(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.onNext.html)
    *
    * 监听用户在系统音乐播放面板点击下一曲事件（仅iOS） */
  def onNext(/** 用户在系统音乐播放面板点击下一曲事件的回调函数 */
  callback: OnNextCallback): Unit
  
  /** [BackgroundAudioManager.onPause(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.onPause.html)
    *
    * 监听背景音频暂停事件 */
  def onPause(/** 背景音频暂停事件的回调函数 */
  callback: OnPauseCallback): Unit
  
  /** [BackgroundAudioManager.onPlay(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.onPlay.html)
    *
    * 监听背景音频播放事件 */
  def onPlay(/** 背景音频播放事件的回调函数 */
  callback: OnPlayCallback): Unit
  
  /** [BackgroundAudioManager.onPrev(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.onPrev.html)
    *
    * 监听用户在系统音乐播放面板点击上一曲事件（仅iOS） */
  def onPrev(/** 用户在系统音乐播放面板点击上一曲事件的回调函数 */
  callback: OnPrevCallback): Unit
  
  /** [BackgroundAudioManager.onSeeked(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.onSeeked.html)
    *
    * 监听背景音频完成跳转操作事件 */
  def onSeeked(/** 背景音频完成跳转操作事件的回调函数 */
  callback: OnSeekedCallback): Unit
  
  /** [BackgroundAudioManager.onSeeking(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.onSeeking.html)
    *
    * 监听背景音频开始跳转操作事件 */
  def onSeeking(/** 背景音频开始跳转操作事件的回调函数 */
  callback: OnSeekingCallback): Unit
  
  /** [BackgroundAudioManager.onStop(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.onStop.html)
    *
    * 监听背景音频停止事件 */
  def onStop(/** 背景音频停止事件的回调函数 */
  callback: InnerAudioContextOnStopCallback): Unit
  
  /** [BackgroundAudioManager.onTimeUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.onTimeUpdate.html)
    *
    * 监听背景音频播放进度更新事件，只有小程序在前台时会回调。 */
  def onTimeUpdate(/** 背景音频播放进度更新事件的回调函数 */
  callback: OnTimeUpdateCallback): Unit
  
  /** [BackgroundAudioManager.onWaiting(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.onWaiting.html)
    *
    * 监听音频加载中事件。当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(/** 音频加载中事件的回调函数 */
  callback: OnWaitingCallback): Unit
  
  /** [BackgroundAudioManager.pause()](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.pause.html)
    *
    * 暂停音乐 */
  def pause(): Unit
  
  /** 当前是否暂停或停止。（只读） */
  var paused: Boolean
  
  /** [BackgroundAudioManager.play()](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.play.html)
    *
    * 播放音乐 */
  def play(): Unit
  
  /** 播放速度。范围 0.5-2.0，默认为 1。（Android 需要 6 及以上版本）
    *
    * 最低基础库： `2.11.0` */
  var playbackRate: Double
  
  /** 音频协议。默认值为 'http'，设置 'hls' 可以支持播放 HLS 协议的直播音频。
    *
    * 最低基础库： `1.9.94` */
  var protocol: String
  
  /** [BackgroundAudioManager.seek(number currentTime)](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.seek.html)
    *
    * 跳转到指定位置 */
  def seek(/** 跳转的位置，单位 s。精确到小数点后 3 位，即支持 ms 级别精确度 */
  currentTime: Double): Unit
  
  /** 歌手名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值。 */
  var singer: String
  
  /** 音频的数据源（[2.2.3](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 开始支持云文件ID）。默认为空字符串，**当设置了新的 src 时，会自动开始播放**，目前支持的格式有 m4a, aac, mp3, wav。 */
  var src: String
  
  /** 音频开始播放的位置（单位：s）。 */
  var startTime: Double
  
  /** [BackgroundAudioManager.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.stop.html)
    *
    * 停止音乐 */
  def stop(): Unit
  
  /** 音频标题，用于原生音频播放器音频标题（必填）。原生音频播放器中的分享功能，分享出去的卡片标题，也将使用该值。 */
  var title: String
  
  /** 页面链接，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值。 */
  var webUrl: String
}
object BackgroundAudioManager {
  
  @scala.inline
  def apply(
    buffered: Double,
    coverImgUrl: String,
    currentTime: Double,
    duration: Double,
    epname: String,
    onCanplay: OnCanplayCallback => Unit,
    onEnded: OnEndedCallback => Unit,
    onError: BackgroundAudioManagerOnErrorCallback => Unit,
    onNext: OnNextCallback => Unit,
    onPause: OnPauseCallback => Unit,
    onPlay: OnPlayCallback => Unit,
    onPrev: OnPrevCallback => Unit,
    onSeeked: OnSeekedCallback => Unit,
    onSeeking: OnSeekingCallback => Unit,
    onStop: InnerAudioContextOnStopCallback => Unit,
    onTimeUpdate: OnTimeUpdateCallback => Unit,
    onWaiting: OnWaitingCallback => Unit,
    pause: () => Unit,
    paused: Boolean,
    play: () => Unit,
    playbackRate: Double,
    protocol: String,
    seek: Double => Unit,
    singer: String,
    src: String,
    startTime: Double,
    stop: () => Unit,
    title: String,
    webUrl: String
  ): BackgroundAudioManager = {
    val __obj = js.Dynamic.literal(buffered = buffered.asInstanceOf[js.Any], coverImgUrl = coverImgUrl.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], epname = epname.asInstanceOf[js.Any], onCanplay = js.Any.fromFunction1(onCanplay), onEnded = js.Any.fromFunction1(onEnded), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onPause = js.Any.fromFunction1(onPause), onPlay = js.Any.fromFunction1(onPlay), onPrev = js.Any.fromFunction1(onPrev), onSeeked = js.Any.fromFunction1(onSeeked), onSeeking = js.Any.fromFunction1(onSeeking), onStop = js.Any.fromFunction1(onStop), onTimeUpdate = js.Any.fromFunction1(onTimeUpdate), onWaiting = js.Any.fromFunction1(onWaiting), pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), playbackRate = playbackRate.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], seek = js.Any.fromFunction1(seek), singer = singer.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), title = title.asInstanceOf[js.Any], webUrl = webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundAudioManager]
  }
  
  @scala.inline
  implicit class BackgroundAudioManagerMutableBuilder[Self <: BackgroundAudioManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffered(value: Double): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverImgUrl(value: String): Self = StObject.set(x, "coverImgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpname(value: String): Self = StObject.set(x, "epname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCanplay(value: OnCanplayCallback => Unit): Self = StObject.set(x, "onCanplay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEnded(value: OnEndedCallback => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnError(value: BackgroundAudioManagerOnErrorCallback => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNext(value: OnNextCallback => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPause(value: OnPauseCallback => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlay(value: OnPlayCallback => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPrev(value: OnPrevCallback => Unit): Self = StObject.set(x, "onPrev", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeeked(value: OnSeekedCallback => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeeking(value: OnSeekingCallback => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStop(value: InnerAudioContextOnStopCallback => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTimeUpdate(value: OnTimeUpdateCallback => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWaiting(value: OnWaitingCallback => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSinger(value: String): Self = StObject.set(x, "singer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
  }
}
