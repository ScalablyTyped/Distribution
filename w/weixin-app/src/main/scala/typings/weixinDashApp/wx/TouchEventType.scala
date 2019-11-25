package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weixinDashApp.weixinDashAppStrings.tap
  - typings.weixinDashApp.weixinDashAppStrings.touchstart
  - typings.weixinDashApp.weixinDashAppStrings.touchmove
  - typings.weixinDashApp.weixinDashAppStrings.touchcancel
  - typings.weixinDashApp.weixinDashAppStrings.touchend
  - typings.weixinDashApp.weixinDashAppStrings.touchforcechange
*/
trait TouchEventType extends js.Object

object TouchEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typings.weixinDashApp.weixinDashAppStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typings.weixinDashApp.weixinDashAppStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typings.weixinDashApp.weixinDashAppStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchforcechange: typings.weixinDashApp.weixinDashAppStrings.touchforcechange = this.cast("touchforcechange")
  @scala.inline
  def touchmove: typings.weixinDashApp.weixinDashAppStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typings.weixinDashApp.weixinDashAppStrings.touchstart = this.cast("touchstart")
}

