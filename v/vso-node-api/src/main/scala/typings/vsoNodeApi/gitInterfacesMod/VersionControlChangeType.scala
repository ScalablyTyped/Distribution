package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VersionControlChangeType extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "VersionControlChangeType")
@js.native
object VersionControlChangeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VersionControlChangeType with Double] = js.native
  
  @js.native
  sealed trait Add extends VersionControlChangeType
  /* 1 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  @js.native
  sealed trait All extends VersionControlChangeType
  /* 8191 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait Branch extends VersionControlChangeType
  /* 64 */ @js.native
  object Branch extends TopLevel[Branch with Double]
  
  @js.native
  sealed trait Delete extends VersionControlChangeType
  /* 16 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  @js.native
  sealed trait Edit extends VersionControlChangeType
  /* 2 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  @js.native
  sealed trait Encoding extends VersionControlChangeType
  /* 4 */ @js.native
  object Encoding extends TopLevel[Encoding with Double]
  
  @js.native
  sealed trait Lock extends VersionControlChangeType
  /* 256 */ @js.native
  object Lock extends TopLevel[Lock with Double]
  
  @js.native
  sealed trait Merge extends VersionControlChangeType
  /* 128 */ @js.native
  object Merge extends TopLevel[Merge with Double]
  
  @js.native
  sealed trait None extends VersionControlChangeType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Property extends VersionControlChangeType
  /* 4096 */ @js.native
  object Property extends TopLevel[Property with Double]
  
  @js.native
  sealed trait Rename extends VersionControlChangeType
  /* 8 */ @js.native
  object Rename extends TopLevel[Rename with Double]
  
  @js.native
  sealed trait Rollback extends VersionControlChangeType
  /* 512 */ @js.native
  object Rollback extends TopLevel[Rollback with Double]
  
  @js.native
  sealed trait SourceRename extends VersionControlChangeType
  /* 1024 */ @js.native
  object SourceRename extends TopLevel[SourceRename with Double]
  
  @js.native
  sealed trait TargetRename extends VersionControlChangeType
  /* 2048 */ @js.native
  object TargetRename extends TopLevel[TargetRename with Double]
  
  @js.native
  sealed trait Undelete extends VersionControlChangeType
  /* 32 */ @js.native
  object Undelete extends TopLevel[Undelete with Double]
}
