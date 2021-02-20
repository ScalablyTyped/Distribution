package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAcquisition extends StObject {
  
  var enumValues: Acquisition = js.native
}
object EnumValuesAcquisition {
  
  @scala.inline
  def apply(enumValues: Acquisition): EnumValuesAcquisition = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAcquisition]
  }
  
  @scala.inline
  implicit class EnumValuesAcquisitionMutableBuilder[Self <: EnumValuesAcquisition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Acquisition): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
