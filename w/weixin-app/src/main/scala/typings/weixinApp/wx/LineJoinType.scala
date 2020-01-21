package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weixinApp.weixinAppStrings.bevel
  - typings.weixinApp.weixinAppStrings.round
  - typings.weixinApp.weixinAppStrings.miter
*/
trait LineJoinType extends js.Object

object LineJoinType {
  @scala.inline
  def bevel: typings.weixinApp.weixinAppStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typings.weixinApp.weixinAppStrings.miter = this.cast("miter")
  @scala.inline
  def round: typings.weixinApp.weixinAppStrings.round = this.cast("round")
}

