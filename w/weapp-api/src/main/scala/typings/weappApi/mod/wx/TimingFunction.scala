package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weappApi.weappApiStrings.linear
  - typings.weappApi.weappApiStrings.ease
  - typings.weappApi.weappApiStrings.`ease-in`
  - typings.weappApi.weappApiStrings.`ease-in-out`
  - typings.weappApi.weappApiStrings.`ease-out`
  - typings.weappApi.weappApiStrings.`step-start`
  - typings.weappApi.weappApiStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typings.weappApi.weappApiStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typings.weappApi.weappApiStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typings.weappApi.weappApiStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typings.weappApi.weappApiStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typings.weappApi.weappApiStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typings.weappApi.weappApiStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typings.weappApi.weappApiStrings.`step-start` = this.cast("step-start")
}

