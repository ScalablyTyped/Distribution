package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesExclusion extends StObject {
  
  var enumValues: Exclusion = js.native
}
object EnumValuesExclusion {
  
  @scala.inline
  def apply(enumValues: Exclusion): EnumValuesExclusion = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesExclusion]
  }
  
  @scala.inline
  implicit class EnumValuesExclusionMutableBuilder[Self <: EnumValuesExclusion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Exclusion): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
