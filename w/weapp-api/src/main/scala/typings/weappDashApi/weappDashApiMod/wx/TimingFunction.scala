package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weappDashApi.weappDashApiStrings.linear
  - typings.weappDashApi.weappDashApiStrings.ease
  - typings.weappDashApi.weappDashApiStrings.`ease-in`
  - typings.weappDashApi.weappDashApiStrings.`ease-in-out`
  - typings.weappDashApi.weappDashApiStrings.`ease-out`
  - typings.weappDashApi.weappDashApiStrings.`step-start`
  - typings.weappDashApi.weappDashApiStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typings.weappDashApi.weappDashApiStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typings.weappDashApi.weappDashApiStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typings.weappDashApi.weappDashApiStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typings.weappDashApi.weappDashApiStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typings.weappDashApi.weappDashApiStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typings.weappDashApi.weappDashApiStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typings.weappDashApi.weappDashApiStrings.`step-start` = this.cast("step-start")
}

