package typings.wegameApi.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InnerAudioContext 实例，可通过 wx.createInnerAudioContext 接口获取实例。
  */
@JSGlobal("InnerAudioContext")
@js.native
class InnerAudioContext ()
  extends typings.wegameApi.InnerAudioContext {
  /**
    * 是否自动播放
    */
  /* CompleteClass */
  override var autoplay: Boolean = js.native
  /**
    * 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲
    */
  /* CompleteClass */
  override val buffered: Double = js.native
  /**
    * 当前音频的播放位置，单位 s。只有在当前有合法的 src 时返回，时间不取整，保留小数点后 6 位
    */
  /* CompleteClass */
  override val currentTime: Double = js.native
  /**
    * 当前音频的长度，单位 s。只有在当前有合法的 src 时返回
    */
  /* CompleteClass */
  override val duration: Double = js.native
  /**
    * 是否循环播放
    */
  /* CompleteClass */
  override var loop: Boolean = js.native
  /**
    * 是否遵循系统静音开关，当此参数为 false 时，即使用户打开了静音开关，也能继续发出声音
    */
  /* CompleteClass */
  override var obeyMuteSwitch: Boolean = js.native
  /**
    * 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播放
    */
  /* CompleteClass */
  override var paused: Boolean = js.native
  /**
    * 音频资源的地址
    */
  /* CompleteClass */
  override var src: String = js.native
  /**
    * 音量。范围 0~1。
    */
  /* CompleteClass */
  override var volume: Double = js.native
  /**
    * 销毁当前实例
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * 取消监听音频进入可以播放状态的事件
    */
  /* CompleteClass */
  override def offCanplay(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听音频自然播放至结束的事件
    */
  /* CompleteClass */
  override def offEnded(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听音频播放错误事件
    */
  /* CompleteClass */
  override def offError(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听音频暂停事件
    */
  /* CompleteClass */
  override def offPause(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听音频播放事件
    */
  /* CompleteClass */
  override def offPlay(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听音频完成跳转操作的事件
    */
  /* CompleteClass */
  override def offSeeked(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听音频进行跳转操作的事件
    */
  /* CompleteClass */
  override def offSeeking(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听音频停止事件
    */
  /* CompleteClass */
  override def offStop(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听音频播放进度更新事件
    */
  /* CompleteClass */
  override def offTimeUpdate(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 取消监听音频加载中事件，当音频因为数据不足，需要停下来加载时会触发
    */
  /* CompleteClass */
  override def offWaiting(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听音频进入可以播放状态的事件
    */
  /* CompleteClass */
  override def onCanplay(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听音频自然播放至结束的事件
    */
  /* CompleteClass */
  override def onEnded(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听音频播放错误事件
    */
  /* CompleteClass */
  override def onError(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听音频暂停事件
    */
  /* CompleteClass */
  override def onPause(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听音频播放事件
    */
  /* CompleteClass */
  override def onPlay(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听音频完成跳转操作的事件
    */
  /* CompleteClass */
  override def onSeeked(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听音频进行跳转操作的事件
    */
  /* CompleteClass */
  override def onSeeking(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听音频停止事件
    */
  /* CompleteClass */
  override def onStop(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听音频播放进度更新事件
    */
  /* CompleteClass */
  override def onTimeUpdate(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听音频加载中事件，当音频因为数据不足，需要停下来加载时会触发
    */
  /* CompleteClass */
  override def onWaiting(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 暂停。暂停后的音频再播放会从暂停处开始播放
    */
  /* CompleteClass */
  override def pause(): Unit = js.native
  /**
    * 播放
    */
  /* CompleteClass */
  override def play(): Unit = js.native
  /**
    * 跳转到指定位置，单位 s
    * @param position 跳转的时间
    */
  /* CompleteClass */
  override def seek(position: Double): Unit = js.native
  /**
    * 停止。停止后的音频再播放会从头开始播放。
    */
  /* CompleteClass */
  override def stop(): Unit = js.native
}

