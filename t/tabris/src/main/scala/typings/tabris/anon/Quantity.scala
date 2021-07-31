package typings.tabris.anon

import typings.tabris.tabrisStrings.multiple
import typings.tabris.tabrisStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quantity extends StObject {
  
  var quantity: js.UndefOr[single | multiple] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object Quantity {
  
  @scala.inline
  def apply(): Quantity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quantity]
  }
  
  @scala.inline
  implicit class QuantityMutableBuilder[Self <: Quantity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuantity(value: single | multiple): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
