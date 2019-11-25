package typings.twilioDashVideo.twilioDashVideoMod.Track

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashVideo.twilioDashVideoStrings.low
  - typings.twilioDashVideo.twilioDashVideoStrings.standard
  - typings.twilioDashVideo.twilioDashVideoStrings.high
*/
trait Priority extends js.Object

object Priority {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.twilioDashVideo.twilioDashVideoStrings.high = this.cast("high")
  @scala.inline
  def low: typings.twilioDashVideo.twilioDashVideoStrings.low = this.cast("low")
  @scala.inline
  def standard: typings.twilioDashVideo.twilioDashVideoStrings.standard = this.cast("standard")
}

