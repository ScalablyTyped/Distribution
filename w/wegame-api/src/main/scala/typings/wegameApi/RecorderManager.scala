package typings.wegameApi

import typings.wegameApi.anon.AudioSource
import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.FrameBuffer
import typings.wegameApi.anon.TempFilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderManager extends js.Object {
  /**
    * 监听录音错误事件
    */
  def onError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit = js.native
  /**
    * 监听已录制完指定帧大小的文件事件。如果设置了 frameSize，则会回调此事件。
    * @param callback.res.frameBuffer 录音分片数据
    * @param callback.res.isLastFrame 当前帧是否正常录音结束前的最后一帧
    */
  def onFrameRecorded(callback: js.Function1[/* res */ FrameBuffer, Unit]): Unit = js.native
  /**
    * 监听录音暂停事件
    */
  def onPause(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听录音继续事件
    */
  def onResume(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听录音开始事件
    */
  def onStart(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听录音结束事件
    * @param callback.res.tempFilePath 录音文件的临时路径
    */
  def onStop(callback: js.Function1[/* res */ TempFilePath, Unit]): Unit = js.native
  /**
    * 暂停录音
    */
  def pause(): Unit = js.native
  /**
    * 继续录音
    */
  def resume(): Unit = js.native
  /**
    * 开始录音
    */
  def start(param: AudioSource): Unit = js.native
  /**
    * 停止录音
    */
  def stop(): Unit = js.native
}

object RecorderManager {
  @scala.inline
  def apply(
    onError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    onFrameRecorded: js.Function1[/* res */ FrameBuffer, Unit] => Unit,
    onPause: js.Function0[Unit] => Unit,
    onResume: js.Function0[Unit] => Unit,
    onStart: js.Function0[Unit] => Unit,
    onStop: js.Function1[/* res */ TempFilePath, Unit] => Unit,
    pause: () => Unit,
    resume: () => Unit,
    start: AudioSource => Unit,
    stop: () => Unit
  ): RecorderManager = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onFrameRecorded = js.Any.fromFunction1(onFrameRecorded), onPause = js.Any.fromFunction1(onPause), onResume = js.Any.fromFunction1(onResume), onStart = js.Any.fromFunction1(onStart), onStop = js.Any.fromFunction1(onStop), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[RecorderManager]
  }
  @scala.inline
  implicit class RecorderManagerOps[Self <: RecorderManager] (val x: Self) extends AnyVal {
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
    def setOnError(value: js.Function1[/* res */ ErrMsg, Unit] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setOnFrameRecorded(value: js.Function1[/* res */ FrameBuffer, Unit] => Unit): Self = this.set("onFrameRecorded", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPause(value: js.Function0[Unit] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def setOnResume(value: js.Function0[Unit] => Unit): Self = this.set("onResume", js.Any.fromFunction1(value))
    @scala.inline
    def setOnStart(value: js.Function0[Unit] => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    @scala.inline
    def setOnStop(value: js.Function1[/* res */ TempFilePath, Unit] => Unit): Self = this.set("onStop", js.Any.fromFunction1(value))
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("resume", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: AudioSource => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

