package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// scope 列表
/* Rewritten from type alias, can be one of: 
  - typings.weixinApp.weixinAppStrings.scopeDotuserInfo
  - typings.weixinApp.weixinAppStrings.scopeDotuserLocation
  - typings.weixinApp.weixinAppStrings.scopeDotaddress
  - typings.weixinApp.weixinAppStrings.scopeDotinvoiceTitle
  - typings.weixinApp.weixinAppStrings.scopeDotinvoice
  - typings.weixinApp.weixinAppStrings.scopeDotwerun
  - typings.weixinApp.weixinAppStrings.scopeDotrecord
  - typings.weixinApp.weixinAppStrings.scopeDotwritePhotosAlbum
  - typings.weixinApp.weixinAppStrings.scopeDotcamera
*/
trait Scope extends js.Object

object Scope {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def scopeDotaddress: typings.weixinApp.weixinAppStrings.scopeDotaddress = this.cast("scope.address")
  @scala.inline
  def scopeDotcamera: typings.weixinApp.weixinAppStrings.scopeDotcamera = this.cast("scope.camera")
  @scala.inline
  def scopeDotinvoice: typings.weixinApp.weixinAppStrings.scopeDotinvoice = this.cast("scope.invoice")
  @scala.inline
  def scopeDotinvoiceTitle: typings.weixinApp.weixinAppStrings.scopeDotinvoiceTitle = this.cast("scope.invoiceTitle")
  @scala.inline
  def scopeDotrecord: typings.weixinApp.weixinAppStrings.scopeDotrecord = this.cast("scope.record")
  @scala.inline
  def scopeDotuserInfo: typings.weixinApp.weixinAppStrings.scopeDotuserInfo = this.cast("scope.userInfo")
  @scala.inline
  def scopeDotuserLocation: typings.weixinApp.weixinAppStrings.scopeDotuserLocation = this.cast("scope.userLocation")
  @scala.inline
  def scopeDotwerun: typings.weixinApp.weixinAppStrings.scopeDotwerun = this.cast("scope.werun")
  @scala.inline
  def scopeDotwritePhotosAlbum: typings.weixinApp.weixinAppStrings.scopeDotwritePhotosAlbum = this.cast("scope.writePhotosAlbum")
}

