package typings.waterline.mod

import typings.std.Date
import typings.waterline.waterlineStrings.date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateAttribute
  extends StObject
     with BaseAttribute[Date]
     with _Attribute {
  
  @JSName("type")
  var type_DateAttribute: date
}
object DateAttribute {
  
  @scala.inline
  def apply(): DateAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date")
    __obj.asInstanceOf[DateAttribute]
  }
  
  @scala.inline
  implicit class DateAttributeMutableBuilder[Self <: DateAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: date): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
