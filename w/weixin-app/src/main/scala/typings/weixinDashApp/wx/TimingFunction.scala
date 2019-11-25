package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----动画
/* Rewritten from type alias, can be one of: 
  - typings.weixinDashApp.weixinDashAppStrings.linear
  - typings.weixinDashApp.weixinDashAppStrings.ease
  - typings.weixinDashApp.weixinDashAppStrings.`ease-in`
  - typings.weixinDashApp.weixinDashAppStrings.`ease-in-out`
  - typings.weixinDashApp.weixinDashAppStrings.`ease-out`
  - typings.weixinDashApp.weixinDashAppStrings.`step-start`
  - typings.weixinDashApp.weixinDashAppStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typings.weixinDashApp.weixinDashAppStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typings.weixinDashApp.weixinDashAppStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typings.weixinDashApp.weixinDashAppStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typings.weixinDashApp.weixinDashAppStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typings.weixinDashApp.weixinDashAppStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typings.weixinDashApp.weixinDashAppStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typings.weixinDashApp.weixinDashAppStrings.`step-start` = this.cast("step-start")
}

