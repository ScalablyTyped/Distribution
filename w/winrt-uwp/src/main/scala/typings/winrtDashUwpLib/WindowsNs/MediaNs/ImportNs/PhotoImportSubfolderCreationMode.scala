package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

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
  sealed trait createSubfoldersFromExifDate
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSubfolderCreationMode
  
  /** Subfolders are created based on the file date of the imported files. */
  @js.native
  sealed trait createSubfoldersFromFileDate
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSubfolderCreationMode
  
  /** No subfolders are created. */
  @js.native
  sealed trait doNotCreateSubfolders
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSubfolderCreationMode
  
  /** Subfolders are created to match the folder structure of the import source. */
  @js.native
  sealed trait keepOriginalFolderStructure
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSubfolderCreationMode
  
  /* 2 */ val createSubfoldersFromExifDate: createSubfoldersFromExifDate with scala.Double = js.native
  /* 1 */ val createSubfoldersFromFileDate: createSubfoldersFromFileDate with scala.Double = js.native
  /* 0 */ val doNotCreateSubfolders: doNotCreateSubfolders with scala.Double = js.native
  /* 3 */ val keepOriginalFolderStructure: keepOriginalFolderStructure with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportSubfolderCreationMode with scala.Double
  ] = js.native
}

