package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backend extends StObject {
  
  var backend: Double
  
  var background: String
  
  var context: Any
  
  var elementId: String
  
  var height: Double
  
  var width: Double
}
object Backend {
  
  inline def apply(
    backend: Double,
    background: String,
    context: Any,
    elementId: String,
    height: Double,
    width: Double
  ): Backend = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Backend] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: Double): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
