package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----动画
/* Rewritten from type alias, can be one of: 
  - typings.weixinApp.weixinAppStrings.linear
  - typings.weixinApp.weixinAppStrings.ease
  - typings.weixinApp.weixinAppStrings.`ease-in`
  - typings.weixinApp.weixinAppStrings.`ease-in-out`
  - typings.weixinApp.weixinAppStrings.`ease-out`
  - typings.weixinApp.weixinAppStrings.`step-start`
  - typings.weixinApp.weixinAppStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typings.weixinApp.weixinAppStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typings.weixinApp.weixinAppStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typings.weixinApp.weixinAppStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typings.weixinApp.weixinAppStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typings.weixinApp.weixinAppStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typings.weixinApp.weixinAppStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typings.weixinApp.weixinAppStrings.`step-start` = this.cast("step-start")
}

