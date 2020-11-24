package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.start
import typings.wechatMiniprogram.wechatMiniprogramStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRecorder extends js.Object {
  
  /** [MediaRecorder.destroy()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.destroy.html)
    *
    * 销毁录制器
    *
    * 最低基础库： `2.11.0` */
  def destroy(): Unit = js.native
  
  /** [MediaRecorder.off(string eventName, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.off.html)
    *
    * 取消监听录制事件。当对应事件触发时，该回调函数不再执行。
    *
    * 最低基础库： `2.11.0` */
  def off(/** 事件名 */
  eventName: String, /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [MediaRecorder.on(string eventName, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.on.html)
    *
    * 注册监听录制事件的回调函数。当对应事件触发时，回调函数会被执行。
    *
    * 最低基础库： `2.11.0` */
  @JSName("on")
  def on_start(
    /** 事件名
    *
    * 参数 eventName 可选值：
    * - 'start': 录制开始事件。;
    * - 'stop': 录制结束事件。返回 {tempFilePath, duration, fileSize}; */
  eventName: start,
    /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  @JSName("on")
  def on_stop(
    /** 事件名
    *
    * 参数 eventName 可选值：
    * - 'start': 录制开始事件。;
    * - 'stop': 录制结束事件。返回 {tempFilePath, duration, fileSize}; */
  eventName: stop,
    /** 事件触发时执行的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  
  /** [MediaRecorder.pause()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.pause.html)
    *
    * 暂停录制
    *
    * 最低基础库： `2.11.0` */
  def pause(): Unit = js.native
  
  /** [MediaRecorder.requestFrame(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.requestFrame.html)
    *
    * 请求下一帧录制，在 callback 里完成一帧渲染后开始录制当前帧
    *
    * 最低基础库： `2.11.0` */
  def requestFrame(callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /** [MediaRecorder.resume()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.resume.html)
    *
    * 恢复录制
    *
    * 最低基础库： `2.11.0` */
  def resume(): Unit = js.native
  
  /** [MediaRecorder.start()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.start.html)
    *
    * 开始录制
    *
    * 最低基础库： `2.11.0` */
  def start(): Unit = js.native
  
  /** [MediaRecorder.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/media-recorder/MediaRecorder.stop.html)
    *
    * 结束录制
    *
    * 最低基础库： `2.11.0` */
  def stop(): Unit = js.native
}
