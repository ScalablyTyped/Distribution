package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RecorderManager")
@js.native
class RecorderManager () extends js.Object {
  /**
    * 监听录音错误事件
    */
  def onError(callback: js.Function1[/* res */ AnonErrMsg, Unit]): Unit = js.native
  /**
    * 监听已录制完指定帧大小的文件事件。如果设置了 frameSize，则会回调此事件。
    * @param callback.res.frameBuffer 录音分片数据
    * @param callback.res.isLastFrame 当前帧是否正常录音结束前的最后一帧
    */
  def onFrameRecorded(callback: js.Function1[/* res */ AnonFrameBuffer, Unit]): Unit = js.native
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
  def onStop(callback: js.Function1[/* res */ AnonTempFilePath, Unit]): Unit = js.native
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
  def start(param: AnonAudioSource): Unit = js.native
  /**
    * 停止录音
    */
  def stop(): Unit = js.native
}

