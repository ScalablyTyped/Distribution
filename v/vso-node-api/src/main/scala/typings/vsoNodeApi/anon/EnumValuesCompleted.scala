package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCompleted extends StObject {
  
  var enumValues: Completed
}
object EnumValuesCompleted {
  
  inline def apply(enumValues: Completed): EnumValuesCompleted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCompleted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesCompleted] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Completed): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
