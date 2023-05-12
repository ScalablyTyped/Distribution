package typings.swellJs

import typings.swellJs.anon.Productid
import typings.swellJs.mod.BaseModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscountSnake
  extends StObject
     with BaseModel {
  
  var amount: js.UndefOr[Double] = js.undefined
  
  var rule: js.UndefOr[Productid] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DiscountSnake {
  
  inline def apply(): DiscountSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscountSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscountSnake] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setRule(value: Productid): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
