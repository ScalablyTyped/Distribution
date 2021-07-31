package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAllOrNone extends StObject {
  
  var enumValues: AllOrNone
}
object EnumValuesAllOrNone {
  
  @scala.inline
  def apply(enumValues: AllOrNone): EnumValuesAllOrNone = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAllOrNone]
  }
  
  @scala.inline
  implicit class EnumValuesAllOrNoneMutableBuilder[Self <: EnumValuesAllOrNone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AllOrNone): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
