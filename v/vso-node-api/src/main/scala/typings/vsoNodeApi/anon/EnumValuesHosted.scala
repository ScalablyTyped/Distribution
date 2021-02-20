package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesHosted extends StObject {
  
  var enumValues: Hosted = js.native
}
object EnumValuesHosted {
  
  @scala.inline
  def apply(enumValues: Hosted): EnumValuesHosted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesHosted]
  }
  
  @scala.inline
  implicit class EnumValuesHostedMutableBuilder[Self <: EnumValuesHosted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Hosted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
