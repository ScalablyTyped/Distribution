package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
  
  /* 8 */ val CreateBranchPermissionRequired: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.CreateBranchPermissionRequired with Double = js.native
  /* 9 */ val CreateTagPermissionRequired: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.CreateTagPermissionRequired with Double = js.native
  /* 1 */ val ForcePushRequired: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.ForcePushRequired with Double = js.native
  /* 3 */ val InvalidRefName: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.InvalidRefName with Double = js.native
  /* 11 */ val Locked: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.Locked with Double = js.native
  /* 7 */ val ManageNotePermissionRequired: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.ManageNotePermissionRequired with Double = js.native
  /* 12 */ val RefNameConflict: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.RefNameConflict with Double = js.native
  /* 10 */ val RejectedByPlugin: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.RejectedByPlugin with Double = js.native
  /* 13 */ val RejectedByPolicy: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.RejectedByPolicy with Double = js.native
  /* 2 */ val StaleOldObjectId: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.StaleOldObjectId with Double = js.native
  /* 0 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.Succeeded with Double = js.native
  /* 15 */ val SucceededCorruptRef: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.SucceededCorruptRef with Double = js.native
  /* 14 */ val SucceededNonExistentRef: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.SucceededNonExistentRef with Double = js.native
  /* 4 */ val Unprocessed: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.Unprocessed with Double = js.native
  /* 5 */ val UnresolvableToCommit: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.UnresolvableToCommit with Double = js.native
  /* 6 */ val WritePermissionRequired: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateStatus.WritePermissionRequired with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitRefUpdateStatus with Double] = js.native
}

