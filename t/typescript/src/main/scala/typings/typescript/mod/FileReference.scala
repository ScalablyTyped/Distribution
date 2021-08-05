package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileReference
  extends StObject
     with TextRange {
  
  var fileName: java.lang.String
}
object FileReference {
  
  inline def apply(end: Double, fileName: java.lang.String, pos: Double): FileReference = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileReference]
  }
  
  extension [Self <: FileReference](x: Self) {
    
    inline def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
