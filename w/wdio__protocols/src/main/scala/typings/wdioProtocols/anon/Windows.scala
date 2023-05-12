package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Windows extends StObject {
  
  var Windows: String
}
object Windows {
  
  inline def apply(Windows: String): Windows = {
    val __obj = js.Dynamic.literal(Windows = Windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Windows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Windows] (val x: Self) extends AnyVal {
    
    inline def setWindows(value: String): Self = StObject.set(x, "Windows", value.asInstanceOf[js.Any])
  }
}
