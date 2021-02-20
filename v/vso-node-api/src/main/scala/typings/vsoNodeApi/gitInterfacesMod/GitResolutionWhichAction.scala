package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionWhichAction extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionWhichAction")
@js.native
object GitResolutionWhichAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionWhichAction with Double] = js.native
  
  @js.native
  sealed trait PickSourceAction extends GitResolutionWhichAction
  /* 1 */ val PickSourceAction: typings.vsoNodeApi.gitInterfacesMod.GitResolutionWhichAction.PickSourceAction with Double = js.native
  
  @js.native
  sealed trait PickTargetAction extends GitResolutionWhichAction
  /* 2 */ val PickTargetAction: typings.vsoNodeApi.gitInterfacesMod.GitResolutionWhichAction.PickTargetAction with Double = js.native
  
  @js.native
  sealed trait Undecided extends GitResolutionWhichAction
  /* 0 */ val Undecided: typings.vsoNodeApi.gitInterfacesMod.GitResolutionWhichAction.Undecided with Double = js.native
}
