package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VersionControlChangeType extends js.Object

@JSImport("vso-node-api/interfaces/TfvcInterfaces", "VersionControlChangeType")
@js.native
object VersionControlChangeType extends js.Object {
  @js.native
  sealed trait Add extends VersionControlChangeType
  
  @js.native
  sealed trait All extends VersionControlChangeType
  
  @js.native
  sealed trait Branch extends VersionControlChangeType
  
  @js.native
  sealed trait Delete extends VersionControlChangeType
  
  @js.native
  sealed trait Edit extends VersionControlChangeType
  
  @js.native
  sealed trait Encoding extends VersionControlChangeType
  
  @js.native
  sealed trait Lock extends VersionControlChangeType
  
  @js.native
  sealed trait Merge extends VersionControlChangeType
  
  @js.native
  sealed trait None extends VersionControlChangeType
  
  @js.native
  sealed trait Property extends VersionControlChangeType
  
  @js.native
  sealed trait Rename extends VersionControlChangeType
  
  @js.native
  sealed trait Rollback extends VersionControlChangeType
  
  @js.native
  sealed trait SourceRename extends VersionControlChangeType
  
  @js.native
  sealed trait TargetRename extends VersionControlChangeType
  
  @js.native
  sealed trait Undelete extends VersionControlChangeType
  
  /* 1 */ val Add: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.Add with Double = js.native
  /* 8191 */ val All: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.All with Double = js.native
  /* 64 */ val Branch: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.Branch with Double = js.native
  /* 16 */ val Delete: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.Delete with Double = js.native
  /* 2 */ val Edit: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.Edit with Double = js.native
  /* 4 */ val Encoding: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.Encoding with Double = js.native
  /* 256 */ val Lock: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.Lock with Double = js.native
  /* 128 */ val Merge: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.Merge with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.None with Double = js.native
  /* 4096 */ val Property: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.Property with Double = js.native
  /* 8 */ val Rename: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.Rename with Double = js.native
  /* 512 */ val Rollback: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.Rollback with Double = js.native
  /* 1024 */ val SourceRename: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.SourceRename with Double = js.native
  /* 2048 */ val TargetRename: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.TargetRename with Double = js.native
  /* 32 */ val Undelete: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlChangeType.Undelete with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VersionControlChangeType with Double] = js.native
}

