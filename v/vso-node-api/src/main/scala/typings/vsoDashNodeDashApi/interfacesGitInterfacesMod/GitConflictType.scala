package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
  
  /* 1 */ val AddAdd: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.AddAdd with Double = js.native
  /* 2 */ val AddRename: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.AddRename with Double = js.native
  /* 3 */ val DeleteEdit: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.DeleteEdit with Double = js.native
  /* 4 */ val DeleteRename: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.DeleteRename with Double = js.native
  /* 6 */ val DirectoryChild: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.DirectoryChild with Double = js.native
  /* 5 */ val DirectoryFile: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.DirectoryFile with Double = js.native
  /* 7 */ val EditDelete: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.EditDelete with Double = js.native
  /* 8 */ val EditEdit: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.EditEdit with Double = js.native
  /* 9 */ val FileDirectory: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.FileDirectory with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.None with Double = js.native
  /* 10 */ val Rename1to2: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.Rename1to2 with Double = js.native
  /* 11 */ val Rename2to1: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.Rename2to1 with Double = js.native
  /* 12 */ val RenameAdd: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.RenameAdd with Double = js.native
  /* 13 */ val RenameDelete: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.RenameDelete with Double = js.native
  /* 14 */ val RenameRename: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictType.RenameRename with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitConflictType with Double] = js.native
}

