package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesQueued extends StObject {
  
  var enumValues: Queued
}
object EnumValuesQueued {
  
  inline def apply(enumValues: Queued): EnumValuesQueued = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesQueued]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesQueued] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Queued): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
