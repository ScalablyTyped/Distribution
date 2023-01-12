package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragAreaPlaceholder extends StObject {
  
  var dragAreaPlaceholder: String
  
  var fileDecorator: String
  
  var fileInput: String
  
  var fileList: String
  
  var fileSign: String
  
  var placeholderInput: String
  
  var preview: String
  
  var removeButton: String
  
  var removeButtonBottom: String
  
  var removeFile: String
  
  var root: String
}
object DragAreaPlaceholder {
  
  inline def apply(
    dragAreaPlaceholder: String,
    fileDecorator: String,
    fileInput: String,
    fileList: String,
    fileSign: String,
    placeholderInput: String,
    preview: String,
    removeButton: String,
    removeButtonBottom: String,
    removeFile: String,
    root: String
  ): DragAreaPlaceholder = {
    val __obj = js.Dynamic.literal(dragAreaPlaceholder = dragAreaPlaceholder.asInstanceOf[js.Any], fileDecorator = fileDecorator.asInstanceOf[js.Any], fileInput = fileInput.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any], fileSign = fileSign.asInstanceOf[js.Any], placeholderInput = placeholderInput.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], removeButton = removeButton.asInstanceOf[js.Any], removeButtonBottom = removeButtonBottom.asInstanceOf[js.Any], removeFile = removeFile.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragAreaPlaceholder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragAreaPlaceholder] (val x: Self) extends AnyVal {
    
    inline def setDragAreaPlaceholder(value: String): Self = StObject.set(x, "dragAreaPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setFileDecorator(value: String): Self = StObject.set(x, "fileDecorator", value.asInstanceOf[js.Any])
    
    inline def setFileInput(value: String): Self = StObject.set(x, "fileInput", value.asInstanceOf[js.Any])
    
    inline def setFileList(value: String): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileSign(value: String): Self = StObject.set(x, "fileSign", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderInput(value: String): Self = StObject.set(x, "placeholderInput", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setRemoveButton(value: String): Self = StObject.set(x, "removeButton", value.asInstanceOf[js.Any])
    
    inline def setRemoveButtonBottom(value: String): Self = StObject.set(x, "removeButtonBottom", value.asInstanceOf[js.Any])
    
    inline def setRemoveFile(value: String): Self = StObject.set(x, "removeFile", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
