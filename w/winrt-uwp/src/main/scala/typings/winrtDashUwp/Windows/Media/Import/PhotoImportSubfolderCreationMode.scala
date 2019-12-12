package typings.winrtDashUwp.Windows.Media.Import

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.createSubfoldersFromExifDate
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.createSubfoldersFromFileDate
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.doNotCreateSubfolders
import typings.winrtDashUwp.Windows.Media.Import.PhotoImportSubfolderCreationMode.keepOriginalFolderStructure
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportSubfolderCreationMode with Double] = js.native
  /* 2 */ @js.native
  object createSubfoldersFromExifDate extends TopLevel[createSubfoldersFromExifDate with Double]
  
  /* 1 */ @js.native
  object createSubfoldersFromFileDate extends TopLevel[createSubfoldersFromFileDate with Double]
  
  /* 0 */ @js.native
  object doNotCreateSubfolders extends TopLevel[doNotCreateSubfolders with Double]
  
  /* 3 */ @js.native
  object keepOriginalFolderStructure extends TopLevel[keepOriginalFolderStructure with Double]
  
}

