package typings.winrt.anon

import typings.winrt.Windows.Data.Xml.Dom.IXmlNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var items: js.Array[IXmlNode]
  
  var returnValue: Double
}
object `2` {
  
  inline def apply(items: js.Array[IXmlNode], returnValue: Double): `2` = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setItems(value: js.Array[IXmlNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: IXmlNode*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
