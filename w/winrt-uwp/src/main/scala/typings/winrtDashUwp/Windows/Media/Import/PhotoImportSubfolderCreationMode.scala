package typings.winrtDashUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportSubfolderCreationMode extends js.Object

/** Specifies the method used for naming subfolders within the destination folder. */
@JSGlobal("Windows.Media.Import.PhotoImportSubfolderCreationMode")
@js.native
object PhotoImportSubfolderCreationMode extends js.Object {
  /** Subfolders are created based on the EXIF date of the imported files. */
  @js.native
  sealed trait createSubfoldersFromExifDate extends PhotoImportSubfolderCreationMode
  
  /** Subfolders are created based on the file date of the imported files. */
  @js.native
  sealed trait createSubfoldersFromFileDate extends PhotoImportSubfolderCreationMode
  
  /** No subfolders are created. */
  @js.native
  sealed trait doNotCreateSubfolders extends PhotoImportSubfolderCreationMode
  
  /** Subfolders are created to match the folder structure of the import source. */
  @js.native
  sealed trait keepOriginalFolderStructure extends PhotoImportSubfolderCreationMode
  
  /* 2 */ val createSubfoldersFromExifDate: typings.winrtDashUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.createSubfoldersFromExifDate with Double = js.native
  /* 1 */ val createSubfoldersFromFileDate: typings.winrtDashUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.createSubfoldersFromFileDate with Double = js.native
  /* 0 */ val doNotCreateSubfolders: typings.winrtDashUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.doNotCreateSubfolders with Double = js.native
  /* 3 */ val keepOriginalFolderStructure: typings.winrtDashUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.keepOriginalFolderStructure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportSubfolderCreationMode with Double] = js.native
}

