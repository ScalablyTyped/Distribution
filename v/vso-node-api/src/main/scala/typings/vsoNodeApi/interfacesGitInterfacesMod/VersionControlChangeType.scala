package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VersionControlChangeType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "VersionControlChangeType")
@js.native
object VersionControlChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VersionControlChangeType & Double] = js.native
  
  @js.native
  sealed trait Add
    extends StObject
       with VersionControlChangeType
  /* 1 */ val Add: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Add & Double = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with VersionControlChangeType
  /* 8191 */ val All: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.All & Double = js.native
  
  @js.native
  sealed trait Branch
    extends StObject
       with VersionControlChangeType
  /* 64 */ val Branch: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Branch & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with VersionControlChangeType
  /* 16 */ val Delete: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Delete & Double = js.native
  
  @js.native
  sealed trait Edit
    extends StObject
       with VersionControlChangeType
  /* 2 */ val Edit: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Edit & Double = js.native
  
  @js.native
  sealed trait Encoding
    extends StObject
       with VersionControlChangeType
  /* 4 */ val Encoding: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Encoding & Double = js.native
  
  @js.native
  sealed trait Lock
    extends StObject
       with VersionControlChangeType
  /* 256 */ val Lock: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Lock & Double = js.native
  
  @js.native
  sealed trait Merge
    extends StObject
       with VersionControlChangeType
  /* 128 */ val Merge: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Merge & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with VersionControlChangeType
  /* 0 */ val None: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.None & Double = js.native
  
  @js.native
  sealed trait Property
    extends StObject
       with VersionControlChangeType
  /* 4096 */ val Property: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Property & Double = js.native
  
  @js.native
  sealed trait Rename
    extends StObject
       with VersionControlChangeType
  /* 8 */ val Rename: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Rename & Double = js.native
  
  @js.native
  sealed trait Rollback
    extends StObject
       with VersionControlChangeType
  /* 512 */ val Rollback: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Rollback & Double = js.native
  
  @js.native
  sealed trait SourceRename
    extends StObject
       with VersionControlChangeType
  /* 1024 */ val SourceRename: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.SourceRename & Double = js.native
  
  @js.native
  sealed trait TargetRename
    extends StObject
       with VersionControlChangeType
  /* 2048 */ val TargetRename: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.TargetRename & Double = js.native
  
  @js.native
  sealed trait Undelete
    extends StObject
       with VersionControlChangeType
  /* 32 */ val Undelete: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlChangeType.Undelete & Double = js.native
}
