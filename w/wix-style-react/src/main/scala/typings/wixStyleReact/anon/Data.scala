package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: Any
  
  var dataHook: Any
  
  var disabled: Any
  
  var hoverIndex: Any
  
  var labelDistance: Any
  
  var labelWidth: Any
  
  var onDataPointHover: Any
  
  var scale: Any
  
  var width: Any
}
object Data {
  
  inline def apply(
    data: Any,
    dataHook: Any,
    disabled: Any,
    hoverIndex: Any,
    labelDistance: Any,
    labelWidth: Any,
    onDataPointHover: Any,
    scale: Any,
    width: Any
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hoverIndex = hoverIndex.asInstanceOf[js.Any], labelDistance = labelDistance.asInstanceOf[js.Any], labelWidth = labelWidth.asInstanceOf[js.Any], onDataPointHover = onDataPointHover.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHoverIndex(value: Any): Self = StObject.set(x, "hoverIndex", value.asInstanceOf[js.Any])
    
    inline def setLabelDistance(value: Any): Self = StObject.set(x, "labelDistance", value.asInstanceOf[js.Any])
    
    inline def setLabelWidth(value: Any): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
    
    inline def setOnDataPointHover(value: Any): Self = StObject.set(x, "onDataPointHover", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
