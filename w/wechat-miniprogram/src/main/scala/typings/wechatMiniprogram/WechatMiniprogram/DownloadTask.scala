package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadTask extends StObject {
  
  /** [DownloadTask.abort()](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/DownloadTask.abort.html)
    *
    * 中断下载任务
    *
    * 最低基础库： `1.4.0` */
  def abort(): Unit = js.native
  
  /** [DownloadTask.offHeadersReceived(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/DownloadTask.offHeadersReceived.html)
    *
    * 取消监听 HTTP Response Header 事件
    *
    * 最低基础库： `2.1.0` */
  def offHeadersReceived(): Unit = js.native
  def offHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: OffHeadersReceivedCallback): Unit = js.native
  
  /** [DownloadTask.offProgressUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/DownloadTask.offProgressUpdate.html)
    *
    * 取消监听下载进度变化事件
    *
    * 最低基础库： `2.1.0` */
  def offProgressUpdate(): Unit = js.native
  def offProgressUpdate(/** 下载进度变化事件的回调函数 */
  callback: DownloadTaskOffProgressUpdateCallback): Unit = js.native
  
  /** [DownloadTask.onHeadersReceived(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/DownloadTask.onHeadersReceived.html)
    *
    * 监听 HTTP Response Header 事件。会比请求完成事件更早
    *
    * 最低基础库： `2.1.0` */
  def onHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: OnHeadersReceivedCallback): Unit = js.native
  
  /** [DownloadTask.onProgressUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/DownloadTask.onProgressUpdate.html)
    *
    * 监听下载进度变化事件
    *
    * 最低基础库： `1.4.0` */
  def onProgressUpdate(/** 下载进度变化事件的回调函数 */
  callback: DownloadTaskOnProgressUpdateCallback): Unit = js.native
}
