package typings.unityDashWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnityPlaybackState extends js.Object

@JSGlobal("UnityPlaybackState")
@js.native
object UnityPlaybackState extends js.Object {
  @js.native
  sealed trait Paused extends UnityPlaybackState
  
  @js.native
  sealed trait Playing extends UnityPlaybackState
  
  /* 1 */ val Paused: typings.unityDashWebapi.UnityPlaybackState.Paused with Double = js.native
  /* 0 */ val Playing: typings.unityDashWebapi.UnityPlaybackState.Playing with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnityPlaybackState with Double] = js.native
}

