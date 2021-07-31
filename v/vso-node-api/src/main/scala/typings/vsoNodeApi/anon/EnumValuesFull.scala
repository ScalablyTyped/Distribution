package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFull extends StObject {
  
  var enumValues: Full
}
object EnumValuesFull {
  
  @scala.inline
  def apply(enumValues: Full): EnumValuesFull = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFull]
  }
  
  @scala.inline
  implicit class EnumValuesFullMutableBuilder[Self <: EnumValuesFull] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Full): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
