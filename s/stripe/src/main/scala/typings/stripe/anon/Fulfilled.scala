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
  
  @scala.inline
  def apply(): Fulfilled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fulfilled]
  }
  
  @scala.inline
  implicit class FulfilledMutableBuilder[Self <: Fulfilled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanceled(value: IDateFilter): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
    
    @scala.inline
    def setFulfilled(value: IDateFilter): Self = StObject.set(x, "fulfilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfilledUndefined: Self = StObject.set(x, "fulfilled", js.undefined)
    
    @scala.inline
    def setPaid(value: IDateFilter): Self = StObject.set(x, "paid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaidUndefined: Self = StObject.set(x, "paid", js.undefined)
    
    @scala.inline
    def setReturned(value: IDateFilter): Self = StObject.set(x, "returned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnedUndefined: Self = StObject.set(x, "returned", js.undefined)
  }
}
