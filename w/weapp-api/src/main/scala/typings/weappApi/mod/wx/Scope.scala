package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  授权
/**
  * https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/authorize.html
  * 用户信息 wx.getUserInfo、
  * 地理位置 wx.getLocation,wx.chooseLocation、
  * 通讯地址 wx.chooseAddress、
  * 发票抬头 wx.chooseInvoiceTitle、
  * 获取发票 wx.chooseInvoice、
  * 微信运动步数 wx.getWeRunData、
  * 录音功能 wx.startRecord、
  * 保存到相册 wx.saveImageToPhotosAlbum, wx.saveVideoToPhotosAlbum、
  * 摄像头 <camera />组件
  */
/* Rewritten from type alias, can be one of: 
  - typings.weappApi.weappApiStrings.userInfo
  - typings.weappApi.weappApiStrings.userLocation
  - typings.weappApi.weappApiStrings.address
  - typings.weappApi.weappApiStrings.invoiceTitle
  - typings.weappApi.weappApiStrings.invoice
  - typings.weappApi.weappApiStrings.werun
  - typings.weappApi.weappApiStrings.record
  - typings.weappApi.weappApiStrings.writePhotosAlbum
  - typings.weappApi.weappApiStrings.camera
*/
trait Scope extends StObject
object Scope {
  
  @scala.inline
  def address: typings.weappApi.weappApiStrings.address = "address".asInstanceOf[typings.weappApi.weappApiStrings.address]
  
  @scala.inline
  def camera: typings.weappApi.weappApiStrings.camera = "camera".asInstanceOf[typings.weappApi.weappApiStrings.camera]
  
  @scala.inline
  def invoice: typings.weappApi.weappApiStrings.invoice = "invoice".asInstanceOf[typings.weappApi.weappApiStrings.invoice]
  
  @scala.inline
  def invoiceTitle: typings.weappApi.weappApiStrings.invoiceTitle = "invoiceTitle".asInstanceOf[typings.weappApi.weappApiStrings.invoiceTitle]
  
  @scala.inline
  def record: typings.weappApi.weappApiStrings.record = "record".asInstanceOf[typings.weappApi.weappApiStrings.record]
  
  @scala.inline
  def userInfo: typings.weappApi.weappApiStrings.userInfo = "userInfo".asInstanceOf[typings.weappApi.weappApiStrings.userInfo]
  
  @scala.inline
  def userLocation: typings.weappApi.weappApiStrings.userLocation = "userLocation".asInstanceOf[typings.weappApi.weappApiStrings.userLocation]
  
  @scala.inline
  def werun: typings.weappApi.weappApiStrings.werun = "werun".asInstanceOf[typings.weappApi.weappApiStrings.werun]
  
  @scala.inline
  def writePhotosAlbum: typings.weappApi.weappApiStrings.writePhotosAlbum = "writePhotosAlbum".asInstanceOf[typings.weappApi.weappApiStrings.writePhotosAlbum]
}
