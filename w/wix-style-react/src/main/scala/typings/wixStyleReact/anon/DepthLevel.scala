package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepthLevel extends StObject {
  
  var dataHook: Any
  
  var depthLevel: Any
  
  var dragAndDropDriver: Any
  
  var threshold: Any
}
object DepthLevel {
  
  inline def apply(dataHook: Any, depthLevel: Any, dragAndDropDriver: Any, threshold: Any): DepthLevel = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], depthLevel = depthLevel.asInstanceOf[js.Any], dragAndDropDriver = dragAndDropDriver.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthLevel]
  }
  
  extension [Self <: DepthLevel](x: Self) {
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDepthLevel(value: Any): Self = StObject.set(x, "depthLevel", value.asInstanceOf[js.Any])
    
    inline def setDragAndDropDriver(value: Any): Self = StObject.set(x, "dragAndDropDriver", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Any): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
