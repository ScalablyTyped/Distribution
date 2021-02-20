package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitConflictUpdateStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitConflictUpdateStatus")
@js.native
object GitConflictUpdateStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitConflictUpdateStatus with Double] = js.native
  
  /**
    * Indicates that the update request did not fit the expected data contract
    */
  @js.native
  sealed trait BadRequest extends GitConflictUpdateStatus
  /* 1 */ val BadRequest: typings.vsoNodeApi.gitInterfacesMod.GitConflictUpdateStatus.BadRequest with Double = js.native
  
  /**
    * Indicates that the requested resolution was not valid
    */
  @js.native
  sealed trait InvalidResolution extends GitConflictUpdateStatus
  /* 2 */ val InvalidResolution: typings.vsoNodeApi.gitInterfacesMod.GitConflictUpdateStatus.InvalidResolution with Double = js.native
  
  /**
    * Indicates that the conflict could not be found
    */
  @js.native
  sealed trait NotFound extends GitConflictUpdateStatus
  /* 4 */ val NotFound: typings.vsoNodeApi.gitInterfacesMod.GitConflictUpdateStatus.NotFound with Double = js.native
  
  /**
    * Indicates that pull request conflict update request was completed successfully
    */
  @js.native
  sealed trait Succeeded extends GitConflictUpdateStatus
  /* 0 */ val Succeeded: typings.vsoNodeApi.gitInterfacesMod.GitConflictUpdateStatus.Succeeded with Double = js.native
  
  /**
    * Indicates that the conflict in the update request was not a supported conflict type
    */
  @js.native
  sealed trait UnsupportedConflictType extends GitConflictUpdateStatus
  /* 3 */ val UnsupportedConflictType: typings.vsoNodeApi.gitInterfacesMod.GitConflictUpdateStatus.UnsupportedConflictType with Double = js.native
}
