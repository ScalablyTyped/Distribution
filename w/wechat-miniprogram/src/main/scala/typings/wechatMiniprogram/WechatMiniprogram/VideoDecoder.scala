package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.bufferchange
import typings.wechatMiniprogram.wechatMiniprogramStrings.ended
import typings.wechatMiniprogram.wechatMiniprogramStrings.seek
import typings.wechatMiniprogram.wechatMiniprogramStrings.start
import typings.wechatMiniprogram.wechatMiniprogramStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoDecoder extends js.Object {
  
  /** [Object VideoDecoder.getFrameData()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.getFrameData.html)
    *
    * 获取下一帧的解码数据
    *
    * 最低基础库： `2.11.0` */
  def getFrameData(): FrameDataOptions = js.native
  
  /** [VideoDecoder.off(string eventName, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.off.html)
    *
    * 取消监听录制事件。当对应事件触发时，该回调函数不再执行
    *
    * 最低基础库： `2.11.0` */
  def off(/** 事件名 */
  eventName: String, /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  @JSName("on")
  def on_bufferchange(
    /** 事件名
    *
    * 参数 eventName 可选值：
    * - 'start': 开始事件。返回 {width, height};
    * - 'stop': 结束事件。;
    * - 'seek': seek 完成事件。;
    * - 'bufferchange': 缓冲区变化事件。;
    * - 'ended': 解码结束事件。; */
  eventName: bufferchange,
    /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  @JSName("on")
  def on_ended(
    /** 事件名
    *
    * 参数 eventName 可选值：
    * - 'start': 开始事件。返回 {width, height};
    * - 'stop': 结束事件。;
    * - 'seek': seek 完成事件。;
    * - 'bufferchange': 缓冲区变化事件。;
    * - 'ended': 解码结束事件。; */
  eventName: ended,
    /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  @JSName("on")
  def on_seek(
    /** 事件名
    *
    * 参数 eventName 可选值：
    * - 'start': 开始事件。返回 {width, height};
    * - 'stop': 结束事件。;
    * - 'seek': seek 完成事件。;
    * - 'bufferchange': 缓冲区变化事件。;
    * - 'ended': 解码结束事件。; */
  eventName: seek,
    /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  /** [VideoDecoder.on(string eventName, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.on.html)
    *
    * 注册监听录制事件的回调函数。当对应事件触发时，回调函数会被执行
    *
    * 最低基础库： `2.11.0` */
  @JSName("on")
  def on_start(
    /** 事件名
    *
    * 参数 eventName 可选值：
    * - 'start': 开始事件。返回 {width, height};
    * - 'stop': 结束事件。;
    * - 'seek': seek 完成事件。;
    * - 'bufferchange': 缓冲区变化事件。;
    * - 'ended': 解码结束事件。; */
  eventName: start,
    /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  @JSName("on")
  def on_stop(
    /** 事件名
    *
    * 参数 eventName 可选值：
    * - 'start': 开始事件。返回 {width, height};
    * - 'stop': 结束事件。;
    * - 'seek': seek 完成事件。;
    * - 'bufferchange': 缓冲区变化事件。;
    * - 'ended': 解码结束事件。; */
  eventName: stop,
    /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  
  /** [VideoDecoder.remove()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.remove.html)
    *
    * 移除解码器
    *
    * 最低基础库： `2.11.0` */
  def remove(): Unit = js.native
  
  /** [VideoDecoder.seek(number position)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.seek.html)
    *
    * 跳到某个时间点解码
    *
    * 最低基础库： `2.11.0` */
  def seek(/** 跳转的解码位置，单位 ms */
  position: Double): Unit = js.native
  
  /** [VideoDecoder.start(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.start.html)
    *
    * 开始解码
    *
    * 最低基础库： `2.11.0` */
  def start(option: VideoDecoderStartOption): Unit = js.native
  
  /** [VideoDecoder.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/video-decoder/VideoDecoder.stop.html)
    *
    * 停止解码
    *
    * 最低基础库： `2.11.0` */
  def stop(): Unit = js.native
}
