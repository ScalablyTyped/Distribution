package typings.waterline.mod

import typings.waterline.waterlineStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayAttribute
  extends StObject
     with BaseAttribute[js.Any]
     with _Attribute {
  
  @JSName("type")
  var type_ArrayAttribute: array
}
object ArrayAttribute {
  
  @scala.inline
  def apply(): ArrayAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[ArrayAttribute]
  }
  
  @scala.inline
  implicit class ArrayAttributeMutableBuilder[Self <: ArrayAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
