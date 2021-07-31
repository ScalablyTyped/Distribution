package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesPreliminary extends StObject {
  
  var enumValues: Preliminary
}
object EnumValuesPreliminary {
  
  @scala.inline
  def apply(enumValues: Preliminary): EnumValuesPreliminary = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPreliminary]
  }
  
  @scala.inline
  implicit class EnumValuesPreliminaryMutableBuilder[Self <: EnumValuesPreliminary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Preliminary): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
