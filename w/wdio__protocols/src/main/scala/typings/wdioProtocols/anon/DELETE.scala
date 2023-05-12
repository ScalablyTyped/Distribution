package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETE extends StObject {
  
  var DELETE: Parameters
}
object DELETE {
  
  inline def apply(DELETE: Parameters): DELETE = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DELETE] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: Parameters): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
  }
}
