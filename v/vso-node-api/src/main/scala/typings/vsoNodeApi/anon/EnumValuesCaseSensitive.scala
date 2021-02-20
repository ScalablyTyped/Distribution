package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesCaseSensitive extends StObject {
  
  var enumValues: CaseSensitive = js.native
}
object EnumValuesCaseSensitive {
  
  @scala.inline
  def apply(enumValues: CaseSensitive): EnumValuesCaseSensitive = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCaseSensitive]
  }
  
  @scala.inline
  implicit class EnumValuesCaseSensitiveMutableBuilder[Self <: EnumValuesCaseSensitive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: CaseSensitive): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
