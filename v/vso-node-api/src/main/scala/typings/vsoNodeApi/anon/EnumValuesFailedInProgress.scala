package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFailedInProgress extends StObject {
  
  var enumValues: FailedInProgress
}
object EnumValuesFailedInProgress {
  
  inline def apply(enumValues: FailedInProgress): EnumValuesFailedInProgress = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFailedInProgress]
  }
  
  extension [Self <: EnumValuesFailedInProgress](x: Self) {
    
    inline def setEnumValues(value: FailedInProgress): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
