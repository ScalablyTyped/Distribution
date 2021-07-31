package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesMe extends StObject {
  
  var enumValues: Me
}
object EnumValuesMe {
  
  @scala.inline
  def apply(enumValues: Me): EnumValuesMe = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesMe]
  }
  
  @scala.inline
  implicit class EnumValuesMeMutableBuilder[Self <: EnumValuesMe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Me): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
