package typings.swellJs

import typings.swellJs.anon.Productid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDiscountCamelMod {
  
  /* Inlined {[ K in keyof swell-js.DiscountSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.DiscountSnake[K]} */
  trait DiscountCamel extends StObject {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var date_updated: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var rule: js.UndefOr[Productid] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DiscountCamel {
    
    inline def apply(): DiscountCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiscountCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiscountCamel] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setDate_updated(value: String): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_updatedUndefined: Self = StObject.set(x, "date_updated", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRule(value: Productid): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
