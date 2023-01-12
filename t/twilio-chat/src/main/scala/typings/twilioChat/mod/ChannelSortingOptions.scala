package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Channel sorting options.
  */
trait ChannelSortingOptions extends StObject {
  
  /**
    * Channel sorting criteria.
    */
  var criteria: js.UndefOr[ChannelSortingCriteria] = js.undefined
  
  /**
    * Channel sorting order.
    */
  var order: js.UndefOr[ChannelSortingOrder] = js.undefined
}
object ChannelSortingOptions {
  
  inline def apply(): ChannelSortingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSortingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelSortingOptions] (val x: Self) extends AnyVal {
    
    inline def setCriteria(value: ChannelSortingCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setOrder(value: ChannelSortingOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
