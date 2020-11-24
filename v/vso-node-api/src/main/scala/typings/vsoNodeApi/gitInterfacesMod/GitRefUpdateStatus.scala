package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitRefUpdateStatus extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitRefUpdateStatus")
@js.native
object GitRefUpdateStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitRefUpdateStatus with Double] = js.native
  
  /**
    * The ref update request could not be completed because the user lacks the permission to create a branch
    */
  @js.native
  sealed trait CreateBranchPermissionRequired extends GitRefUpdateStatus
  /* 8 */ @js.native
  object CreateBranchPermissionRequired extends TopLevel[CreateBranchPermissionRequired with Double]
  
  /**
    * The ref update request could not be completed because the user lacks the permission to create a tag
    */
  @js.native
  sealed trait CreateTagPermissionRequired extends GitRefUpdateStatus
  /* 9 */ @js.native
  object CreateTagPermissionRequired extends TopLevel[CreateTagPermissionRequired with Double]
  
  /**
    * Indicates that the ref update request could not be completed because part of the graph would be disconnected by this change, and the caller does not have ForcePush permission on the repository.
    */
  @js.native
  sealed trait ForcePushRequired extends GitRefUpdateStatus
  /* 1 */ @js.native
  object ForcePushRequired extends TopLevel[ForcePushRequired with Double]
  
  /**
    * Indicates that the ref update request could not be completed because the ref name presented in the request was not valid.
    */
  @js.native
  sealed trait InvalidRefName extends GitRefUpdateStatus
  /* 3 */ @js.native
  object InvalidRefName extends TopLevel[InvalidRefName with Double]
  
  /**
    * The ref update could not be completed because the ref is locked by another user.
    */
  @js.native
  sealed trait Locked extends GitRefUpdateStatus
  /* 11 */ @js.native
  object Locked extends TopLevel[Locked with Double]
  
  /**
    * The ref update request could not be completed because the user lacks note creation permissions required to write this note
    */
  @js.native
  sealed trait ManageNotePermissionRequired extends GitRefUpdateStatus
  /* 7 */ @js.native
  object ManageNotePermissionRequired extends TopLevel[ManageNotePermissionRequired with Double]
  
  /**
    * The ref update could not be completed because, in case-insensitive mode, the ref name conflicts with an existing, differently-cased ref name.
    */
  @js.native
  sealed trait RefNameConflict extends GitRefUpdateStatus
  /* 12 */ @js.native
  object RefNameConflict extends TopLevel[RefNameConflict with Double]
  
  /**
    * The ref update could not be completed because it was rejected by the plugin.
    */
  @js.native
  sealed trait RejectedByPlugin extends GitRefUpdateStatus
  /* 10 */ @js.native
  object RejectedByPlugin extends TopLevel[RejectedByPlugin with Double]
  
  /**
    * The ref update could not be completed because it was rejected by policy.
    */
  @js.native
  sealed trait RejectedByPolicy extends GitRefUpdateStatus
  /* 13 */ @js.native
  object RejectedByPolicy extends TopLevel[RejectedByPolicy with Double]
  
  /**
    * Indicates that the ref update request could not be completed because the old object ID presented in the request was not the object ID of the ref when the database attempted the update. The most likely scenario is that the caller lost a race to update the ref.
    */
  @js.native
  sealed trait StaleOldObjectId extends GitRefUpdateStatus
  /* 2 */ @js.native
  object StaleOldObjectId extends TopLevel[StaleOldObjectId with Double]
  
  /**
    * Indicates that the ref update request was completed successfully.
    */
  @js.native
  sealed trait Succeeded extends GitRefUpdateStatus
  /* 0 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /**
    * Indicates that the ref update request was completed successfully, but the passed-in ref was corrupt - as in, the old object ID was bad.  This should only happen during deletes.
    */
  @js.native
  sealed trait SucceededCorruptRef extends GitRefUpdateStatus
  /* 15 */ @js.native
  object SucceededCorruptRef extends TopLevel[SucceededCorruptRef with Double]
  
  /**
    * Indicates that the ref update request was completed successfully, but the ref doesn't actually exist so no changes were made.  This should only happen during deletes.
    */
  @js.native
  sealed trait SucceededNonExistentRef extends GitRefUpdateStatus
  /* 14 */ @js.native
  object SucceededNonExistentRef extends TopLevel[SucceededNonExistentRef with Double]
  
  /**
    * The request was not processed
    */
  @js.native
  sealed trait Unprocessed extends GitRefUpdateStatus
  /* 4 */ @js.native
  object Unprocessed extends TopLevel[Unprocessed with Double]
  
  /**
    * The ref update request could not be completed because the new object ID for the ref could not be resolved to a commit object (potentially through any number of tags)
    */
  @js.native
  sealed trait UnresolvableToCommit extends GitRefUpdateStatus
  /* 5 */ @js.native
  object UnresolvableToCommit extends TopLevel[UnresolvableToCommit with Double]
  
  /**
    * The ref update request could not be completed because the user lacks write permissions required to write this ref
    */
  @js.native
  sealed trait WritePermissionRequired extends GitRefUpdateStatus
  /* 6 */ @js.native
  object WritePermissionRequired extends TopLevel[WritePermissionRequired with Double]
}
