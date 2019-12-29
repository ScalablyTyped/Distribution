package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitConflictType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitConflictType")
@js.native
object GitConflictType extends js.Object {
  /**
    * Added on source and target; content differs
    */
  @js.native
  sealed trait AddAdd extends GitConflictType
  
  /**
    * Added on source and rename destination on target
    */
  @js.native
  sealed trait AddRename extends GitConflictType
  
  /**
    * Deleted on source and edited on target
    */
  @js.native
  sealed trait DeleteEdit extends GitConflictType
  
  /**
    * Deleted on source and renamed on target
    */
  @js.native
  sealed trait DeleteRename extends GitConflictType
  
  /**
    * Children of directory which has DirectoryFile or FileDirectory conflict
    */
  @js.native
  sealed trait DirectoryChild extends GitConflictType
  
  /**
    * Path is a directory on source and a file on target
    */
  @js.native
  sealed trait DirectoryFile extends GitConflictType
  
  /**
    * Edited on source and deleted on target
    */
  @js.native
  sealed trait EditDelete extends GitConflictType
  
  /**
    * Edited on source and target; content differs
    */
  @js.native
  sealed trait EditEdit extends GitConflictType
  
  /**
    * Path is a file on source and a directory on target
    */
  @js.native
  sealed trait FileDirectory extends GitConflictType
  
  /**
    * No conflict
    */
  @js.native
  sealed trait None extends GitConflictType
  
  /**
    * Same file renamed on both source and target; destination paths differ
    */
  @js.native
  sealed trait Rename1to2 extends GitConflictType
  
  /**
    * Different files renamed to same destination path on both source and target
    */
  @js.native
  sealed trait Rename2to1 extends GitConflictType
  
  /**
    * Rename destination on source and new file on target
    */
  @js.native
  sealed trait RenameAdd extends GitConflictType
  
  /**
    * Renamed on source and deleted on target
    */
  @js.native
  sealed trait RenameDelete extends GitConflictType
  
  /**
    * Rename destination on both source and target; content differs
    */
  @js.native
  sealed trait RenameRename extends GitConflictType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitConflictType with Double] = js.native
  /* 1 */ @js.native
  object AddAdd extends TopLevel[AddAdd with Double]
  
  /* 2 */ @js.native
  object AddRename extends TopLevel[AddRename with Double]
  
  /* 3 */ @js.native
  object DeleteEdit extends TopLevel[DeleteEdit with Double]
  
  /* 4 */ @js.native
  object DeleteRename extends TopLevel[DeleteRename with Double]
  
  /* 6 */ @js.native
  object DirectoryChild extends TopLevel[DirectoryChild with Double]
  
  /* 5 */ @js.native
  object DirectoryFile extends TopLevel[DirectoryFile with Double]
  
  /* 7 */ @js.native
  object EditDelete extends TopLevel[EditDelete with Double]
  
  /* 8 */ @js.native
  object EditEdit extends TopLevel[EditEdit with Double]
  
  /* 9 */ @js.native
  object FileDirectory extends TopLevel[FileDirectory with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 10 */ @js.native
  object Rename1to2 extends TopLevel[Rename1to2 with Double]
  
  /* 11 */ @js.native
  object Rename2to1 extends TopLevel[Rename2to1 with Double]
  
  /* 12 */ @js.native
  object RenameAdd extends TopLevel[RenameAdd with Double]
  
  /* 13 */ @js.native
  object RenameDelete extends TopLevel[RenameDelete with Double]
  
  /* 14 */ @js.native
  object RenameRename extends TopLevel[RenameRename with Double]
  
}

