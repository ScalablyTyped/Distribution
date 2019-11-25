package typings.wicgDashMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wicgDashMediasession.wicgDashMediasessionStrings.play
  - typings.wicgDashMediasession.wicgDashMediasessionStrings.pause
  - typings.wicgDashMediasession.wicgDashMediasessionStrings.seekbackward
  - typings.wicgDashMediasession.wicgDashMediasessionStrings.seekforward
  - typings.wicgDashMediasession.wicgDashMediasessionStrings.previoustrack
  - typings.wicgDashMediasession.wicgDashMediasessionStrings.nexttrack
*/
trait MediaSessionAction extends js.Object

object MediaSessionAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nexttrack: typings.wicgDashMediasession.wicgDashMediasessionStrings.nexttrack = this.cast("nexttrack")
  @scala.inline
  def pause: typings.wicgDashMediasession.wicgDashMediasessionStrings.pause = this.cast("pause")
  @scala.inline
  def play: typings.wicgDashMediasession.wicgDashMediasessionStrings.play = this.cast("play")
  @scala.inline
  def previoustrack: typings.wicgDashMediasession.wicgDashMediasessionStrings.previoustrack = this.cast("previoustrack")
  @scala.inline
  def seekbackward: typings.wicgDashMediasession.wicgDashMediasessionStrings.seekbackward = this.cast("seekbackward")
  @scala.inline
  def seekforward: typings.wicgDashMediasession.wicgDashMediasessionStrings.seekforward = this.cast("seekforward")
}

