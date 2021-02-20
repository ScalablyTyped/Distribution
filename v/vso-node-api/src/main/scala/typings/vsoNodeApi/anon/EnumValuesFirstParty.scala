package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesFirstParty extends StObject {
  
  var enumValues: FirstParty = js.native
}
object EnumValuesFirstParty {
  
  @scala.inline
  def apply(enumValues: FirstParty): EnumValuesFirstParty = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFirstParty]
  }
  
  @scala.inline
  implicit class EnumValuesFirstPartyMutableBuilder[Self <: EnumValuesFirstParty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: FirstParty): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
