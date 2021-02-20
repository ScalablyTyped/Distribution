package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesBoth extends StObject {
  
  var enumValues: Both = js.native
}
object EnumValuesBoth {
  
  @scala.inline
  def apply(enumValues: Both): EnumValuesBoth = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBoth]
  }
  
  @scala.inline
  implicit class EnumValuesBothMutableBuilder[Self <: EnumValuesBoth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Both): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
