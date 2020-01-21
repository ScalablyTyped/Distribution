package typings.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wicgMediasessionStrings {
  @js.native
  sealed trait nexttrack extends MediaSessionAction
  
  @js.native
  sealed trait none extends MediaSessionPlaybackState
  
  @js.native
  sealed trait pause extends MediaSessionAction
  
  @js.native
  sealed trait paused extends MediaSessionPlaybackState
  
  @js.native
  sealed trait play extends MediaSessionAction
  
  @js.native
  sealed trait playing extends MediaSessionPlaybackState
  
  @js.native
  sealed trait previoustrack extends MediaSessionAction
  
  @js.native
  sealed trait seekbackward extends MediaSessionAction
  
  @js.native
  sealed trait seekforward extends MediaSessionAction
  
  @scala.inline
  def nexttrack: nexttrack = "nexttrack".asInstanceOf[nexttrack]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  @scala.inline
  def play: play = "play".asInstanceOf[play]
  @scala.inline
  def playing: playing = "playing".asInstanceOf[playing]
  @scala.inline
  def previoustrack: previoustrack = "previoustrack".asInstanceOf[previoustrack]
  @scala.inline
  def seekbackward: seekbackward = "seekbackward".asInstanceOf[seekbackward]
  @scala.inline
  def seekforward: seekforward = "seekforward".asInstanceOf[seekforward]
}

