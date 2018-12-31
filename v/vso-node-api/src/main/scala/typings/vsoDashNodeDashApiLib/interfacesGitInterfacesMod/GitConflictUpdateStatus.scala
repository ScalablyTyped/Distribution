package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitConflictUpdateStatus extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitConflictUpdateStatus")
@js.native
object GitConflictUpdateStatus extends js.Object {
  /**
    * Indicates that the update request did not fit the expected data contract
    */
  @js.native
  sealed trait BadRequest
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictUpdateStatus
  
  /**
    * Indicates that the requested resolution was not valid
    */
  @js.native
  sealed trait InvalidResolution
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictUpdateStatus
  
  /**
    * Indicates that the conflict could not be found
    */
  @js.native
  sealed trait NotFound
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictUpdateStatus
  
  /**
    * Indicates that pull request conflict update request was completed successfully
    */
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictUpdateStatus
  
  /**
    * Indicates that the conflict in the update request was not a supported conflict type
    */
  @js.native
  sealed trait UnsupportedConflictType
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictUpdateStatus
  
  /* 1 */ val BadRequest: BadRequest with scala.Double = js.native
  /* 2 */ val InvalidResolution: InvalidResolution with scala.Double = js.native
  /* 4 */ val NotFound: NotFound with scala.Double = js.native
  /* 0 */ val Succeeded: Succeeded with scala.Double = js.native
  /* 3 */ val UnsupportedConflictType: UnsupportedConflictType with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictUpdateStatus with scala.Double
  ] = js.native
}

