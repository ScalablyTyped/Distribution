package typings.winrt.Windows.Storage.Pickers.Provider

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileOpenPickerUI extends StObject {
  
  def addFile(id: String, file: IStorageFile): AddFileResult = js.native
  
  var allowedFileTypes: IVectorView[String] = js.native
  
  def canAddFile(file: IStorageFile): Boolean = js.native
  
  def containsFile(id: String): Boolean = js.native
  
  var onclosing: js.Any = js.native
  
  var onfileremoved: js.Any = js.native
  
  def removeFile(id: String): Unit = js.native
  
  var selectionMode: FileSelectionMode = js.native
  
  var settingsIdentifier: String = js.native
  
  var title: String = js.native
}
object IFileOpenPickerUI {
  
  @scala.inline
  def apply(
    addFile: (String, IStorageFile) => AddFileResult,
    allowedFileTypes: IVectorView[String],
    canAddFile: IStorageFile => Boolean,
    containsFile: String => Boolean,
    onclosing: js.Any,
    onfileremoved: js.Any,
    removeFile: String => Unit,
    selectionMode: FileSelectionMode,
    settingsIdentifier: String,
    title: String
  ): IFileOpenPickerUI = {
    val __obj = js.Dynamic.literal(addFile = js.Any.fromFunction2(addFile), allowedFileTypes = allowedFileTypes.asInstanceOf[js.Any], canAddFile = js.Any.fromFunction1(canAddFile), containsFile = js.Any.fromFunction1(containsFile), onclosing = onclosing.asInstanceOf[js.Any], onfileremoved = onfileremoved.asInstanceOf[js.Any], removeFile = js.Any.fromFunction1(removeFile), selectionMode = selectionMode.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOpenPickerUI]
  }
  
  @scala.inline
  implicit class IFileOpenPickerUIMutableBuilder[Self <: IFileOpenPickerUI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddFile(value: (String, IStorageFile) => AddFileResult): Self = StObject.set(x, "addFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAllowedFileTypes(value: IVectorView[String]): Self = StObject.set(x, "allowedFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanAddFile(value: IStorageFile => Boolean): Self = StObject.set(x, "canAddFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsFile(value: String => Boolean): Self = StObject.set(x, "containsFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnclosing(value: js.Any): Self = StObject.set(x, "onclosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfileremoved(value: js.Any): Self = StObject.set(x, "onfileremoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFile(value: String => Unit): Self = StObject.set(x, "removeFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectionMode(value: FileSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsIdentifier(value: String): Self = StObject.set(x, "settingsIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
