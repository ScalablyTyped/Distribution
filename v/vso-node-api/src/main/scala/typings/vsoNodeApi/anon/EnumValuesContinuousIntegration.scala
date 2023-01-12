package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesContinuousIntegration extends StObject {
  
  var enumValues: ContinuousIntegration
}
object EnumValuesContinuousIntegration {
  
  inline def apply(enumValues: ContinuousIntegration): EnumValuesContinuousIntegration = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesContinuousIntegration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesContinuousIntegration] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: ContinuousIntegration): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
