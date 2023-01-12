package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFailure extends StObject {
  
  var enumValues: Failure
}
object EnumValuesFailure {
  
  inline def apply(enumValues: Failure): EnumValuesFailure = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesFailure] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Failure): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
