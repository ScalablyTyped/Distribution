package typings.twit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaParam extends StObject {
  
  var file_path: String
}
object MediaParam {
  
  inline def apply(file_path: String): MediaParam = {
    val __obj = js.Dynamic.literal(file_path = file_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaParam] (val x: Self) extends AnyVal {
    
    inline def setFile_path(value: String): Self = StObject.set(x, "file_path", value.asInstanceOf[js.Any])
  }
}
