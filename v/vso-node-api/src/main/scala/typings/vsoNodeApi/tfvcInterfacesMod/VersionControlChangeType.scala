package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VersionControlChangeType extends StObject
@JSImport("vso-node-api/interfaces/TfvcInterfaces", "VersionControlChangeType")
@js.native
object VersionControlChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VersionControlChangeType with Double] = js.native
  
  @js.native
  sealed trait Add extends VersionControlChangeType
  /* 1 */ val Add: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.Add with Double = js.native
  
  @js.native
  sealed trait All extends VersionControlChangeType
  /* 8191 */ val All: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.All with Double = js.native
  
  @js.native
  sealed trait Branch extends VersionControlChangeType
  /* 64 */ val Branch: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.Branch with Double = js.native
  
  @js.native
  sealed trait Delete extends VersionControlChangeType
  /* 16 */ val Delete: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.Delete with Double = js.native
  
  @js.native
  sealed trait Edit extends VersionControlChangeType
  /* 2 */ val Edit: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.Edit with Double = js.native
  
  @js.native
  sealed trait Encoding extends VersionControlChangeType
  /* 4 */ val Encoding: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.Encoding with Double = js.native
  
  @js.native
  sealed trait Lock extends VersionControlChangeType
  /* 256 */ val Lock: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.Lock with Double = js.native
  
  @js.native
  sealed trait Merge extends VersionControlChangeType
  /* 128 */ val Merge: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.Merge with Double = js.native
  
  @js.native
  sealed trait None extends VersionControlChangeType
  /* 0 */ val None: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.None with Double = js.native
  
  @js.native
  sealed trait Property extends VersionControlChangeType
  /* 4096 */ val Property: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.Property with Double = js.native
  
  @js.native
  sealed trait Rename extends VersionControlChangeType
  /* 8 */ val Rename: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.Rename with Double = js.native
  
  @js.native
  sealed trait Rollback extends VersionControlChangeType
  /* 512 */ val Rollback: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.Rollback with Double = js.native
  
  @js.native
  sealed trait SourceRename extends VersionControlChangeType
  /* 1024 */ val SourceRename: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.SourceRename with Double = js.native
  
  @js.native
  sealed trait TargetRename extends VersionControlChangeType
  /* 2048 */ val TargetRename: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.TargetRename with Double = js.native
  
  @js.native
  sealed trait Undelete extends VersionControlChangeType
  /* 32 */ val Undelete: typings.vsoNodeApi.tfvcInterfacesMod.VersionControlChangeType.Undelete with Double = js.native
}
