package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  sealed trait AddAdd
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Added on source and rename destination on target
       */
  @js.native
  sealed trait AddRename
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Deleted on source and edited on target
       */
  @js.native
  sealed trait DeleteEdit
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Deleted on source and renamed on target
       */
  @js.native
  sealed trait DeleteRename
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Children of directory which has DirectoryFile or FileDirectory conflict
       */
  @js.native
  sealed trait DirectoryChild
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Path is a directory on source and a file on target
       */
  @js.native
  sealed trait DirectoryFile
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Edited on source and deleted on target
       */
  @js.native
  sealed trait EditDelete
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Edited on source and target; content differs
       */
  @js.native
  sealed trait EditEdit
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Path is a file on source and a directory on target
       */
  @js.native
  sealed trait FileDirectory
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * No conflict
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Same file renamed on both source and target; destination paths differ
       */
  @js.native
  sealed trait Rename1to2
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Different files renamed to same destination path on both source and target
       */
  @js.native
  sealed trait Rename2to1
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Rename destination on source and new file on target
       */
  @js.native
  sealed trait RenameAdd
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Renamed on source and deleted on target
       */
  @js.native
  sealed trait RenameDelete
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /**
       * Rename destination on both source and target; content differs
       */
  @js.native
  sealed trait RenameRename
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType
  
  /* 1 */ val AddAdd: AddAdd with scala.Double = js.native
  /* 2 */ val AddRename: AddRename with scala.Double = js.native
  /* 3 */ val DeleteEdit: DeleteEdit with scala.Double = js.native
  /* 4 */ val DeleteRename: DeleteRename with scala.Double = js.native
  /* 6 */ val DirectoryChild: DirectoryChild with scala.Double = js.native
  /* 5 */ val DirectoryFile: DirectoryFile with scala.Double = js.native
  /* 7 */ val EditDelete: EditDelete with scala.Double = js.native
  /* 8 */ val EditEdit: EditEdit with scala.Double = js.native
  /* 9 */ val FileDirectory: FileDirectory with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 10 */ val Rename1to2: Rename1to2 with scala.Double = js.native
  /* 11 */ val Rename2to1: Rename2to1 with scala.Double = js.native
  /* 12 */ val RenameAdd: RenameAdd with scala.Double = js.native
  /* 13 */ val RenameDelete: RenameDelete with scala.Double = js.native
  /* 14 */ val RenameRename: RenameRename with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictType with scala.Double
  ] = js.native
}

