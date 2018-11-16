package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionWhichAction extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionWhichAction")
@js.native
object GitResolutionWhichAction extends js.Object {
  @js.native
  sealed trait PickSourceAction
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionWhichAction
  
  @js.native
  sealed trait PickTargetAction
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionWhichAction
  
  @js.native
  sealed trait Undecided
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionWhichAction
  
  /* 1 */ val PickSourceAction: PickSourceAction with scala.Double = js.native
  /* 2 */ val PickTargetAction: PickTargetAction with scala.Double = js.native
  /* 0 */ val Undecided: Undecided with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionWhichAction with scala.Double
  ] = js.native
}

