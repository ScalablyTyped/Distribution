package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesLarge extends StObject {
  
  var enumValues: Large
}
object EnumValuesLarge {
  
  @scala.inline
  def apply(enumValues: Large): EnumValuesLarge = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesLarge]
  }
  
  @scala.inline
  implicit class EnumValuesLargeMutableBuilder[Self <: EnumValuesLarge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Large): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
