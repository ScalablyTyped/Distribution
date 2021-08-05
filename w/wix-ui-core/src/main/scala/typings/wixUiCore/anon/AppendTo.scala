package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendTo extends StObject {
  
  var appendTo: String
  
  var children: js.Array[typings.react.mod.global.JSX.Element]
  
  var `data-hook`: String
  
  var fluid: Boolean
  
  var placement: String
  
  var showArrow: Boolean
  
  var shown: Boolean
  
  var timeout: Double
}
object AppendTo {
  
  inline def apply(
    appendTo: String,
    children: js.Array[typings.react.mod.global.JSX.Element],
    `data-hook`: String,
    fluid: Boolean,
    placement: String,
    showArrow: Boolean,
    shown: Boolean,
    timeout: Double
  ): AppendTo = {
    val __obj = js.Dynamic.literal(appendTo = appendTo.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], fluid = fluid.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], showArrow = showArrow.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("data-hook")(`data-hook`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendTo]
  }
  
  extension [Self <: AppendTo](x: Self) {
    
    inline def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[typings.react.mod.global.JSX.Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: typings.react.mod.global.JSX.Element*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
    
    inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    inline def setShown(value: Boolean): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
