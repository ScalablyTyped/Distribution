package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAttachments extends StObject {
  
  var enumValues: Attachments
}
object EnumValuesAttachments {
  
  @scala.inline
  def apply(enumValues: Attachments): EnumValuesAttachments = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAttachments]
  }
  
  @scala.inline
  implicit class EnumValuesAttachmentsMutableBuilder[Self <: EnumValuesAttachments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Attachments): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
