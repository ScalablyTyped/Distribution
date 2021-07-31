package typings.wechatMiniprogram

import typings.std.ArrayBuffer
import typings.wechatMiniprogram.DB.Database
import typings.wechatMiniprogram.ICloud.CallFunctionParam
import typings.wechatMiniprogram.ICloud.CallFunctionResult
import typings.wechatMiniprogram.ICloud.DeleteFileParam
import typings.wechatMiniprogram.ICloud.DeleteFileResult
import typings.wechatMiniprogram.ICloud.DownloadFileParam
import typings.wechatMiniprogram.ICloud.DownloadFileResult
import typings.wechatMiniprogram.ICloud.GetTempFileURLParam
import typings.wechatMiniprogram.ICloud.GetTempFileURLResult
import typings.wechatMiniprogram.ICloud.ICDNConstructor
import typings.wechatMiniprogram.ICloud.ICDNFilePathSpec
import typings.wechatMiniprogram.ICloud.ICloudIDConstructor
import typings.wechatMiniprogram.ICloud.UploadFileParam
import typings.wechatMiniprogram.ICloud.UploadFileResult
import typings.wechatMiniprogram.WechatMiniprogram.DownloadTask
import typings.wechatMiniprogram.WechatMiniprogram.UploadTask
import typings.wechatMiniprogram.anon.RQCallFunctionParam
import typings.wechatMiniprogram.anon.RQDeleteFileParam
import typings.wechatMiniprogram.anon.RQDownloadFileParam
import typings.wechatMiniprogram.anon.RQGetTempFileURLParam
import typings.wechatMiniprogram.anon.RQUploadFileParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extend wx with cloud
  */
@js.native
trait WxCloud extends StObject {
  
  def CDN(options: String): typings.wechatMiniprogram.ICloud.CDN = js.native
  def CDN(options: ArrayBuffer): typings.wechatMiniprogram.ICloud.CDN = js.native
  def CDN(options: ICDNFilePathSpec): typings.wechatMiniprogram.ICloud.CDN = js.native
  @JSName("CDN")
  var CDN_Original: ICDNConstructor = js.native
  
  def CloudID(cloudId: String): typings.wechatMiniprogram.ICloud.CloudID = js.native
  @JSName("CloudID")
  var CloudID_Original: ICloudIDConstructor = js.native
  
  def callFunction(param: OQ[CallFunctionParam]): Unit = js.native
  def callFunction(param: RQCallFunctionParam): js.Promise[CallFunctionResult] = js.native
  
  def database(): Database = js.native
  def database(config: ICloudConfig): Database = js.native
  
  def deleteFile(param: OQ[DeleteFileParam]): Unit = js.native
  def deleteFile(param: RQDeleteFileParam): js.Promise[DeleteFileResult] = js.native
  
  def downloadFile(param: OQ[DownloadFileParam]): DownloadTask = js.native
  def downloadFile(param: RQDownloadFileParam): js.Promise[DownloadFileResult] = js.native
  
  def getTempFileURL(param: OQ[GetTempFileURLParam]): Unit = js.native
  def getTempFileURL(param: RQGetTempFileURLParam): js.Promise[GetTempFileURLResult] = js.native
  
  def init(): Unit = js.native
  def init(config: ICloudConfig): Unit = js.native
  
  def uploadFile(param: OQ[UploadFileParam]): UploadTask = js.native
  def uploadFile(param: RQUploadFileParam): js.Promise[UploadFileResult] = js.native
}
