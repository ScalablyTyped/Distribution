package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesChildFirst extends StObject {
  
  var enumValues: ChildFirst = js.native
}
object EnumValuesChildFirst {
  
  @scala.inline
  def apply(enumValues: ChildFirst): EnumValuesChildFirst = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesChildFirst]
  }
  
  @scala.inline
  implicit class EnumValuesChildFirstMutableBuilder[Self <: EnumValuesChildFirst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: ChildFirst): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
