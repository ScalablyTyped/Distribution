package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAuthor extends StObject {
  
  var enumValues: Author
}
object EnumValuesAuthor {
  
  @scala.inline
  def apply(enumValues: Author): EnumValuesAuthor = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAuthor]
  }
  
  @scala.inline
  implicit class EnumValuesAuthorMutableBuilder[Self <: EnumValuesAuthor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Author): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
