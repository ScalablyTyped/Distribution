package typings.stripe.anon

import typings.stripe.mod.IDateFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fulfilled extends StObject {
  
  /**
    * A filter on the list based on the object canceled field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var canceled: js.UndefOr[IDateFilter] = js.undefined
  
  /**
    * A filter on the list based on the object fulfilled field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var fulfilled: js.UndefOr[IDateFilter] = js.undefined
  
  /**
    * A filter on the list based on the object paid field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var paid: js.UndefOr[IDateFilter] = js.undefined
  
  /**
    * A filter on the list based on the object returned field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var returned: js.UndefOr[IDateFilter] = js.undefined
}
object Fulfilled {
  
  inline def apply(): Fulfilled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fulfilled]
  }
  
  extension [Self <: Fulfilled](x: Self) {
    
    inline def setCanceled(value: IDateFilter): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
    
    inline def setFulfilled(value: IDateFilter): Self = StObject.set(x, "fulfilled", value.asInstanceOf[js.Any])
    
    inline def setFulfilledUndefined: Self = StObject.set(x, "fulfilled", js.undefined)
    
    inline def setPaid(value: IDateFilter): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
    
    inline def setPaidUndefined: Self = StObject.set(x, "paid", js.undefined)
    
    inline def setReturned(value: IDateFilter): Self = StObject.set(x, "returned", value.asInstanceOf[js.Any])
    
    inline def setReturnedUndefined: Self = StObject.set(x, "returned", js.undefined)
  }
}
