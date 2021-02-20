package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backend extends StObject {
  
  var backend: Double = js.native
  
  var background: String = js.native
  
  var context: js.Any = js.native
  
  var elementId: String = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object Backend {
  
  @scala.inline
  def apply(
    backend: Double,
    background: String,
    context: js.Any,
    elementId: String,
    height: Double,
    width: Double
  ): Backend = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend]
  }
  
  @scala.inline
  implicit class BackendMutableBuilder[Self <: Backend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: Double): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
