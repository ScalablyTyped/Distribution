package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// scope 列表
/* Rewritten from type alias, can be one of: 
  - typings.weixinDashApp.weixinDashAppStrings.scopeDotuserInfo
  - typings.weixinDashApp.weixinDashAppStrings.scopeDotuserLocation
  - typings.weixinDashApp.weixinDashAppStrings.scopeDotaddress
  - typings.weixinDashApp.weixinDashAppStrings.scopeDotinvoiceTitle
  - typings.weixinDashApp.weixinDashAppStrings.scopeDotinvoice
  - typings.weixinDashApp.weixinDashAppStrings.scopeDotwerun
  - typings.weixinDashApp.weixinDashAppStrings.scopeDotrecord
  - typings.weixinDashApp.weixinDashAppStrings.scopeDotwritePhotosAlbum
  - typings.weixinDashApp.weixinDashAppStrings.scopeDotcamera
*/
trait Scope extends js.Object

object Scope {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def scopeDotaddress: typings.weixinDashApp.weixinDashAppStrings.scopeDotaddress = this.cast("scope.address")
  @scala.inline
  def scopeDotcamera: typings.weixinDashApp.weixinDashAppStrings.scopeDotcamera = this.cast("scope.camera")
  @scala.inline
  def scopeDotinvoice: typings.weixinDashApp.weixinDashAppStrings.scopeDotinvoice = this.cast("scope.invoice")
  @scala.inline
  def scopeDotinvoiceTitle: typings.weixinDashApp.weixinDashAppStrings.scopeDotinvoiceTitle = this.cast("scope.invoiceTitle")
  @scala.inline
  def scopeDotrecord: typings.weixinDashApp.weixinDashAppStrings.scopeDotrecord = this.cast("scope.record")
  @scala.inline
  def scopeDotuserInfo: typings.weixinDashApp.weixinDashAppStrings.scopeDotuserInfo = this.cast("scope.userInfo")
  @scala.inline
  def scopeDotuserLocation: typings.weixinDashApp.weixinDashAppStrings.scopeDotuserLocation = this.cast("scope.userLocation")
  @scala.inline
  def scopeDotwerun: typings.weixinDashApp.weixinDashAppStrings.scopeDotwerun = this.cast("scope.werun")
  @scala.inline
  def scopeDotwritePhotosAlbum: typings.weixinDashApp.weixinDashAppStrings.scopeDotwritePhotosAlbum = this.cast("scope.writePhotosAlbum")
}

