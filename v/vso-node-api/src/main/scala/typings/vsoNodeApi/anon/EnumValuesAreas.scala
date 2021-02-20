package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAreas extends StObject {
  
  var enumValues: Areas = js.native
}
object EnumValuesAreas {
  
  @scala.inline
  def apply(enumValues: Areas): EnumValuesAreas = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAreas]
  }
  
  @scala.inline
  implicit class EnumValuesAreasMutableBuilder[Self <: EnumValuesAreas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Areas): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
