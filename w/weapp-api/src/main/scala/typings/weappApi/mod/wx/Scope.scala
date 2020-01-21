package typings.weappApi.mod.wx

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
trait Scope extends js.Object

object Scope {
  @scala.inline
  def address: typings.weappApi.weappApiStrings.address = this.cast("address")
  @scala.inline
  def camera: typings.weappApi.weappApiStrings.camera = this.cast("camera")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invoice: typings.weappApi.weappApiStrings.invoice = this.cast("invoice")
  @scala.inline
  def invoiceTitle: typings.weappApi.weappApiStrings.invoiceTitle = this.cast("invoiceTitle")
  @scala.inline
  def record: typings.weappApi.weappApiStrings.record = this.cast("record")
  @scala.inline
  def userInfo: typings.weappApi.weappApiStrings.userInfo = this.cast("userInfo")
  @scala.inline
  def userLocation: typings.weappApi.weappApiStrings.userLocation = this.cast("userLocation")
  @scala.inline
  def werun: typings.weappApi.weappApiStrings.werun = this.cast("werun")
  @scala.inline
  def writePhotosAlbum: typings.weappApi.weappApiStrings.writePhotosAlbum = this.cast("writePhotosAlbum")
}

