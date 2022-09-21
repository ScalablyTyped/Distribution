package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSkuCreateParams extends StObject {
  
  val Inventory: Any
}
object TypeofSkuCreateParams {
  
  inline def apply(Inventory: Any): TypeofSkuCreateParams = {
    val __obj = js.Dynamic.literal(Inventory = Inventory.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSkuCreateParams]
  }
  
  extension [Self <: TypeofSkuCreateParams](x: Self) {
    
    inline def setInventory(value: Any): Self = StObject.set(x, "Inventory", value.asInstanceOf[js.Any])
  }
}
