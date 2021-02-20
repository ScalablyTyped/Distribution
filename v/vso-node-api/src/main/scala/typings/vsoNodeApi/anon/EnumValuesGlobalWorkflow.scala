package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesGlobalWorkflow extends StObject {
  
  var enumValues: GlobalWorkflow = js.native
}
object EnumValuesGlobalWorkflow {
  
  @scala.inline
  def apply(enumValues: GlobalWorkflow): EnumValuesGlobalWorkflow = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesGlobalWorkflow]
  }
  
  @scala.inline
  implicit class EnumValuesGlobalWorkflowMutableBuilder[Self <: EnumValuesGlobalWorkflow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: GlobalWorkflow): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
