package typings.typescript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Files extends StObject {
  
  var files: js.Array[String]
  
  var newFileName: String
}
object Files {
  
  inline def apply(files: js.Array[String], newFileName: String): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], newFileName = newFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Files] (val x: Self) extends AnyVal {
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setNewFileName(value: String): Self = StObject.set(x, "newFileName", value.asInstanceOf[js.Any])
  }
}
