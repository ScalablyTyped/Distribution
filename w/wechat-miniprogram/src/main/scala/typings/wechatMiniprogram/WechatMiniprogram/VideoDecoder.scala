package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.bufferchange
import typings.wechatMiniprogram.wechatMiniprogramStrings.ended
import typings.wechatMiniprogram.wechatMiniprogramStrings.seek
import typings.wechatMiniprogram.wechatMiniprogramStrings.start
import typings.wechatMiniprogram.wechatMiniprogramStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoDecoder extends StObject {
  
  /** [Object VideoDecoder.getFrameData()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.getFrameData.html)
    *
    * 获取下一帧的解码数据
    *
    * 最低基础库： `2.11.0` */
  def getFrameData(): FrameDataOptions
  
  /** [VideoDecoder.off(string eventName, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.off.html)
    *
    * 取消监听录制事件。当对应事件触发时，该回调函数不再执行
    *
    * 最低基础库： `2.11.0` */
  def off(/** 事件名 */
  eventName: String, /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ Any, Any]): Unit
  
  /** [VideoDecoder.on(string eventName, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.on.html)
    *
    * 注册监听录制事件的回调函数。当对应事件触发时，回调函数会被执行
    *
    * 最低基础库： `2.11.0` */
  def on(
    /** 事件名
    *
    * 参数 eventName 可选值：
    * - 'start': 开始事件。返回 {width, height};
    * - 'stop': 结束事件。;
    * - 'seek': seek 完成事件。;
    * - 'bufferchange': 缓冲区变化事件。;
    * - 'ended': 解码结束事件。; */
  eventName: start | stop | seek | bufferchange | ended,
    /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ Any, Any]
  ): Unit
  
  /** [Promise VideoDecoder.remove()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.remove.html)
    *
    * 移除解码器
    *
    * 最低基础库： `2.11.0` */
  def remove(): js.Promise[Any]
  
  /** [Promise VideoDecoder.seek(number position)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.seek.html)
    *
    * 跳到某个时间点解码
    *
    * 最低基础库： `2.11.0` */
  def seek(/** 跳转的解码位置，单位 ms */
  position: Double): js.Promise[Any]
  
  /** [Promise VideoDecoder.start(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.start.html)
    *
    * 开始解码
    *
    * 最低基础库： `2.11.0` */
  def start(option: VideoDecoderStartOption): js.Promise[Any]
  
  /** [Promise VideoDecoder.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.stop.html)
    *
    * 停止解码
    *
    * 最低基础库： `2.11.0` */
  def stop(): js.Promise[Any]
}
object VideoDecoder {
  
  inline def apply(
    getFrameData: () => FrameDataOptions,
    off: (String, js.Function1[/* repeated */ Any, Any]) => Unit,
    on: (start | stop | seek | bufferchange | ended, js.Function1[/* repeated */ Any, Any]) => Unit,
    remove: () => js.Promise[Any],
    seek: Double => js.Promise[Any],
    start: VideoDecoderStartOption => js.Promise[Any],
    stop: () => js.Promise[Any]
  ): VideoDecoder = {
    val __obj = js.Dynamic.literal(getFrameData = js.Any.fromFunction0(getFrameData), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), remove = js.Any.fromFunction0(remove), seek = js.Any.fromFunction1(seek), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[VideoDecoder]
  }
  
  extension [Self <: VideoDecoder](x: Self) {
    
    inline def setGetFrameData(value: () => FrameDataOptions): Self = StObject.set(x, "getFrameData", js.Any.fromFunction0(value))
    
    inline def setOff(value: (String, js.Function1[/* repeated */ Any, Any]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(value: (start | stop | seek | bufferchange | ended, js.Function1[/* repeated */ Any, Any]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setRemove(value: () => js.Promise[Any]): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSeek(value: Double => js.Promise[Any]): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    inline def setStart(value: VideoDecoderStartOption => js.Promise[Any]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: () => js.Promise[Any]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
