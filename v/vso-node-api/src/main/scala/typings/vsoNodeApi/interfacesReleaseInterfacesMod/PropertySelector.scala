package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertySelector extends StObject {
  
  var properties: js.Array[String]
  
  var selectorType: PropertySelectorType
}
object PropertySelector {
  
  inline def apply(properties: js.Array[String], selectorType: PropertySelectorType): PropertySelector = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], selectorType = selectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertySelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertySelector] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setSelectorType(value: PropertySelectorType): Self = StObject.set(x, "selectorType", value.asInstanceOf[js.Any])
  }
}
