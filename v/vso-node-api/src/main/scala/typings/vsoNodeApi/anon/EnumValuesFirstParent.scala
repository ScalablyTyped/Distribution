package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesFirstParent extends StObject {
  
  var enumValues: FirstParent = js.native
}
object EnumValuesFirstParent {
  
  @scala.inline
  def apply(enumValues: FirstParent): EnumValuesFirstParent = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFirstParent]
  }
  
  @scala.inline
  implicit class EnumValuesFirstParentMutableBuilder[Self <: EnumValuesFirstParent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: FirstParent): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
