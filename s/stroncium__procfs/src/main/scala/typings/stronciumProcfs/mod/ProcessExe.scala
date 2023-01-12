package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessExe extends StObject {
  
  var deleted: Boolean
  
  var path: String
}
object ProcessExe {
  
  inline def apply(deleted: Boolean, path: String): ProcessExe = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessExe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessExe] (val x: Self) extends AnyVal {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
