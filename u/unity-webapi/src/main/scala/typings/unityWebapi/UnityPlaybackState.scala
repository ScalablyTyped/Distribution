package typings.unityWebapi

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
  
}

