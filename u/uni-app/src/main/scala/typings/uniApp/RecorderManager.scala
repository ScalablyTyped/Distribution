package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderManager extends js.Object {
  /**
    * 录音错误事件, 会回调错误信息
    */
  def onError(): Unit = js.native
  def onError(options: js.Function0[Unit]): Unit = js.native
  /**
    * 已录制完指定帧大小的文件，会回调录音分片结果数据。如果设置了 frameSize ，则会回调此事件
    */
  def onFrameRecorded(): Unit = js.native
  def onFrameRecorded(options: js.Function0[Unit]): Unit = js.native
  /**
    * 录音暂停事件
    */
  def onPause(): Unit = js.native
  def onPause(options: js.Function0[Unit]): Unit = js.native
  /**
    * 录音开始事件
    */
  def onStart(): Unit = js.native
  def onStart(options: js.Function0[Unit]): Unit = js.native
  /**
    * 录音停止事件，会回调文件地址
    */
  def onStop(): Unit = js.native
  def onStop(options: js.Function0[Unit]): Unit = js.native
  /**
    * 暂停录音
    */
  def pause(): Unit = js.native
  /**
    * 暂停录音
    */
  def resume(): Unit = js.native
  /**
    * 开始录音
    */
  def start(): Unit = js.native
  def start(options: RecorderManagerStartOptions): Unit = js.native
  /**
    * 停止录音
    */
  def stop(): Unit = js.native
}

