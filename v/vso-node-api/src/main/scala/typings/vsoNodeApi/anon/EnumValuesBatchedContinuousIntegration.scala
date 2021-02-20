package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesBatchedContinuousIntegration extends StObject {
  
  var enumValues: BatchedContinuousIntegration = js.native
}
object EnumValuesBatchedContinuousIntegration {
  
  @scala.inline
  def apply(enumValues: BatchedContinuousIntegration): EnumValuesBatchedContinuousIntegration = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBatchedContinuousIntegration]
  }
  
  @scala.inline
  implicit class EnumValuesBatchedContinuousIntegrationMutableBuilder[Self <: EnumValuesBatchedContinuousIntegration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: BatchedContinuousIntegration): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
