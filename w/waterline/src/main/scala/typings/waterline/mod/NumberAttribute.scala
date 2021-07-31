package typings.waterline.mod

import typings.waterline.waterlineStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberAttribute
  extends StObject
     with BaseAttribute[Double]
     with _Attribute {
  
  var autoIncrement: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_NumberAttribute: number
}
object NumberAttribute {
  
  @scala.inline
  def apply(): NumberAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[NumberAttribute]
  }
  
  @scala.inline
  implicit class NumberAttributeMutableBuilder[Self <: NumberAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
    
    @scala.inline
    def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
