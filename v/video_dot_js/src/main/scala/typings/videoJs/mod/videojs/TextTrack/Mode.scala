package typings.videoJs.mod.videojs.TextTrack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.videoJs.videoJsStrings.disabled
  - typings.videoJs.videoJsStrings.hidden
  - typings.videoJs.videoJsStrings.showing
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typings.videoJs.videoJsStrings.disabled = this.cast("disabled")
  @scala.inline
  def hidden: typings.videoJs.videoJsStrings.hidden = this.cast("hidden")
  @scala.inline
  def showing: typings.videoJs.videoJsStrings.showing = this.cast("showing")
}

