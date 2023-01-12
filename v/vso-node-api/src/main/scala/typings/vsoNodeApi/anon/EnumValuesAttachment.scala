package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAttachment extends StObject {
  
  var enumValues: Attachment
}
object EnumValuesAttachment {
  
  inline def apply(enumValues: Attachment): EnumValuesAttachment = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAttachment] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Attachment): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
