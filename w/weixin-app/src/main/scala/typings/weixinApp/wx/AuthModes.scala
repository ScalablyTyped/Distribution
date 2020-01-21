package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weixinApp.weixinAppStrings.fingerPrint
  - typings.weixinApp.weixinAppStrings.facial
  - typings.weixinApp.weixinAppStrings.speech
*/
trait AuthModes extends js.Object

object AuthModes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def facial: typings.weixinApp.weixinAppStrings.facial = this.cast("facial")
  @scala.inline
  def fingerPrint: typings.weixinApp.weixinAppStrings.fingerPrint = this.cast("fingerPrint")
  @scala.inline
  def speech: typings.weixinApp.weixinAppStrings.speech = this.cast("speech")
}

