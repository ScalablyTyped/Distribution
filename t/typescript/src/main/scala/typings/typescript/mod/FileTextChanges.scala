package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileTextChanges extends StObject {
  
  var fileName: java.lang.String
  
  var isNewFile: js.UndefOr[Boolean] = js.undefined
  
  var textChanges: js.Array[TextChange]
}
object FileTextChanges {
  
  inline def apply(fileName: java.lang.String, textChanges: js.Array[TextChange]): FileTextChanges = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textChanges = textChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTextChanges]
  }
  
  extension [Self <: FileTextChanges](x: Self) {
    
    inline def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setIsNewFile(value: Boolean): Self = StObject.set(x, "isNewFile", value.asInstanceOf[js.Any])
    
    inline def setIsNewFileUndefined: Self = StObject.set(x, "isNewFile", js.undefined)
    
    inline def setTextChanges(value: js.Array[TextChange]): Self = StObject.set(x, "textChanges", value.asInstanceOf[js.Any])
    
    inline def setTextChangesVarargs(value: TextChange*): Self = StObject.set(x, "textChanges", js.Array(value*))
  }
}
