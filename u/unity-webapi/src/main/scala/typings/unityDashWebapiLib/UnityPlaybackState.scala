package typings
package unityDashWebapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnityPlaybackState extends js.Object

@JSGlobal("UnityPlaybackState")
@js.native
object UnityPlaybackState extends js.Object {
  @js.native
  sealed trait Paused
    extends unityDashWebapiLib.UnityPlaybackState
  
  @js.native
  sealed trait Playing
    extends unityDashWebapiLib.UnityPlaybackState
  
  /* 1 */ val Paused: Paused with scala.Double = js.native
  /* 0 */ val Playing: Playing with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[unityDashWebapiLib.UnityPlaybackState with scala.Double] = js.native
}

