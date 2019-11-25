package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weixinDashApp.weixinDashAppStrings.transitionend
  - typings.weixinDashApp.weixinDashAppStrings.animationstart
  - typings.weixinDashApp.weixinDashAppStrings.animationiteration
  - typings.weixinDashApp.weixinDashAppStrings.animationend
*/
trait TransitionEventType extends js.Object

object TransitionEventType {
  @scala.inline
  def animationend: typings.weixinDashApp.weixinDashAppStrings.animationend = this.cast("animationend")
  @scala.inline
  def animationiteration: typings.weixinDashApp.weixinDashAppStrings.animationiteration = this.cast("animationiteration")
  @scala.inline
  def animationstart: typings.weixinDashApp.weixinDashAppStrings.animationstart = this.cast("animationstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def transitionend: typings.weixinDashApp.weixinDashAppStrings.transitionend = this.cast("transitionend")
}

