package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIndex extends StObject {
  
  var data: Any
  
  var index: Any
  
  var style: Any
}
object DataIndex {
  
  inline def apply(data: Any, index: Any, style: Any): DataIndex = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndex]
  }
  
  extension [Self <: DataIndex](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
