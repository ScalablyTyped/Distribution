package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesCodeChange extends StObject {
  
  var enumValues: CodeChange = js.native
}
object EnumValuesCodeChange {
  
  @scala.inline
  def apply(enumValues: CodeChange): EnumValuesCodeChange = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCodeChange]
  }
  
  @scala.inline
  implicit class EnumValuesCodeChangeMutableBuilder[Self <: EnumValuesCodeChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: CodeChange): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
