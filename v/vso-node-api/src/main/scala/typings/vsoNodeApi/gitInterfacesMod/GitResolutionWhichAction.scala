package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionWhichAction extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionWhichAction")
@js.native
object GitResolutionWhichAction extends js.Object {
  @js.native
  sealed trait PickSourceAction extends GitResolutionWhichAction
  
  @js.native
  sealed trait PickTargetAction extends GitResolutionWhichAction
  
  @js.native
  sealed trait Undecided extends GitResolutionWhichAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionWhichAction with Double] = js.native
  /* 1 */ @js.native
  object PickSourceAction extends TopLevel[PickSourceAction with Double]
  
  /* 2 */ @js.native
  object PickTargetAction extends TopLevel[PickTargetAction with Double]
  
  /* 0 */ @js.native
  object Undecided extends TopLevel[Undecided with Double]
  
}

