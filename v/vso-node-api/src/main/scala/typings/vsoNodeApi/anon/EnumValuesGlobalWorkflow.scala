package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesGlobalWorkflow extends StObject {
  
  var enumValues: GlobalWorkflow
}
object EnumValuesGlobalWorkflow {
  
  inline def apply(enumValues: GlobalWorkflow): EnumValuesGlobalWorkflow = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesGlobalWorkflow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesGlobalWorkflow] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: GlobalWorkflow): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
