package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDoNotRun extends StObject {
  
  var enumValues: DoNotRun
}
object EnumValuesDoNotRun {
  
  inline def apply(enumValues: DoNotRun): EnumValuesDoNotRun = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDoNotRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesDoNotRun] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: DoNotRun): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
