package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesLinks extends StObject {
  
  var enumValues: Links = js.native
}
object EnumValuesLinks {
  
  @scala.inline
  def apply(enumValues: Links): EnumValuesLinks = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesLinks]
  }
  
  @scala.inline
  implicit class EnumValuesLinksMutableBuilder[Self <: EnumValuesLinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Links): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
