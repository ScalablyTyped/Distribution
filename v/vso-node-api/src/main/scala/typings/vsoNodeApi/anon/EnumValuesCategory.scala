package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCategory extends StObject {
  
  var enumValues: Category
}
object EnumValuesCategory {
  
  @scala.inline
  def apply(enumValues: Category): EnumValuesCategory = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCategory]
  }
  
  @scala.inline
  implicit class EnumValuesCategoryMutableBuilder[Self <: EnumValuesCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Category): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
