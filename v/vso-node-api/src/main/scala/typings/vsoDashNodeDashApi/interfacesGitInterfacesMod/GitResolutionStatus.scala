package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionStatus extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionStatus")
@js.native
object GitResolutionStatus extends js.Object {
  @js.native
  sealed trait PartiallyResolved extends GitResolutionStatus
  
  @js.native
  sealed trait Resolved extends GitResolutionStatus
  
  @js.native
  sealed trait Unresolved extends GitResolutionStatus
  
  /* 1 */ val PartiallyResolved: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionStatus.PartiallyResolved with Double = js.native
  /* 2 */ val Resolved: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionStatus.Resolved with Double = js.native
  /* 0 */ val Unresolved: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionStatus.Unresolved with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionStatus with Double] = js.native
}

