package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertySelector extends StObject {
  
  var properties: js.Array[String] = js.native
  
  var selectorType: PropertySelectorType = js.native
}
object PropertySelector {
  
  @scala.inline
  def apply(properties: js.Array[String], selectorType: PropertySelectorType): PropertySelector = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], selectorType = selectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertySelector]
  }
  
  @scala.inline
  implicit class PropertySelectorMutableBuilder[Self <: PropertySelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setSelectorType(value: PropertySelectorType): Self = StObject.set(x, "selectorType", value.asInstanceOf[js.Any])
  }
}
