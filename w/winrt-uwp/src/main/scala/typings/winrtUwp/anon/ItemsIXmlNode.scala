package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Data.Xml.Dom.IXmlNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsIXmlNode extends StObject {
  
  /** The items in the vector view that start at startIndex. */ var items: IXmlNode = js.native
  
  /** The number of items returned. */ var returnValue: Double = js.native
}
object ItemsIXmlNode {
  
  @scala.inline
  def apply(items: IXmlNode, returnValue: Double): ItemsIXmlNode = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIXmlNode]
  }
  
  @scala.inline
  implicit class ItemsIXmlNodeMutableBuilder[Self <: ItemsIXmlNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: IXmlNode): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
