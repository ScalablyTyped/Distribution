package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesHS256 extends StObject {
  
  var enumValues: HS256 = js.native
}
object EnumValuesHS256 {
  
  @scala.inline
  def apply(enumValues: HS256): EnumValuesHS256 = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesHS256]
  }
  
  @scala.inline
  implicit class EnumValuesHS256MutableBuilder[Self <: EnumValuesHS256] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: HS256): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
