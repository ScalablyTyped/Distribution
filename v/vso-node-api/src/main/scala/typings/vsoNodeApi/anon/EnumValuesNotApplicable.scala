package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesNotApplicable extends StObject {
  
  var enumValues: NotApplicable
}
object EnumValuesNotApplicable {
  
  inline def apply(enumValues: NotApplicable): EnumValuesNotApplicable = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNotApplicable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesNotApplicable] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: NotApplicable): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
