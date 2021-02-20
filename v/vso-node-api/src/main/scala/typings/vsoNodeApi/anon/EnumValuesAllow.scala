package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAllow extends StObject {
  
  var enumValues: Allow = js.native
}
object EnumValuesAllow {
  
  @scala.inline
  def apply(enumValues: Allow): EnumValuesAllow = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAllow]
  }
  
  @scala.inline
  implicit class EnumValuesAllowMutableBuilder[Self <: EnumValuesAllow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Allow): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
