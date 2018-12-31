package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  sealed trait CreateBranchPermissionRequired
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * The ref update request could not be completed because the user lacks the permission to create a tag
    */
  @js.native
  sealed trait CreateTagPermissionRequired
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * Indicates that the ref update request could not be completed because part of the graph would be disconnected by this change, and the caller does not have ForcePush permission on the repository.
    */
  @js.native
  sealed trait ForcePushRequired
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * Indicates that the ref update request could not be completed because the ref name presented in the request was not valid.
    */
  @js.native
  sealed trait InvalidRefName
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * The ref update could not be completed because the ref is locked by another user.
    */
  @js.native
  sealed trait Locked
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * The ref update request could not be completed because the user lacks note creation permissions required to write this note
    */
  @js.native
  sealed trait ManageNotePermissionRequired
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * The ref update could not be completed because, in case-insensitive mode, the ref name conflicts with an existing, differently-cased ref name.
    */
  @js.native
  sealed trait RefNameConflict
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * The ref update could not be completed because it was rejected by the plugin.
    */
  @js.native
  sealed trait RejectedByPlugin
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * The ref update could not be completed because it was rejected by policy.
    */
  @js.native
  sealed trait RejectedByPolicy
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * Indicates that the ref update request could not be completed because the old object ID presented in the request was not the object ID of the ref when the database attempted the update. The most likely scenario is that the caller lost a race to update the ref.
    */
  @js.native
  sealed trait StaleOldObjectId
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * Indicates that the ref update request was completed successfully.
    */
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * Indicates that the ref update request was completed successfully, but the passed-in ref was corrupt - as in, the old object ID was bad.  This should only happen during deletes.
    */
  @js.native
  sealed trait SucceededCorruptRef
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * Indicates that the ref update request was completed successfully, but the ref doesn't actually exist so no changes were made.  This should only happen during deletes.
    */
  @js.native
  sealed trait SucceededNonExistentRef
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * The request was not processed
    */
  @js.native
  sealed trait Unprocessed
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * The ref update request could not be completed because the new object ID for the ref could not be resolved to a commit object (potentially through any number of tags)
    */
  @js.native
  sealed trait UnresolvableToCommit
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /**
    * The ref update request could not be completed because the user lacks write permissions required to write this ref
    */
  @js.native
  sealed trait WritePermissionRequired
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus
  
  /* 8 */ val CreateBranchPermissionRequired: CreateBranchPermissionRequired with scala.Double = js.native
  /* 9 */ val CreateTagPermissionRequired: CreateTagPermissionRequired with scala.Double = js.native
  /* 1 */ val ForcePushRequired: ForcePushRequired with scala.Double = js.native
  /* 3 */ val InvalidRefName: InvalidRefName with scala.Double = js.native
  /* 11 */ val Locked: Locked with scala.Double = js.native
  /* 7 */ val ManageNotePermissionRequired: ManageNotePermissionRequired with scala.Double = js.native
  /* 12 */ val RefNameConflict: RefNameConflict with scala.Double = js.native
  /* 10 */ val RejectedByPlugin: RejectedByPlugin with scala.Double = js.native
  /* 13 */ val RejectedByPolicy: RejectedByPolicy with scala.Double = js.native
  /* 2 */ val StaleOldObjectId: StaleOldObjectId with scala.Double = js.native
  /* 0 */ val Succeeded: Succeeded with scala.Double = js.native
  /* 15 */ val SucceededCorruptRef: SucceededCorruptRef with scala.Double = js.native
  /* 14 */ val SucceededNonExistentRef: SucceededNonExistentRef with scala.Double = js.native
  /* 4 */ val Unprocessed: Unprocessed with scala.Double = js.native
  /* 5 */ val UnresolvableToCommit: UnresolvableToCommit with scala.Double = js.native
  /* 6 */ val WritePermissionRequired: WritePermissionRequired with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateStatus with scala.Double
  ] = js.native
}

