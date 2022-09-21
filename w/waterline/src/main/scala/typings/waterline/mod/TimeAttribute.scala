package typings.waterline.mod

import typings.waterline.waterlineStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeAttribute
  extends StObject
     with BaseAttribute[js.Date]
     with _Attribute {
  
  @JSName("type")
  var type_TimeAttribute: time
}
object TimeAttribute {
  
  inline def apply(): TimeAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("time")
    __obj.asInstanceOf[TimeAttribute]
  }
  
  extension [Self <: TimeAttribute](x: Self) {
    
    inline def setType(value: time): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
