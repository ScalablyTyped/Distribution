package typings.waterline.mod

import typings.waterline.waterlineStrings.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloatAttribute
  extends StObject
     with BaseAttribute[Double]
     with _Attribute {
  
  @JSName("type")
  var type_FloatAttribute: float
}
object FloatAttribute {
  
  @scala.inline
  def apply(): FloatAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float")
    __obj.asInstanceOf[FloatAttribute]
  }
  
  @scala.inline
  implicit class FloatAttributeMutableBuilder[Self <: FloatAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: float): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
