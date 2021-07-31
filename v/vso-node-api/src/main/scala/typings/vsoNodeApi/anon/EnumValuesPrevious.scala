package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesPrevious extends StObject {
  
  var enumValues: Previous
}
object EnumValuesPrevious {
  
  @scala.inline
  def apply(enumValues: Previous): EnumValuesPrevious = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPrevious]
  }
  
  @scala.inline
  implicit class EnumValuesPreviousMutableBuilder[Self <: EnumValuesPrevious] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Previous): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
