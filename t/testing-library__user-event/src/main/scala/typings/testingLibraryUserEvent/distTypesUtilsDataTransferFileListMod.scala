package typings.testingLibraryUserEvent

import typings.std.File
import typings.std.FileList
import typings.testingLibraryUserEvent.distTypesDocumentTrackValueMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsDataTransferFileListMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/dataTransfer/FileList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFileList(window: Window & (/* globalThis */ Any), files: js.Array[File]): FileList = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileList")(window.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[FileList]
}
