package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDetails extends StObject {
  
  var enumValues: Details = js.native
}
object EnumValuesDetails {
  
  @scala.inline
  def apply(enumValues: Details): EnumValuesDetails = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDetails]
  }
  
  @scala.inline
  implicit class EnumValuesDetailsMutableBuilder[Self <: EnumValuesDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Details): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
