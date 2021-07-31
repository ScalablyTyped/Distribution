package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitConflictUpdateStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitConflictUpdateStatus")
@js.native
object GitConflictUpdateStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitConflictUpdateStatus & Double] = js.native
  
  /**
    * Indicates that the update request did not fit the expected data contract
    */
  @js.native
  sealed trait BadRequest
    extends StObject
       with GitConflictUpdateStatus
  /* 1 */ val BadRequest: typings.vsoNodeApi.gitInterfacesMod.GitConflictUpdateStatus.BadRequest & Double = js.native
  
  /**
    * Indicates that the requested resolution was not valid
    */
  @js.native
  sealed trait InvalidResolution
    extends StObject
       with GitConflictUpdateStatus
  /* 2 */ val InvalidResolution: typings.vsoNodeApi.gitInterfacesMod.GitConflictUpdateStatus.InvalidResolution & Double = js.native
  
  /**
    * Indicates that the conflict could not be found
    */
  @js.native
  sealed trait NotFound
    extends StObject
       with GitConflictUpdateStatus
  /* 4 */ val NotFound: typings.vsoNodeApi.gitInterfacesMod.GitConflictUpdateStatus.NotFound & Double = js.native
  
  /**
    * Indicates that pull request conflict update request was completed successfully
    */
  @js.native
  sealed trait Succeeded
    extends StObject
       with GitConflictUpdateStatus
  /* 0 */ val Succeeded: typings.vsoNodeApi.gitInterfacesMod.GitConflictUpdateStatus.Succeeded & Double = js.native
  
  /**
    * Indicates that the conflict in the update request was not a supported conflict type
    */
  @js.native
  sealed trait UnsupportedConflictType
    extends StObject
       with GitConflictUpdateStatus
  /* 3 */ val UnsupportedConflictType: typings.vsoNodeApi.gitInterfacesMod.GitConflictUpdateStatus.UnsupportedConflictType & Double = js.native
}
