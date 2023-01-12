package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.pause
import typings.wechatMiniprogram.wechatMiniprogramStrings.resume
import typings.wechatMiniprogram.wechatMiniprogramStrings.start
import typings.wechatMiniprogram.wechatMiniprogramStrings.stop
import typings.wechatMiniprogram.wechatMiniprogramStrings.timeupdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaRecorder extends StObject {
  
  /** [Promise MediaRecorder.destroy()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.destroy.html)
    *
    * 销毁录制器
    *
    * 最低基础库： `2.11.0` */
  def destroy(): js.Promise[Any]
  
  /** [MediaRecorder.off(string eventName, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.off.html)
    *
    * 取消监听录制事件。当对应事件触发时，该回调函数不再执行。
    *
    * 最低基础库： `2.11.0` */
  def off(/** 事件名 */
  eventName: String, /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ Any, Any]): Unit
  
  /** [MediaRecorder.on(string eventName, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.on.html)
    *
    * 注册监听录制事件的回调函数。当对应事件触发时，回调函数会被执行。
    *
    * 最低基础库： `2.11.0` */
  def on(
    /** 事件名
    *
    * 参数 eventName 可选值：
    * - 'start': 录制开始事件。;
    * - 'stop': 录制结束事件。返回 {tempFilePath, duration, fileSize};
    * - 'pause': 录制暂停事件。;
    * - 'resume': 录制继续事件。;
    * - 'timeupdate': 录制时间更新事件。; */
  eventName: start | stop | pause | resume | timeupdate,
    /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ Any, Any]
  ): Unit
  
  /** [Promise MediaRecorder.pause()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.pause.html)
    *
    * 暂停录制
    *
    * 最低基础库： `2.11.0` */
  def pause(): js.Promise[Any]
  
  /** [Promise MediaRecorder.requestFrame(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.requestFrame.html)
    *
    * 请求下一帧录制，在 callback 里完成一帧渲染后开始录制当前帧
    *
    * 最低基础库： `2.11.0` */
  def requestFrame(callback: js.Function1[/* repeated */ Any, Any]): js.Promise[Any]
  
  /** [Promise MediaRecorder.resume()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.resume.html)
    *
    * 恢复录制
    *
    * 最低基础库： `2.11.0` */
  def resume(): js.Promise[Any]
  
  /** [Promise MediaRecorder.start()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.start.html)
    *
    * 开始录制
    *
    * 最低基础库： `2.11.0` */
  def start(): js.Promise[Any]
  
  /** [Promise MediaRecorder.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.stop.html)
    *
    * 结束录制
    *
    * 最低基础库： `2.11.0` */
  def stop(): js.Promise[Any]
}
object MediaRecorder {
  
  inline def apply(
    destroy: () => js.Promise[Any],
    off: (String, js.Function1[/* repeated */ Any, Any]) => Unit,
    on: (start | stop | pause | resume | timeupdate, js.Function1[/* repeated */ Any, Any]) => Unit,
    pause: () => js.Promise[Any],
    requestFrame: js.Function1[/* repeated */ Any, Any] => js.Promise[Any],
    resume: () => js.Promise[Any],
    start: () => js.Promise[Any],
    stop: () => js.Promise[Any]
  ): MediaRecorder = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), pause = js.Any.fromFunction0(pause), requestFrame = js.Any.fromFunction1(requestFrame), resume = js.Any.fromFunction0(resume), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[MediaRecorder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaRecorder] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => js.Promise[Any]): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setOff(value: (String, js.Function1[/* repeated */ Any, Any]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(value: (start | stop | pause | resume | timeupdate, js.Function1[/* repeated */ Any, Any]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setPause(value: () => js.Promise[Any]): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setRequestFrame(value: js.Function1[/* repeated */ Any, Any] => js.Promise[Any]): Self = StObject.set(x, "requestFrame", js.Any.fromFunction1(value))
    
    inline def setResume(value: () => js.Promise[Any]): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => js.Promise[Any]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => js.Promise[Any]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
