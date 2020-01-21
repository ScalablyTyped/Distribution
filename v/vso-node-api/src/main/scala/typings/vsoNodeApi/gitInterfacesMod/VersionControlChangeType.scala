package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VersionControlChangeType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "VersionControlChangeType")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VersionControlChangeType with Double] = js.native
  /* 1 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  /* 8191 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 64 */ @js.native
  object Branch extends TopLevel[Branch with Double]
  
  /* 16 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 2 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  /* 4 */ @js.native
  object Encoding extends TopLevel[Encoding with Double]
  
  /* 256 */ @js.native
  object Lock extends TopLevel[Lock with Double]
  
  /* 128 */ @js.native
  object Merge extends TopLevel[Merge with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4096 */ @js.native
  object Property extends TopLevel[Property with Double]
  
  /* 8 */ @js.native
  object Rename extends TopLevel[Rename with Double]
  
  /* 512 */ @js.native
  object Rollback extends TopLevel[Rollback with Double]
  
  /* 1024 */ @js.native
  object SourceRename extends TopLevel[SourceRename with Double]
  
  /* 2048 */ @js.native
  object TargetRename extends TopLevel[TargetRename with Double]
  
  /* 32 */ @js.native
  object Undelete extends TopLevel[Undelete with Double]
  
}

