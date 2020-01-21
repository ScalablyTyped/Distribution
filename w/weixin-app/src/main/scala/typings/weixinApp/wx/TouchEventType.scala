package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weixinApp.weixinAppStrings.tap
  - typings.weixinApp.weixinAppStrings.touchstart
  - typings.weixinApp.weixinAppStrings.touchmove
  - typings.weixinApp.weixinAppStrings.touchcancel
  - typings.weixinApp.weixinAppStrings.touchend
  - typings.weixinApp.weixinAppStrings.touchforcechange
*/
trait TouchEventType extends js.Object

object TouchEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typings.weixinApp.weixinAppStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typings.weixinApp.weixinAppStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typings.weixinApp.weixinAppStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchforcechange: typings.weixinApp.weixinAppStrings.touchforcechange = this.cast("touchforcechange")
  @scala.inline
  def touchmove: typings.weixinApp.weixinAppStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typings.weixinApp.weixinAppStrings.touchstart = this.cast("touchstart")
}

