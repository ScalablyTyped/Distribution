package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesNotApplicable extends StObject {
  
  var enumValues: NotApplicable = js.native
}
object EnumValuesNotApplicable {
  
  @scala.inline
  def apply(enumValues: NotApplicable): EnumValuesNotApplicable = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNotApplicable]
  }
  
  @scala.inline
  implicit class EnumValuesNotApplicableMutableBuilder[Self <: EnumValuesNotApplicable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: NotApplicable): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
