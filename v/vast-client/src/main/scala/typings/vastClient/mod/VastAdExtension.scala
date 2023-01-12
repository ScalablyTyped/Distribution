package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastAdExtension extends StObject {
  
  var attributes: VastAdAttributes
  
  var children: js.Array[VastAdExtensionChild]
  
  var name: String | Null
  
  var value: Any
}
object VastAdExtension {
  
  inline def apply(attributes: VastAdAttributes, children: js.Array[VastAdExtensionChild], value: Any): VastAdExtension = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], name = null)
    __obj.asInstanceOf[VastAdExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VastAdExtension] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: VastAdAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[VastAdExtensionChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: VastAdExtensionChild*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
