package typings.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wicgMediasession.wicgMediasessionStrings.none
  - typings.wicgMediasession.wicgMediasessionStrings.paused
  - typings.wicgMediasession.wicgMediasessionStrings.playing
*/
trait MediaSessionPlaybackState extends js.Object

object MediaSessionPlaybackState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.wicgMediasession.wicgMediasessionStrings.none = this.cast("none")
  @scala.inline
  def paused: typings.wicgMediasession.wicgMediasessionStrings.paused = this.cast("paused")
  @scala.inline
  def playing: typings.wicgMediasession.wicgMediasessionStrings.playing = this.cast("playing")
}

