package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAddAdd extends StObject {
  
  var enumValues: AddAdd
}
object EnumValuesAddAdd {
  
  @scala.inline
  def apply(enumValues: AddAdd): EnumValuesAddAdd = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAddAdd]
  }
  
  @scala.inline
  implicit class EnumValuesAddAddMutableBuilder[Self <: EnumValuesAddAdd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AddAdd): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
