package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseFile extends StObject {
  
  var chooseFile: String
  
  var dragAreaPlaceholder: String
  
  var fileDecorator: String
  
  var fileInput: String
  
  var fileList: String
  
  var fileSign: String
  
  var noFileChosen: String
  
  var placeholderInput: String
  
  var preview: String
  
  var removeButton: String
  
  var removeFile: String
  
  var root: String
}
object ChooseFile {
  
  inline def apply(
    chooseFile: String,
    dragAreaPlaceholder: String,
    fileDecorator: String,
    fileInput: String,
    fileList: String,
    fileSign: String,
    noFileChosen: String,
    placeholderInput: String,
    preview: String,
    removeButton: String,
    removeFile: String,
    root: String
  ): ChooseFile = {
    val __obj = js.Dynamic.literal(chooseFile = chooseFile.asInstanceOf[js.Any], dragAreaPlaceholder = dragAreaPlaceholder.asInstanceOf[js.Any], fileDecorator = fileDecorator.asInstanceOf[js.Any], fileInput = fileInput.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any], fileSign = fileSign.asInstanceOf[js.Any], noFileChosen = noFileChosen.asInstanceOf[js.Any], placeholderInput = placeholderInput.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], removeButton = removeButton.asInstanceOf[js.Any], removeFile = removeFile.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChooseFile] (val x: Self) extends AnyVal {
    
    inline def setChooseFile(value: String): Self = StObject.set(x, "chooseFile", value.asInstanceOf[js.Any])
    
    inline def setDragAreaPlaceholder(value: String): Self = StObject.set(x, "dragAreaPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setFileDecorator(value: String): Self = StObject.set(x, "fileDecorator", value.asInstanceOf[js.Any])
    
    inline def setFileInput(value: String): Self = StObject.set(x, "fileInput", value.asInstanceOf[js.Any])
    
    inline def setFileList(value: String): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileSign(value: String): Self = StObject.set(x, "fileSign", value.asInstanceOf[js.Any])
    
    inline def setNoFileChosen(value: String): Self = StObject.set(x, "noFileChosen", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderInput(value: String): Self = StObject.set(x, "placeholderInput", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setRemoveButton(value: String): Self = StObject.set(x, "removeButton", value.asInstanceOf[js.Any])
    
    inline def setRemoveFile(value: String): Self = StObject.set(x, "removeFile", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
