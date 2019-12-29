package typings.unityDashWebapi

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnityPlaybackState with Double] = js.native
  /* 1 */ @js.native
  object Paused extends TopLevel[Paused with Double]
  
  /* 0 */ @js.native
  object Playing extends TopLevel[Playing with Double]
  
}

