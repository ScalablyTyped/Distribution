package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesInherited extends StObject {
  
  var enumValues: Inherited = js.native
}
object EnumValuesInherited {
  
  @scala.inline
  def apply(enumValues: Inherited): EnumValuesInherited = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesInherited]
  }
  
  @scala.inline
  implicit class EnumValuesInheritedMutableBuilder[Self <: EnumValuesInherited] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Inherited): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
