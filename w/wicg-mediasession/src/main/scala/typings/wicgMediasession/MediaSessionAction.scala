package typings.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wicgMediasession.wicgMediasessionStrings.play
  - typings.wicgMediasession.wicgMediasessionStrings.pause
  - typings.wicgMediasession.wicgMediasessionStrings.seekbackward
  - typings.wicgMediasession.wicgMediasessionStrings.seekforward
  - typings.wicgMediasession.wicgMediasessionStrings.previoustrack
  - typings.wicgMediasession.wicgMediasessionStrings.nexttrack
*/
trait MediaSessionAction extends js.Object

object MediaSessionAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nexttrack: typings.wicgMediasession.wicgMediasessionStrings.nexttrack = this.cast("nexttrack")
  @scala.inline
  def pause: typings.wicgMediasession.wicgMediasessionStrings.pause = this.cast("pause")
  @scala.inline
  def play: typings.wicgMediasession.wicgMediasessionStrings.play = this.cast("play")
  @scala.inline
  def previoustrack: typings.wicgMediasession.wicgMediasessionStrings.previoustrack = this.cast("previoustrack")
  @scala.inline
  def seekbackward: typings.wicgMediasession.wicgMediasessionStrings.seekbackward = this.cast("seekbackward")
  @scala.inline
  def seekforward: typings.wicgMediasession.wicgMediasessionStrings.seekforward = this.cast("seekforward")
}

