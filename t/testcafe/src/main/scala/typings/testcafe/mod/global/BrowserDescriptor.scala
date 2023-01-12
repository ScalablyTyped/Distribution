package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserDescriptor
  extends StObject
     with _BrowserOption {
  
  var cmd: js.UndefOr[String] = js.undefined
  
  var path: String
}
object BrowserDescriptor {
  
  inline def apply(path: String): BrowserDescriptor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserDescriptor] (val x: Self) extends AnyVal {
    
    inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
