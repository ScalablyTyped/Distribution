package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCreate extends StObject {
  
  var enumValues: Create
}
object EnumValuesCreate {
  
  @scala.inline
  def apply(enumValues: Create): EnumValuesCreate = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCreate]
  }
  
  @scala.inline
  implicit class EnumValuesCreateMutableBuilder[Self <: EnumValuesCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Create): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
