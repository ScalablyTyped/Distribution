package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weixinApp.weixinAppStrings.transitionend
  - typings.weixinApp.weixinAppStrings.animationstart
  - typings.weixinApp.weixinAppStrings.animationiteration
  - typings.weixinApp.weixinAppStrings.animationend
*/
trait TransitionEventType extends js.Object

object TransitionEventType {
  @scala.inline
  def animationend: typings.weixinApp.weixinAppStrings.animationend = this.cast("animationend")
  @scala.inline
  def animationiteration: typings.weixinApp.weixinAppStrings.animationiteration = this.cast("animationiteration")
  @scala.inline
  def animationstart: typings.weixinApp.weixinAppStrings.animationstart = this.cast("animationstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def transitionend: typings.weixinApp.weixinAppStrings.transitionend = this.cast("transitionend")
}

