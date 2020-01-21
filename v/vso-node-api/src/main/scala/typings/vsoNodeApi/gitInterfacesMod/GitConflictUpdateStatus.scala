package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  sealed trait BadRequest extends GitConflictUpdateStatus
  
  /**
    * Indicates that the requested resolution was not valid
    */
  @js.native
  sealed trait InvalidResolution extends GitConflictUpdateStatus
  
  /**
    * Indicates that the conflict could not be found
    */
  @js.native
  sealed trait NotFound extends GitConflictUpdateStatus
  
  /**
    * Indicates that pull request conflict update request was completed successfully
    */
  @js.native
  sealed trait Succeeded extends GitConflictUpdateStatus
  
  /**
    * Indicates that the conflict in the update request was not a supported conflict type
    */
  @js.native
  sealed trait UnsupportedConflictType extends GitConflictUpdateStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitConflictUpdateStatus with Double] = js.native
  /* 1 */ @js.native
  object BadRequest extends TopLevel[BadRequest with Double]
  
  /* 2 */ @js.native
  object InvalidResolution extends TopLevel[InvalidResolution with Double]
  
  /* 4 */ @js.native
  object NotFound extends TopLevel[NotFound with Double]
  
  /* 0 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /* 3 */ @js.native
  object UnsupportedConflictType extends TopLevel[UnsupportedConflictType with Double]
  
}

