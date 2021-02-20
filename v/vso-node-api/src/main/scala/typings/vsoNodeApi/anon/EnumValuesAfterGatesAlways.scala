package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAfterGatesAlways extends StObject {
  
  var enumValues: AfterGatesAlways = js.native
}
object EnumValuesAfterGatesAlways {
  
  @scala.inline
  def apply(enumValues: AfterGatesAlways): EnumValuesAfterGatesAlways = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAfterGatesAlways]
  }
  
  @scala.inline
  implicit class EnumValuesAfterGatesAlwaysMutableBuilder[Self <: EnumValuesAfterGatesAlways] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AfterGatesAlways): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
