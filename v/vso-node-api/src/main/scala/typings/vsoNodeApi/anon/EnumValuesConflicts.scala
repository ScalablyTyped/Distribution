package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesConflicts extends StObject {
  
  var enumValues: Conflicts
}
object EnumValuesConflicts {
  
  inline def apply(enumValues: Conflicts): EnumValuesConflicts = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesConflicts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesConflicts] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Conflicts): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
