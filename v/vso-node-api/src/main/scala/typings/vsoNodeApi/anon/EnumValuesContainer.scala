package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesContainer extends StObject {
  
  var enumValues: Container
}
object EnumValuesContainer {
  
  @scala.inline
  def apply(enumValues: Container): EnumValuesContainer = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesContainer]
  }
  
  @scala.inline
  implicit class EnumValuesContainerMutableBuilder[Self <: EnumValuesContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Container): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
