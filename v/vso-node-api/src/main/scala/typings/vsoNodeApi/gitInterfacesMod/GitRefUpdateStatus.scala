package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitRefUpdateStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitRefUpdateStatus")
@js.native
object GitRefUpdateStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitRefUpdateStatus with Double] = js.native
  
  /**
    * The ref update request could not be completed because the user lacks the permission to create a branch
    */
  @js.native
  sealed trait CreateBranchPermissionRequired extends GitRefUpdateStatus
  /* 8 */ val CreateBranchPermissionRequired: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.CreateBranchPermissionRequired with Double = js.native
  
  /**
    * The ref update request could not be completed because the user lacks the permission to create a tag
    */
  @js.native
  sealed trait CreateTagPermissionRequired extends GitRefUpdateStatus
  /* 9 */ val CreateTagPermissionRequired: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.CreateTagPermissionRequired with Double = js.native
  
  /**
    * Indicates that the ref update request could not be completed because part of the graph would be disconnected by this change, and the caller does not have ForcePush permission on the repository.
    */
  @js.native
  sealed trait ForcePushRequired extends GitRefUpdateStatus
  /* 1 */ val ForcePushRequired: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.ForcePushRequired with Double = js.native
  
  /**
    * Indicates that the ref update request could not be completed because the ref name presented in the request was not valid.
    */
  @js.native
  sealed trait InvalidRefName extends GitRefUpdateStatus
  /* 3 */ val InvalidRefName: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.InvalidRefName with Double = js.native
  
  /**
    * The ref update could not be completed because the ref is locked by another user.
    */
  @js.native
  sealed trait Locked extends GitRefUpdateStatus
  /* 11 */ val Locked: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.Locked with Double = js.native
  
  /**
    * The ref update request could not be completed because the user lacks note creation permissions required to write this note
    */
  @js.native
  sealed trait ManageNotePermissionRequired extends GitRefUpdateStatus
  /* 7 */ val ManageNotePermissionRequired: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.ManageNotePermissionRequired with Double = js.native
  
  /**
    * The ref update could not be completed because, in case-insensitive mode, the ref name conflicts with an existing, differently-cased ref name.
    */
  @js.native
  sealed trait RefNameConflict extends GitRefUpdateStatus
  /* 12 */ val RefNameConflict: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.RefNameConflict with Double = js.native
  
  /**
    * The ref update could not be completed because it was rejected by the plugin.
    */
  @js.native
  sealed trait RejectedByPlugin extends GitRefUpdateStatus
  /* 10 */ val RejectedByPlugin: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.RejectedByPlugin with Double = js.native
  
  /**
    * The ref update could not be completed because it was rejected by policy.
    */
  @js.native
  sealed trait RejectedByPolicy extends GitRefUpdateStatus
  /* 13 */ val RejectedByPolicy: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.RejectedByPolicy with Double = js.native
  
  /**
    * Indicates that the ref update request could not be completed because the old object ID presented in the request was not the object ID of the ref when the database attempted the update. The most likely scenario is that the caller lost a race to update the ref.
    */
  @js.native
  sealed trait StaleOldObjectId extends GitRefUpdateStatus
  /* 2 */ val StaleOldObjectId: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.StaleOldObjectId with Double = js.native
  
  /**
    * Indicates that the ref update request was completed successfully.
    */
  @js.native
  sealed trait Succeeded extends GitRefUpdateStatus
  /* 0 */ val Succeeded: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.Succeeded with Double = js.native
  
  /**
    * Indicates that the ref update request was completed successfully, but the passed-in ref was corrupt - as in, the old object ID was bad.  This should only happen during deletes.
    */
  @js.native
  sealed trait SucceededCorruptRef extends GitRefUpdateStatus
  /* 15 */ val SucceededCorruptRef: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.SucceededCorruptRef with Double = js.native
  
  /**
    * Indicates that the ref update request was completed successfully, but the ref doesn't actually exist so no changes were made.  This should only happen during deletes.
    */
  @js.native
  sealed trait SucceededNonExistentRef extends GitRefUpdateStatus
  /* 14 */ val SucceededNonExistentRef: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.SucceededNonExistentRef with Double = js.native
  
  /**
    * The request was not processed
    */
  @js.native
  sealed trait Unprocessed extends GitRefUpdateStatus
  /* 4 */ val Unprocessed: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.Unprocessed with Double = js.native
  
  /**
    * The ref update request could not be completed because the new object ID for the ref could not be resolved to a commit object (potentially through any number of tags)
    */
  @js.native
  sealed trait UnresolvableToCommit extends GitRefUpdateStatus
  /* 5 */ val UnresolvableToCommit: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.UnresolvableToCommit with Double = js.native
  
  /**
    * The ref update request could not be completed because the user lacks write permissions required to write this ref
    */
  @js.native
  sealed trait WritePermissionRequired extends GitRefUpdateStatus
  /* 6 */ val WritePermissionRequired: typings.vsoNodeApi.gitInterfacesMod.GitRefUpdateStatus.WritePermissionRequired with Double = js.native
}
