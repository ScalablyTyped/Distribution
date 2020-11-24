package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InnerAudioContext 实例，可通过 wx.createInnerAudioContext 接口获取实例。
  */
@js.native
trait InnerAudioContext extends js.Object {
  
  /**
    * 是否自动播放
    */
  var autoplay: Boolean = js.native
  
  /**
    * 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲
    */
  val buffered: Double = js.native
  
  /**
    * 当前音频的播放位置，单位 s。只有在当前有合法的 src 时返回，时间不取整，保留小数点后 6 位
    */
  val currentTime: Double = js.native
  
  /**
    * 销毁当前实例
    */
  def destroy(): Unit = js.native
  
  /**
    * 当前音频的长度，单位 s。只有在当前有合法的 src 时返回
    */
  val duration: Double = js.native
  
  /**
    * 是否循环播放
    */
  var loop: Boolean = js.native
  
  /**
    * 是否遵循系统静音开关，当此参数为 false 时，即使用户打开了静音开关，也能继续发出声音
    */
  var obeyMuteSwitch: Boolean = js.native
  
  /**
    * 取消监听音频进入可以播放状态的事件
    */
  def offCanplay(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 取消监听音频自然播放至结束的事件
    */
  def offEnded(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 取消监听音频播放错误事件
    */
  def offError(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 取消监听音频暂停事件
    */
  def offPause(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 取消监听音频播放事件
    */
  def offPlay(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 取消监听音频完成跳转操作的事件
    */
  def offSeeked(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 取消监听音频进行跳转操作的事件
    */
  def offSeeking(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 取消监听音频停止事件
    */
  def offStop(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 取消监听音频播放进度更新事件
    */
  def offTimeUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 取消监听音频加载中事件，当音频因为数据不足，需要停下来加载时会触发
    */
  def offWaiting(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 监听音频进入可以播放状态的事件
    */
  def onCanplay(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 监听音频自然播放至结束的事件
    */
  def onEnded(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 监听音频播放错误事件
    */
  def onError(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 监听音频暂停事件
    */
  def onPause(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 监听音频播放事件
    */
  def onPlay(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 监听音频完成跳转操作的事件
    */
  def onSeeked(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 监听音频进行跳转操作的事件
    */
  def onSeeking(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 监听音频停止事件
    */
  def onStop(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 监听音频播放进度更新事件
    */
  def onTimeUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 监听音频加载中事件，当音频因为数据不足，需要停下来加载时会触发
    */
  def onWaiting(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 暂停。暂停后的音频再播放会从暂停处开始播放
    */
  def pause(): Unit = js.native
  
  /**
    * 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播放
    */
  var paused: Boolean = js.native
  
  /**
    * 播放
    */
  def play(): Unit = js.native
  
  /**
    * 跳转到指定位置，单位 s
    * @param position 跳转的时间
    */
  def seek(position: Double): Unit = js.native
  
  /**
    * 音频资源的地址
    */
  var src: String = js.native
  
  /**
    * 停止。停止后的音频再播放会从头开始播放。
    */
  def stop(): Unit = js.native
  
  /**
    * 音量。范围 0~1。
    */
  var volume: Double = js.native
}
object InnerAudioContext {
  
  @scala.inline
  def apply(
    autoplay: Boolean,
    buffered: Double,
    currentTime: Double,
    destroy: () => Unit,
    duration: Double,
    loop: Boolean,
    obeyMuteSwitch: Boolean,
    offCanplay: js.Function0[Unit] => Unit,
    offEnded: js.Function0[Unit] => Unit,
    offError: js.Function0[Unit] => Unit,
    offPause: js.Function0[Unit] => Unit,
    offPlay: js.Function0[Unit] => Unit,
    offSeeked: js.Function0[Unit] => Unit,
    offSeeking: js.Function0[Unit] => Unit,
    offStop: js.Function0[Unit] => Unit,
    offTimeUpdate: js.Function0[Unit] => Unit,
    offWaiting: js.Function0[Unit] => Unit,
    onCanplay: js.Function0[Unit] => Unit,
    onEnded: js.Function0[Unit] => Unit,
    onError: js.Function0[Unit] => Unit,
    onPause: js.Function0[Unit] => Unit,
    onPlay: js.Function0[Unit] => Unit,
    onSeeked: js.Function0[Unit] => Unit,
    onSeeking: js.Function0[Unit] => Unit,
    onStop: js.Function0[Unit] => Unit,
    onTimeUpdate: js.Function0[Unit] => Unit,
    onWaiting: js.Function0[Unit] => Unit,
    pause: () => Unit,
    paused: Boolean,
    play: () => Unit,
    seek: Double => Unit,
    src: String,
    stop: () => Unit,
    volume: Double
  ): InnerAudioContext = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], buffered = buffered.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), duration = duration.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], obeyMuteSwitch = obeyMuteSwitch.asInstanceOf[js.Any], offCanplay = js.Any.fromFunction1(offCanplay), offEnded = js.Any.fromFunction1(offEnded), offError = js.Any.fromFunction1(offError), offPause = js.Any.fromFunction1(offPause), offPlay = js.Any.fromFunction1(offPlay), offSeeked = js.Any.fromFunction1(offSeeked), offSeeking = js.Any.fromFunction1(offSeeking), offStop = js.Any.fromFunction1(offStop), offTimeUpdate = js.Any.fromFunction1(offTimeUpdate), offWaiting = js.Any.fromFunction1(offWaiting), onCanplay = js.Any.fromFunction1(onCanplay), onEnded = js.Any.fromFunction1(onEnded), onError = js.Any.fromFunction1(onError), onPause = js.Any.fromFunction1(onPause), onPlay = js.Any.fromFunction1(onPlay), onSeeked = js.Any.fromFunction1(onSeeked), onSeeking = js.Any.fromFunction1(onSeeking), onStop = js.Any.fromFunction1(onStop), onTimeUpdate = js.Any.fromFunction1(onTimeUpdate), onWaiting = js.Any.fromFunction1(onWaiting), pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), src = src.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerAudioContext]
  }
  
  @scala.inline
  implicit class InnerAudioContextOps[Self <: InnerAudioContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffered(value: Double): Self = this.set("buffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObeyMuteSwitch(value: Boolean): Self = this.set("obeyMuteSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffCanplay(value: js.Function0[Unit] => Unit): Self = this.set("offCanplay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffEnded(value: js.Function0[Unit] => Unit): Self = this.set("offEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffError(value: js.Function0[Unit] => Unit): Self = this.set("offError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffPause(value: js.Function0[Unit] => Unit): Self = this.set("offPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffPlay(value: js.Function0[Unit] => Unit): Self = this.set("offPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffSeeked(value: js.Function0[Unit] => Unit): Self = this.set("offSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffSeeking(value: js.Function0[Unit] => Unit): Self = this.set("offSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffStop(value: js.Function0[Unit] => Unit): Self = this.set("offStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffTimeUpdate(value: js.Function0[Unit] => Unit): Self = this.set("offTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffWaiting(value: js.Function0[Unit] => Unit): Self = this.set("offWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanplay(value: js.Function0[Unit] => Unit): Self = this.set("onCanplay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEnded(value: js.Function0[Unit] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnError(value: js.Function0[Unit] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPause(value: js.Function0[Unit] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlay(value: js.Function0[Unit] => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeeked(value: js.Function0[Unit] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeeking(value: js.Function0[Unit] => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStop(value: js.Function0[Unit] => Unit): Self = this.set("onStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTimeUpdate(value: js.Function0[Unit] => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWaiting(value: js.Function0[Unit] => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
}
