package typings.waterline.mod

import typings.waterline.waterlineStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanAttribute
  extends StObject
     with BaseAttribute[Boolean]
     with _Attribute {
  
  @JSName("type")
  var type_BooleanAttribute: boolean
}
object BooleanAttribute {
  
  inline def apply(): BooleanAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[BooleanAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BooleanAttribute] (val x: Self) extends AnyVal {
    
    inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
