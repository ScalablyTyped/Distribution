package typings.twilioVideo.mod.Track

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioVideo.twilioVideoStrings.low
  - typings.twilioVideo.twilioVideoStrings.standard
  - typings.twilioVideo.twilioVideoStrings.high
*/
trait Priority extends js.Object

object Priority {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.twilioVideo.twilioVideoStrings.high = this.cast("high")
  @scala.inline
  def low: typings.twilioVideo.twilioVideoStrings.low = this.cast("low")
  @scala.inline
  def standard: typings.twilioVideo.twilioVideoStrings.standard = this.cast("standard")
}

