package typings.winrt.Windows.Storage.Pickers.Provider

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOpenPickerUI
  extends StObject
     with IFileOpenPickerUI
object FileOpenPickerUI {
  
  inline def apply(
    addFile: (String, IStorageFile) => AddFileResult,
    allowedFileTypes: IVectorView[String],
    canAddFile: IStorageFile => Boolean,
    containsFile: String => Boolean,
    onclosing: Any,
    onfileremoved: Any,
    removeFile: String => Unit,
    selectionMode: FileSelectionMode,
    settingsIdentifier: String,
    title: String
  ): FileOpenPickerUI = {
    val __obj = js.Dynamic.literal(addFile = js.Any.fromFunction2(addFile), allowedFileTypes = allowedFileTypes.asInstanceOf[js.Any], canAddFile = js.Any.fromFunction1(canAddFile), containsFile = js.Any.fromFunction1(containsFile), onclosing = onclosing.asInstanceOf[js.Any], onfileremoved = onfileremoved.asInstanceOf[js.Any], removeFile = js.Any.fromFunction1(removeFile), selectionMode = selectionMode.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOpenPickerUI]
  }
}
