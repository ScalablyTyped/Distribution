package typings.twilioDashVideo.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashVideo.twilioDashVideoStrings.grid
  - typings.twilioDashVideo.twilioDashVideoStrings.collaboration
  - typings.twilioDashVideo.twilioDashVideoStrings.presentation
*/
trait BandwidthProfileMode extends js.Object

object BandwidthProfileMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def collaboration: typings.twilioDashVideo.twilioDashVideoStrings.collaboration = this.cast("collaboration")
  @scala.inline
  def grid: typings.twilioDashVideo.twilioDashVideoStrings.grid = this.cast("grid")
  @scala.inline
  def presentation: typings.twilioDashVideo.twilioDashVideoStrings.presentation = this.cast("presentation")
}

