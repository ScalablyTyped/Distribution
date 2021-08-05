package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCancellingCompleted extends StObject {
  
  var enumValues: CancellingCompleted
}
object EnumValuesCancellingCompleted {
  
  inline def apply(enumValues: CancellingCompleted): EnumValuesCancellingCompleted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCancellingCompleted]
  }
  
  extension [Self <: EnumValuesCancellingCompleted](x: Self) {
    
    inline def setEnumValues(value: CancellingCompleted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
