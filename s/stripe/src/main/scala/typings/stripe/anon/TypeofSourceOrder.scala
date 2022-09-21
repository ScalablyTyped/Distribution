package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSourceOrder extends StObject {
  
  val Item: Any
}
object TypeofSourceOrder {
  
  inline def apply(Item: Any): TypeofSourceOrder = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSourceOrder]
  }
  
  extension [Self <: TypeofSourceOrder](x: Self) {
    
    inline def setItem(value: Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
