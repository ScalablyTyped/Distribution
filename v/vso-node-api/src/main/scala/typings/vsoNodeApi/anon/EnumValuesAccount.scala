package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAccount extends StObject {
  
  var enumValues: Account = js.native
}
object EnumValuesAccount {
  
  @scala.inline
  def apply(enumValues: Account): EnumValuesAccount = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAccount]
  }
  
  @scala.inline
  implicit class EnumValuesAccountMutableBuilder[Self <: EnumValuesAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Account): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
