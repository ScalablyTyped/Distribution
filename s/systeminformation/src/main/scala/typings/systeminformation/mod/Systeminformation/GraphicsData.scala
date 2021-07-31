package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphicsData extends StObject {
  
  var controllers: js.Array[GraphicsControllerData]
  
  var displays: js.Array[GraphicsDisplayData]
}
object GraphicsData {
  
  @scala.inline
  def apply(controllers: js.Array[GraphicsControllerData], displays: js.Array[GraphicsDisplayData]): GraphicsData = {
    val __obj = js.Dynamic.literal(controllers = controllers.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsData]
  }
  
  @scala.inline
  implicit class GraphicsDataMutableBuilder[Self <: GraphicsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControllers(value: js.Array[GraphicsControllerData]): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllersVarargs(value: GraphicsControllerData*): Self = StObject.set(x, "controllers", js.Array(value :_*))
    
    @scala.inline
    def setDisplays(value: js.Array[GraphicsDisplayData]): Self = StObject.set(x, "displays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplaysVarargs(value: GraphicsDisplayData*): Self = StObject.set(x, "displays", js.Array(value :_*))
  }
}
