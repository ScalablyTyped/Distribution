package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderManager extends js.Object {
  /**
    * 录音错误事件, 会回调错误信息
    */
  def onError(options: js.Function0[scala.Unit]): scala.Unit
  /**
    * 已录制完指定帧大小的文件，会回调录音分片结果数据。如果设置了 frameSize ，则会回调此事件
    */
  def onFrameRecorded(options: js.Function0[scala.Unit]): scala.Unit
  /**
    * 录音暂停事件
    */
  def onPause(options: js.Function0[scala.Unit]): scala.Unit
  /**
    * 录音开始事件
    */
  def onStart(options: js.Function0[scala.Unit]): scala.Unit
  /**
    * 录音停止事件，会回调文件地址
    */
  def onStop(options: js.Function0[scala.Unit]): scala.Unit
  /**
    * 暂停录音
    */
  def pause(): scala.Unit
  /**
    * 暂停录音
    */
  def resume(): scala.Unit
  /**
    * 开始录音
    */
  def start(options: RecorderManagerStartOptions): scala.Unit
  /**
    * 停止录音
    */
  def stop(): scala.Unit
}

object RecorderManager {
  @scala.inline
  def apply(
    onError: js.Function0[scala.Unit] => scala.Unit,
    onFrameRecorded: js.Function0[scala.Unit] => scala.Unit,
    onPause: js.Function0[scala.Unit] => scala.Unit,
    onStart: js.Function0[scala.Unit] => scala.Unit,
    onStop: js.Function0[scala.Unit] => scala.Unit,
    pause: () => scala.Unit,
    resume: () => scala.Unit,
    start: RecorderManagerStartOptions => scala.Unit,
    stop: () => scala.Unit
  ): RecorderManager = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onFrameRecorded = js.Any.fromFunction1(onFrameRecorded), onPause = js.Any.fromFunction1(onPause), onStart = js.Any.fromFunction1(onStart), onStop = js.Any.fromFunction1(onStop), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[RecorderManager]
  }
}

