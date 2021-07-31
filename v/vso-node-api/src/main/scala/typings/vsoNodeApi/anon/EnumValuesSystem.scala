package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesSystem extends StObject {
  
  var enumValues: System
}
object EnumValuesSystem {
  
  @scala.inline
  def apply(enumValues: System): EnumValuesSystem = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesSystem]
  }
  
  @scala.inline
  implicit class EnumValuesSystemMutableBuilder[Self <: EnumValuesSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: System): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
