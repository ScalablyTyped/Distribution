package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitRefUpdateStatus extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitRefUpdateStatus")
@js.native
object GitRefUpdateStatus extends js.Object {
  /**
    * The ref update request could not be completed because the user lacks the permission to create a branch
    */
  @js.native
  sealed trait CreateBranchPermissionRequired extends GitRefUpdateStatus
  
  /**
    * The ref update request could not be completed because the user lacks the permission to create a tag
    */
  @js.native
  sealed trait CreateTagPermissionRequired extends GitRefUpdateStatus
  
  /**
    * Indicates that the ref update request could not be completed because part of the graph would be disconnected by this change, and the caller does not have ForcePush permission on the repository.
    */
  @js.native
  sealed trait ForcePushRequired extends GitRefUpdateStatus
  
  /**
    * Indicates that the ref update request could not be completed because the ref name presented in the request was not valid.
    */
  @js.native
  sealed trait InvalidRefName extends GitRefUpdateStatus
  
  /**
    * The ref update could not be completed because the ref is locked by another user.
    */
  @js.native
  sealed trait Locked extends GitRefUpdateStatus
  
  /**
    * The ref update request could not be completed because the user lacks note creation permissions required to write this note
    */
  @js.native
  sealed trait ManageNotePermissionRequired extends GitRefUpdateStatus
  
  /**
    * The ref update could not be completed because, in case-insensitive mode, the ref name conflicts with an existing, differently-cased ref name.
    */
  @js.native
  sealed trait RefNameConflict extends GitRefUpdateStatus
  
  /**
    * The ref update could not be completed because it was rejected by the plugin.
    */
  @js.native
  sealed trait RejectedByPlugin extends GitRefUpdateStatus
  
  /**
    * The ref update could not be completed because it was rejected by policy.
    */
  @js.native
  sealed trait RejectedByPolicy extends GitRefUpdateStatus
  
  /**
    * Indicates that the ref update request could not be completed because the old object ID presented in the request was not the object ID of the ref when the database attempted the update. The most likely scenario is that the caller lost a race to update the ref.
    */
  @js.native
  sealed trait StaleOldObjectId extends GitRefUpdateStatus
  
  /**
    * Indicates that the ref update request was completed successfully.
    */
  @js.native
  sealed trait Succeeded extends GitRefUpdateStatus
  
  /**
    * Indicates that the ref update request was completed successfully, but the passed-in ref was corrupt - as in, the old object ID was bad.  This should only happen during deletes.
    */
  @js.native
  sealed trait SucceededCorruptRef extends GitRefUpdateStatus
  
  /**
    * Indicates that the ref update request was completed successfully, but the ref doesn't actually exist so no changes were made.  This should only happen during deletes.
    */
  @js.native
  sealed trait SucceededNonExistentRef extends GitRefUpdateStatus
  
  /**
    * The request was not processed
    */
  @js.native
  sealed trait Unprocessed extends GitRefUpdateStatus
  
  /**
    * The ref update request could not be completed because the new object ID for the ref could not be resolved to a commit object (potentially through any number of tags)
    */
  @js.native
  sealed trait UnresolvableToCommit extends GitRefUpdateStatus
  
  /**
    * The ref update request could not be completed because the user lacks write permissions required to write this ref
    */
  @js.native
  sealed trait WritePermissionRequired extends GitRefUpdateStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitRefUpdateStatus with Double] = js.native
  /* 8 */ @js.native
  object CreateBranchPermissionRequired extends TopLevel[CreateBranchPermissionRequired with Double]
  
  /* 9 */ @js.native
  object CreateTagPermissionRequired extends TopLevel[CreateTagPermissionRequired with Double]
  
  /* 1 */ @js.native
  object ForcePushRequired extends TopLevel[ForcePushRequired with Double]
  
  /* 3 */ @js.native
  object InvalidRefName extends TopLevel[InvalidRefName with Double]
  
  /* 11 */ @js.native
  object Locked extends TopLevel[Locked with Double]
  
  /* 7 */ @js.native
  object ManageNotePermissionRequired extends TopLevel[ManageNotePermissionRequired with Double]
  
  /* 12 */ @js.native
  object RefNameConflict extends TopLevel[RefNameConflict with Double]
  
  /* 10 */ @js.native
  object RejectedByPlugin extends TopLevel[RejectedByPlugin with Double]
  
  /* 13 */ @js.native
  object RejectedByPolicy extends TopLevel[RejectedByPolicy with Double]
  
  /* 2 */ @js.native
  object StaleOldObjectId extends TopLevel[StaleOldObjectId with Double]
  
  /* 0 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /* 15 */ @js.native
  object SucceededCorruptRef extends TopLevel[SucceededCorruptRef with Double]
  
  /* 14 */ @js.native
  object SucceededNonExistentRef extends TopLevel[SucceededNonExistentRef with Double]
  
  /* 4 */ @js.native
  object Unprocessed extends TopLevel[Unprocessed with Double]
  
  /* 5 */ @js.native
  object UnresolvableToCommit extends TopLevel[UnresolvableToCommit with Double]
  
  /* 6 */ @js.native
  object WritePermissionRequired extends TopLevel[WritePermissionRequired with Double]
  
}

