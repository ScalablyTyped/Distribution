package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecorderManager extends StObject {
  
  /** [RecorderManager.onError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onError.html)
    *
    * 监听录音错误事件 */
  def onError(/** 录音错误事件的回调函数 */
  callback: UDPSocketOnErrorCallback): Unit
  
  /** [RecorderManager.onFrameRecorded(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onFrameRecorded.html)
    *
    * 监听已录制完指定帧大小的文件事件。如果设置了 frameSize，则会回调此事件。 */
  def onFrameRecorded(/** 已录制完指定帧大小的文件事件的回调函数 */
  callback: OnFrameRecordedCallback): Unit
  
  /** [RecorderManager.onInterruptionBegin(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onInterruptionBegin.html)
    *
    * 监听录音因为受到系统占用而被中断开始事件。以下场景会触发此事件：微信语音聊天、微信视频聊天。此事件触发后，录音会被暂停。pause 事件在此事件后触发
    *
    * 最低基础库： `2.3.0` */
  def onInterruptionBegin(/** 录音因为受到系统占用而被中断开始事件的回调函数 */
  callback: OnInterruptionBeginCallback): Unit
  
  /** [RecorderManager.onInterruptionEnd(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onInterruptionEnd.html)
    *
    * 监听录音中断结束事件。在收到 interruptionBegin 事件之后，小程序内所有录音会暂停，收到此事件之后才可再次录音成功。
    *
    * 最低基础库： `2.3.0` */
  def onInterruptionEnd(/** 录音中断结束事件的回调函数 */
  callback: OnInterruptionEndCallback): Unit
  
  /** [RecorderManager.onPause(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onPause.html)
    *
    * 监听录音暂停事件 */
  def onPause(/** 录音暂停事件的回调函数 */
  callback: OnPauseCallback): Unit
  
  /** [RecorderManager.onResume(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onResume.html)
    *
    * 监听录音继续事件 */
  def onResume(/** 录音继续事件的回调函数 */
  callback: OnResumeCallback): Unit
  
  /** [RecorderManager.onStart(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onStart.html)
    *
    * 监听录音开始事件 */
  def onStart(/** 录音开始事件的回调函数 */
  callback: OnStartCallback): Unit
  
  /** [RecorderManager.onStop(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.onStop.html)
    *
    * 监听录音结束事件 */
  def onStop(/** 录音结束事件的回调函数 */
  callback: RecorderManagerOnStopCallback): Unit
  
  /** [RecorderManager.pause()](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.pause.html)
    *
    * 暂停录音 */
  def pause(): Unit
  
  /** [RecorderManager.resume()](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.resume.html)
    *
    * 继续录音 */
  def resume(): Unit
  
  /** [RecorderManager.start(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.start.html)
    *
    * 开始录音
    *
    * **采样率与编码码率限制**
    *
    *
    *  每种采样率有对应的编码码率范围有效值，设置不合法的采样率或编码码率会导致录音失败，具体对应关系如下表。
    *
    * | 采样率 | 编码码率       |
    * | ------ | -------------- |
    * | 8000   | 16000 ~ 48000  |
    * | 11025  | 16000 ~ 48000  |
    * | 12000  | 24000 ~ 64000  |
    * | 16000  | 24000 ~ 96000  |
    * | 22050  | 32000 ~ 128000 |
    * | 24000  | 32000 ~ 128000 |
    * | 32000  | 48000 ~ 192000 |
    * | 44100  | 64000 ~ 320000 |
    * | 48000  | 64000 ~ 320000 | */
  def start(option: RecorderManagerStartOption): Unit
  
  /** [RecorderManager.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.stop.html)
    *
    * 停止录音 */
  def stop(): Unit
}
object RecorderManager {
  
  inline def apply(
    onError: UDPSocketOnErrorCallback => Unit,
    onFrameRecorded: OnFrameRecordedCallback => Unit,
    onInterruptionBegin: OnInterruptionBeginCallback => Unit,
    onInterruptionEnd: OnInterruptionEndCallback => Unit,
    onPause: OnPauseCallback => Unit,
    onResume: OnResumeCallback => Unit,
    onStart: OnStartCallback => Unit,
    onStop: RecorderManagerOnStopCallback => Unit,
    pause: () => Unit,
    resume: () => Unit,
    start: RecorderManagerStartOption => Unit,
    stop: () => Unit
  ): RecorderManager = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onFrameRecorded = js.Any.fromFunction1(onFrameRecorded), onInterruptionBegin = js.Any.fromFunction1(onInterruptionBegin), onInterruptionEnd = js.Any.fromFunction1(onInterruptionEnd), onPause = js.Any.fromFunction1(onPause), onResume = js.Any.fromFunction1(onResume), onStart = js.Any.fromFunction1(onStart), onStop = js.Any.fromFunction1(onStop), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[RecorderManager]
  }
  
  extension [Self <: RecorderManager](x: Self) {
    
    inline def setOnError(value: UDPSocketOnErrorCallback => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnFrameRecorded(value: OnFrameRecordedCallback => Unit): Self = StObject.set(x, "onFrameRecorded", js.Any.fromFunction1(value))
    
    inline def setOnInterruptionBegin(value: OnInterruptionBeginCallback => Unit): Self = StObject.set(x, "onInterruptionBegin", js.Any.fromFunction1(value))
    
    inline def setOnInterruptionEnd(value: OnInterruptionEndCallback => Unit): Self = StObject.set(x, "onInterruptionEnd", js.Any.fromFunction1(value))
    
    inline def setOnPause(value: OnPauseCallback => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    inline def setOnResume(value: OnResumeCallback => Unit): Self = StObject.set(x, "onResume", js.Any.fromFunction1(value))
    
    inline def setOnStart(value: OnStartCallback => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
    
    inline def setOnStop(value: RecorderManagerOnStopCallback => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    inline def setStart(value: RecorderManagerStartOption => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
