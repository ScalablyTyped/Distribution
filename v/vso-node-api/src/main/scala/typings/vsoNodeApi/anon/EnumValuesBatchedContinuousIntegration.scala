package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBatchedContinuousIntegration extends StObject {
  
  var enumValues: BatchedContinuousIntegration
}
object EnumValuesBatchedContinuousIntegration {
  
  inline def apply(enumValues: BatchedContinuousIntegration): EnumValuesBatchedContinuousIntegration = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBatchedContinuousIntegration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesBatchedContinuousIntegration] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: BatchedContinuousIntegration): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
