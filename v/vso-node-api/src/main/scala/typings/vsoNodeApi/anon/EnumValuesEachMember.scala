package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesEachMember extends StObject {
  
  var enumValues: EachMember = js.native
}
object EnumValuesEachMember {
  
  @scala.inline
  def apply(enumValues: EachMember): EnumValuesEachMember = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesEachMember]
  }
  
  @scala.inline
  implicit class EnumValuesEachMemberMutableBuilder[Self <: EnumValuesEachMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: EachMember): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
