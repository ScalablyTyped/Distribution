package typings.wegameApi.global

import typings.wegameApi.anon.AudioSource
import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.FrameBuffer
import typings.wegameApi.anon.TempFilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RecorderManager")
@js.native
class RecorderManager ()
  extends typings.wegameApi.RecorderManager {
  /**
    * 监听录音错误事件
    */
  /* CompleteClass */
  override def onError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit = js.native
  /**
    * 监听已录制完指定帧大小的文件事件。如果设置了 frameSize，则会回调此事件。
    * @param callback.res.frameBuffer 录音分片数据
    * @param callback.res.isLastFrame 当前帧是否正常录音结束前的最后一帧
    */
  /* CompleteClass */
  override def onFrameRecorded(callback: js.Function1[/* res */ FrameBuffer, Unit]): Unit = js.native
  /**
    * 监听录音暂停事件
    */
  /* CompleteClass */
  override def onPause(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听录音继续事件
    */
  /* CompleteClass */
  override def onResume(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听录音开始事件
    */
  /* CompleteClass */
  override def onStart(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听录音结束事件
    * @param callback.res.tempFilePath 录音文件的临时路径
    */
  /* CompleteClass */
  override def onStop(callback: js.Function1[/* res */ TempFilePath, Unit]): Unit = js.native
  /**
    * 暂停录音
    */
  /* CompleteClass */
  override def pause(): Unit = js.native
  /**
    * 继续录音
    */
  /* CompleteClass */
  override def resume(): Unit = js.native
  /**
    * 开始录音
    */
  /* CompleteClass */
  override def start(param: AudioSource): Unit = js.native
  /**
    * 停止录音
    */
  /* CompleteClass */
  override def stop(): Unit = js.native
}

