package typings.winrt.Windows.Storage.Pickers.Provider

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileOpenPickerUI extends StObject {
  
  def addFile(id: String, file: IStorageFile): AddFileResult
  
  var allowedFileTypes: IVectorView[String]
  
  def canAddFile(file: IStorageFile): Boolean
  
  def containsFile(id: String): Boolean
  
  var onclosing: Any
  
  var onfileremoved: Any
  
  def removeFile(id: String): Unit
  
  var selectionMode: FileSelectionMode
  
  var settingsIdentifier: String
  
  var title: String
}
object IFileOpenPickerUI {
  
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
  ): IFileOpenPickerUI = {
    val __obj = js.Dynamic.literal(addFile = js.Any.fromFunction2(addFile), allowedFileTypes = allowedFileTypes.asInstanceOf[js.Any], canAddFile = js.Any.fromFunction1(canAddFile), containsFile = js.Any.fromFunction1(containsFile), onclosing = onclosing.asInstanceOf[js.Any], onfileremoved = onfileremoved.asInstanceOf[js.Any], removeFile = js.Any.fromFunction1(removeFile), selectionMode = selectionMode.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOpenPickerUI]
  }
  
  extension [Self <: IFileOpenPickerUI](x: Self) {
    
    inline def setAddFile(value: (String, IStorageFile) => AddFileResult): Self = StObject.set(x, "addFile", js.Any.fromFunction2(value))
    
    inline def setAllowedFileTypes(value: IVectorView[String]): Self = StObject.set(x, "allowedFileTypes", value.asInstanceOf[js.Any])
    
    inline def setCanAddFile(value: IStorageFile => Boolean): Self = StObject.set(x, "canAddFile", js.Any.fromFunction1(value))
    
    inline def setContainsFile(value: String => Boolean): Self = StObject.set(x, "containsFile", js.Any.fromFunction1(value))
    
    inline def setOnclosing(value: Any): Self = StObject.set(x, "onclosing", value.asInstanceOf[js.Any])
    
    inline def setOnfileremoved(value: Any): Self = StObject.set(x, "onfileremoved", value.asInstanceOf[js.Any])
    
    inline def setRemoveFile(value: String => Unit): Self = StObject.set(x, "removeFile", js.Any.fromFunction1(value))
    
    inline def setSelectionMode(value: FileSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSettingsIdentifier(value: String): Self = StObject.set(x, "settingsIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
