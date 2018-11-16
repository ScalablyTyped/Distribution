package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionStatus extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionStatus")
@js.native
object GitResolutionStatus extends js.Object {
  @js.native
  sealed trait PartiallyResolved
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionStatus
  
  @js.native
  sealed trait Resolved
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionStatus
  
  @js.native
  sealed trait Unresolved
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionStatus
  
  /* 1 */ val PartiallyResolved: PartiallyResolved with scala.Double = js.native
  /* 2 */ val Resolved: Resolved with scala.Double = js.native
  /* 0 */ val Unresolved: Unresolved with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionStatus with scala.Double
  ] = js.native
}

