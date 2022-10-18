package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitConflictType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitConflictType")
@js.native
object GitConflictType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitConflictType & Double] = js.native
  
  /**
    * Added on source and target; content differs
    */
  @js.native
  sealed trait AddAdd
    extends StObject
       with GitConflictType
  /* 1 */ val AddAdd: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.AddAdd & Double = js.native
  
  /**
    * Added on source and rename destination on target
    */
  @js.native
  sealed trait AddRename
    extends StObject
       with GitConflictType
  /* 2 */ val AddRename: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.AddRename & Double = js.native
  
  /**
    * Deleted on source and edited on target
    */
  @js.native
  sealed trait DeleteEdit
    extends StObject
       with GitConflictType
  /* 3 */ val DeleteEdit: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.DeleteEdit & Double = js.native
  
  /**
    * Deleted on source and renamed on target
    */
  @js.native
  sealed trait DeleteRename
    extends StObject
       with GitConflictType
  /* 4 */ val DeleteRename: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.DeleteRename & Double = js.native
  
  /**
    * Children of directory which has DirectoryFile or FileDirectory conflict
    */
  @js.native
  sealed trait DirectoryChild
    extends StObject
       with GitConflictType
  /* 6 */ val DirectoryChild: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.DirectoryChild & Double = js.native
  
  /**
    * Path is a directory on source and a file on target
    */
  @js.native
  sealed trait DirectoryFile
    extends StObject
       with GitConflictType
  /* 5 */ val DirectoryFile: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.DirectoryFile & Double = js.native
  
  /**
    * Edited on source and deleted on target
    */
  @js.native
  sealed trait EditDelete
    extends StObject
       with GitConflictType
  /* 7 */ val EditDelete: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.EditDelete & Double = js.native
  
  /**
    * Edited on source and target; content differs
    */
  @js.native
  sealed trait EditEdit
    extends StObject
       with GitConflictType
  /* 8 */ val EditEdit: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.EditEdit & Double = js.native
  
  /**
    * Path is a file on source and a directory on target
    */
  @js.native
  sealed trait FileDirectory
    extends StObject
       with GitConflictType
  /* 9 */ val FileDirectory: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.FileDirectory & Double = js.native
  
  /**
    * No conflict
    */
  @js.native
  sealed trait None
    extends StObject
       with GitConflictType
  /* 0 */ val None: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.None & Double = js.native
  
  /**
    * Same file renamed on both source and target; destination paths differ
    */
  @js.native
  sealed trait Rename1to2
    extends StObject
       with GitConflictType
  /* 10 */ val Rename1to2: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.Rename1to2 & Double = js.native
  
  /**
    * Different files renamed to same destination path on both source and target
    */
  @js.native
  sealed trait Rename2to1
    extends StObject
       with GitConflictType
  /* 11 */ val Rename2to1: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.Rename2to1 & Double = js.native
  
  /**
    * Rename destination on source and new file on target
    */
  @js.native
  sealed trait RenameAdd
    extends StObject
       with GitConflictType
  /* 12 */ val RenameAdd: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.RenameAdd & Double = js.native
  
  /**
    * Renamed on source and deleted on target
    */
  @js.native
  sealed trait RenameDelete
    extends StObject
       with GitConflictType
  /* 13 */ val RenameDelete: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.RenameDelete & Double = js.native
  
  /**
    * Rename destination on both source and target; content differs
    */
  @js.native
  sealed trait RenameRename
    extends StObject
       with GitConflictType
  /* 14 */ val RenameRename: typings.vsoNodeApi.interfacesGitInterfacesMod.GitConflictType.RenameRename & Double = js.native
}
