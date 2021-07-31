package typings.waterline.mod

import typings.std.Date
import typings.waterline.waterlineStrings.datetime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimeAttribute
  extends StObject
     with BaseAttribute[Date]
     with _Attribute {
  
  @JSName("type")
  var type_DatetimeAttribute: datetime
}
object DatetimeAttribute {
  
  @scala.inline
  def apply(): DatetimeAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("datetime")
    __obj.asInstanceOf[DatetimeAttribute]
  }
  
  @scala.inline
  implicit class DatetimeAttributeMutableBuilder[Self <: DatetimeAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: datetime): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
