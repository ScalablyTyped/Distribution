package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Data.Xml.Dom.IXmlNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsIXmlNode extends StObject {
  
  /** The items in the vector view that start at startIndex. */ var items: IXmlNode
  
  /** The number of items returned. */ var returnValue: Double
}
object ItemsIXmlNode {
  
  inline def apply(items: IXmlNode, returnValue: Double): ItemsIXmlNode = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIXmlNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsIXmlNode] (val x: Self) extends AnyVal {
    
    inline def setItems(value: IXmlNode): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
