package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioVideo.twilioVideoStrings.grid
  - typings.twilioVideo.twilioVideoStrings.collaboration
  - typings.twilioVideo.twilioVideoStrings.presentation
*/
trait BandwidthProfileMode extends js.Object

object BandwidthProfileMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def collaboration: typings.twilioVideo.twilioVideoStrings.collaboration = this.cast("collaboration")
  @scala.inline
  def grid: typings.twilioVideo.twilioVideoStrings.grid = this.cast("grid")
  @scala.inline
  def presentation: typings.twilioVideo.twilioVideoStrings.presentation = this.cast("presentation")
}

