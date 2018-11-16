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
  
  val Paused: Paused with java.lang.String = js.native
  val Playing: Playing with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[unityDashWebapiLib.UnityPlaybackState with java.lang.String] = js.native
}

