package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IListOptions
  extends StObject
     with IDataOptions {
  
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make
    * a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in
    * order to fetch the previous page of the list.
    */
  var ending_before: js.UndefOr[String] = js.undefined
  
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100 items.
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make
    * a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order
    * to fetch the next page of the list.
    */
  var starting_after: js.UndefOr[String] = js.undefined
}
object IListOptions {
  
  @scala.inline
  def apply(): IListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListOptions]
  }
  
  @scala.inline
  implicit class IListOptionsMutableBuilder[Self <: IListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnding_before(value: String): Self = StObject.set(x, "ending_before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnding_beforeUndefined: Self = StObject.set(x, "ending_before", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setStarting_after(value: String): Self = StObject.set(x, "starting_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarting_afterUndefined: Self = StObject.set(x, "starting_after", js.undefined)
  }
}
