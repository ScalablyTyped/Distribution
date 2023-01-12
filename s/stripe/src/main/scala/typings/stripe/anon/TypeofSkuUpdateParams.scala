package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSkuUpdateParams extends StObject {
  
  val Inventory: Any
}
object TypeofSkuUpdateParams {
  
  inline def apply(Inventory: Any): TypeofSkuUpdateParams = {
    val __obj = js.Dynamic.literal(Inventory = Inventory.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSkuUpdateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSkuUpdateParams] (val x: Self) extends AnyVal {
    
    inline def setInventory(value: Any): Self = StObject.set(x, "Inventory", value.asInstanceOf[js.Any])
  }
}
