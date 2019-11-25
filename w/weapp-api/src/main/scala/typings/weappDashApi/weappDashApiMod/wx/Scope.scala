package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  - typings.weappDashApi.weappDashApiStrings.userInfo
  - typings.weappDashApi.weappDashApiStrings.userLocation
  - typings.weappDashApi.weappDashApiStrings.address
  - typings.weappDashApi.weappDashApiStrings.invoiceTitle
  - typings.weappDashApi.weappDashApiStrings.invoice
  - typings.weappDashApi.weappDashApiStrings.werun
  - typings.weappDashApi.weappDashApiStrings.record
  - typings.weappDashApi.weappDashApiStrings.writePhotosAlbum
  - typings.weappDashApi.weappDashApiStrings.camera
*/
trait Scope extends js.Object

object Scope {
  @scala.inline
  def address: typings.weappDashApi.weappDashApiStrings.address = this.cast("address")
  @scala.inline
  def camera: typings.weappDashApi.weappDashApiStrings.camera = this.cast("camera")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invoice: typings.weappDashApi.weappDashApiStrings.invoice = this.cast("invoice")
  @scala.inline
  def invoiceTitle: typings.weappDashApi.weappDashApiStrings.invoiceTitle = this.cast("invoiceTitle")
  @scala.inline
  def record: typings.weappDashApi.weappDashApiStrings.record = this.cast("record")
  @scala.inline
  def userInfo: typings.weappDashApi.weappDashApiStrings.userInfo = this.cast("userInfo")
  @scala.inline
  def userLocation: typings.weappDashApi.weappDashApiStrings.userLocation = this.cast("userLocation")
  @scala.inline
  def werun: typings.weappDashApi.weappDashApiStrings.werun = this.cast("werun")
  @scala.inline
  def writePhotosAlbum: typings.weappDashApi.weappDashApiStrings.writePhotosAlbum = this.cast("writePhotosAlbum")
}

