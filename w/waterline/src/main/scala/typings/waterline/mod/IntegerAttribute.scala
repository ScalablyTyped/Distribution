package typings.waterline.mod

import typings.waterline.waterlineStrings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerAttribute
  extends StObject
     with BaseAttribute[Double]
     with _Attribute {
  
  var autoIncrement: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_IntegerAttribute: integer
}
object IntegerAttribute {
  
  inline def apply(): IntegerAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[IntegerAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegerAttribute] (val x: Self) extends AnyVal {
    
    inline def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    inline def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
    
    inline def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
