package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadTask extends StObject {
  
  /** [UploadTask.abort()](https://developers.weixin.qq.com/miniprogram/dev/api/network/upload/UploadTask.abort.html)
    *
    * 中断上传任务
    *
    * 最低基础库： `1.4.0` */
  def abort(): Unit = js.native
  
  /** [UploadTask.offHeadersReceived(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/upload/UploadTask.offHeadersReceived.html)
    *
    * 取消监听 HTTP Response Header 事件
    *
    * 最低基础库： `2.1.0` */
  def offHeadersReceived(): Unit = js.native
  def offHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: OffHeadersReceivedCallback): Unit = js.native
  
  /** [UploadTask.offProgressUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/upload/UploadTask.offProgressUpdate.html)
    *
    * 取消监听上传进度变化事件
    *
    * 最低基础库： `2.1.0` */
  def offProgressUpdate(): Unit = js.native
  def offProgressUpdate(/** 上传进度变化事件的回调函数 */
  callback: UploadTaskOffProgressUpdateCallback): Unit = js.native
  
  /** [UploadTask.onHeadersReceived(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/upload/UploadTask.onHeadersReceived.html)
    *
    * 监听 HTTP Response Header 事件。会比请求完成事件更早
    *
    * 最低基础库： `2.1.0` */
  def onHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: OnHeadersReceivedCallback): Unit = js.native
  
  /** [UploadTask.onProgressUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/upload/UploadTask.onProgressUpdate.html)
    *
    * 监听上传进度变化事件
    *
    * 最低基础库： `1.4.0` */
  def onProgressUpdate(/** 上传进度变化事件的回调函数 */
  callback: UploadTaskOnProgressUpdateCallback): Unit = js.native
}
