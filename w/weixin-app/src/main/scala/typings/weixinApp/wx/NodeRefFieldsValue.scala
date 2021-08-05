package typings.weixinApp.wx

import typings.weixinApp.anon.Bottom
import typings.weixinApp.anon.Dataset
import typings.weixinApp.anon.Height
import typings.weixinApp.anon.Id
import typings.weixinApp.anon.PropertiesAny
import typings.weixinApp.anon.ScrollLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeRefFieldsValue extends StObject {
  
  var dataset: Dataset
  
  var id: Id
  
  var properties: PropertiesAny
  
  var rect: Bottom
  
  var scrollOffset: ScrollLeft
  
  var size: Height
}
object NodeRefFieldsValue {
  
  inline def apply(
    dataset: Dataset,
    id: Id,
    properties: PropertiesAny,
    rect: Bottom,
    scrollOffset: ScrollLeft,
    size: Height
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
  
  extension [Self <: NodeRefFieldsValue](x: Self) {
    
    inline def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: PropertiesAny): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRect(value: Bottom): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setScrollOffset(value: ScrollLeft): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
