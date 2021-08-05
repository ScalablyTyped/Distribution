package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCompletedInProgress extends StObject {
  
  var enumValues: CompletedInProgress
}
object EnumValuesCompletedInProgress {
  
  inline def apply(enumValues: CompletedInProgress): EnumValuesCompletedInProgress = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCompletedInProgress]
  }
  
  extension [Self <: EnumValuesCompletedInProgress](x: Self) {
    
    inline def setEnumValues(value: CompletedInProgress): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
