package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VersionControlChangeType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "VersionControlChangeType")
@js.native
object VersionControlChangeType extends js.Object {
  @js.native
  sealed trait Add
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait Branch
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait Delete
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait Edit
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait Encoding
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait Lock
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait Merge
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait Property
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait Rename
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait Rollback
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait SourceRename
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait TargetRename
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  @js.native
  sealed trait Undelete
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType
  
  /* 1 */ val Add: Add with scala.Double = js.native
  /* 8191 */ val All: All with scala.Double = js.native
  /* 64 */ val Branch: Branch with scala.Double = js.native
  /* 16 */ val Delete: Delete with scala.Double = js.native
  /* 2 */ val Edit: Edit with scala.Double = js.native
  /* 4 */ val Encoding: Encoding with scala.Double = js.native
  /* 256 */ val Lock: Lock with scala.Double = js.native
  /* 128 */ val Merge: Merge with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4096 */ val Property: Property with scala.Double = js.native
  /* 8 */ val Rename: Rename with scala.Double = js.native
  /* 512 */ val Rollback: Rollback with scala.Double = js.native
  /* 1024 */ val SourceRename: SourceRename with scala.Double = js.native
  /* 2048 */ val TargetRename: TargetRename with scala.Double = js.native
  /* 32 */ val Undelete: Undelete with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlChangeType with scala.Double
  ] = js.native
}

