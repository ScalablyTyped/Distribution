package typings.swellJs

import typings.swellJs.typesPurchaseLinkCamelMod.PurchaseLinkCamel
import typings.swellJs.typesPurchaseLinkCamelMod.PurchaseLinkDiscountCamel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPurchaseLinkMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesPurchaseLinkSnakeMod.PurchaseLinkSnake because var conflicts: active, coupon, coupon_id, currency, discount_total, discounts, grand_total, item_discount, items, metadata, name, promotion_ids, promotions, sub_total. Inlined  */ trait PurhcaseLink
    extends StObject
       with PurchaseLinkCamel
  object PurhcaseLink {
    
    inline def apply(): PurhcaseLink = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PurhcaseLink]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesPurchaseLinkSnakeMod.PurchaseLinkDiscountSnake because var conflicts: amount, id, rule, `type`. Inlined  */ trait PurhcaseLinkDiscount
    extends StObject
       with PurchaseLinkDiscountCamel
  object PurhcaseLinkDiscount {
    
    inline def apply(): PurhcaseLinkDiscount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PurhcaseLinkDiscount]
    }
  }
}
