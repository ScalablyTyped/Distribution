package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesManualInterventions extends StObject {
  
  var enumValues: ManualInterventions
}
object EnumValuesManualInterventions {
  
  @scala.inline
  def apply(enumValues: ManualInterventions): EnumValuesManualInterventions = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesManualInterventions]
  }
  
  @scala.inline
  implicit class EnumValuesManualInterventionsMutableBuilder[Self <: EnumValuesManualInterventions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: ManualInterventions): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
