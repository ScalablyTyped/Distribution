package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopsProps extends StObject {
  
  var offset: String
  
  var stopColor: String
  
  var stopOpacity: String
}
object StopsProps {
  
  inline def apply(offset: String, stopColor: String, stopOpacity: String): StopsProps = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], stopColor = stopColor.asInstanceOf[js.Any], stopOpacity = stopOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopsProps]
  }
  
  extension [Self <: StopsProps](x: Self) {
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    inline def setStopOpacity(value: String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
  }
}
