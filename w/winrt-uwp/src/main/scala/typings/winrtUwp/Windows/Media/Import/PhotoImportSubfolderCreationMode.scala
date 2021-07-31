package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoImportSubfolderCreationMode extends StObject
/** Specifies the method used for naming subfolders within the destination folder. */
@JSGlobal("Windows.Media.Import.PhotoImportSubfolderCreationMode")
@js.native
object PhotoImportSubfolderCreationMode extends StObject {
  
  /** Subfolders are created based on the EXIF date of the imported files. */
  @js.native
  sealed trait createSubfoldersFromExifDate
    extends StObject
       with PhotoImportSubfolderCreationMode
  
  /** Subfolders are created based on the file date of the imported files. */
  @js.native
  sealed trait createSubfoldersFromFileDate
    extends StObject
       with PhotoImportSubfolderCreationMode
  
  /** No subfolders are created. */
  @js.native
  sealed trait doNotCreateSubfolders
    extends StObject
       with PhotoImportSubfolderCreationMode
  
  /** Subfolders are created to match the folder structure of the import source. */
  @js.native
  sealed trait keepOriginalFolderStructure
    extends StObject
       with PhotoImportSubfolderCreationMode
}
