package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskingClassNames extends StObject {
  
  var isDragOverlay: Any
  
  var maskingClassNames: Any
  
  var rowData: Any
  
  var rowNum: Any
  
  var style: Any
}
object MaskingClassNames {
  
  inline def apply(isDragOverlay: Any, maskingClassNames: Any, rowData: Any, rowNum: Any, style: Any): MaskingClassNames = {
    val __obj = js.Dynamic.literal(isDragOverlay = isDragOverlay.asInstanceOf[js.Any], maskingClassNames = maskingClassNames.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowNum = rowNum.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskingClassNames]
  }
  
  extension [Self <: MaskingClassNames](x: Self) {
    
    inline def setIsDragOverlay(value: Any): Self = StObject.set(x, "isDragOverlay", value.asInstanceOf[js.Any])
    
    inline def setMaskingClassNames(value: Any): Self = StObject.set(x, "maskingClassNames", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowNum(value: Any): Self = StObject.set(x, "rowNum", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
