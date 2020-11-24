package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionWhichAction extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionWhichAction")
@js.native
object GitResolutionWhichAction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionWhichAction with Double] = js.native
  
  @js.native
  sealed trait PickSourceAction extends GitResolutionWhichAction
  /* 1 */ @js.native
  object PickSourceAction extends TopLevel[PickSourceAction with Double]
  
  @js.native
  sealed trait PickTargetAction extends GitResolutionWhichAction
  /* 2 */ @js.native
  object PickTargetAction extends TopLevel[PickTargetAction with Double]
  
  @js.native
  sealed trait Undecided extends GitResolutionWhichAction
  /* 0 */ @js.native
  object Undecided extends TopLevel[Undecided with Double]
}
