package typings.swellJs

import typings.swellJs.typesPromotionCamelMod.PromotionCamel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPromotionMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.mod.BaseModel because var conflicts: date_created, date_updated, id. Inlined 
  - typings.swellJs.PromotionSnake because var conflicts: active, currency, date_created, date_end, date_start, date_updated, description, discount_group, discounts, exclusions, id, limit_account_groups, limit_account_uses, limit_uses, name, orders, subscriptions, use_count, uses. Inlined  */ trait Promotion
    extends StObject
       with PromotionCamel
  object Promotion {
    
    inline def apply(): Promotion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Promotion]
    }
  }
}
