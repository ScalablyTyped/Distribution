package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weixinDashApp.weixinDashAppStrings.fingerPrint
  - typings.weixinDashApp.weixinDashAppStrings.facial
  - typings.weixinDashApp.weixinDashAppStrings.speech
*/
trait AuthModes extends js.Object

object AuthModes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def facial: typings.weixinDashApp.weixinDashAppStrings.facial = this.cast("facial")
  @scala.inline
  def fingerPrint: typings.weixinDashApp.weixinDashAppStrings.fingerPrint = this.cast("fingerPrint")
  @scala.inline
  def speech: typings.weixinDashApp.weixinDashAppStrings.speech = this.cast("speech")
}

