package typings.workboxBuild.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseDirectory extends StObject {
  
  var baseDirectory: String
  
  var file: String
}
object BaseDirectory {
  
  inline def apply(baseDirectory: String, file: String): BaseDirectory = {
    val __obj = js.Dynamic.literal(baseDirectory = baseDirectory.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDirectory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseDirectory] (val x: Self) extends AnyVal {
    
    inline def setBaseDirectory(value: String): Self = StObject.set(x, "baseDirectory", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
