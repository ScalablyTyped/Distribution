package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesMultiConfiguration extends StObject {
  
  var enumValues: MultiConfiguration = js.native
}
object EnumValuesMultiConfiguration {
  
  @scala.inline
  def apply(enumValues: MultiConfiguration): EnumValuesMultiConfiguration = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesMultiConfiguration]
  }
  
  @scala.inline
  implicit class EnumValuesMultiConfigurationMutableBuilder[Self <: EnumValuesMultiConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: MultiConfiguration): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
