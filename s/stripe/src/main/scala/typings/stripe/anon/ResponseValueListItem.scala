package typings.stripe.anon

import typings.stripe.stripeStrings.radarDotvalue_list_item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Radar.ValueListItem> */
trait ResponseValueListItem extends StObject {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The name or email address of the user who added this item to the value list.
    */
  var created_by: String
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: radarDotvalue_list_item
  
  /**
    * The value of the item.
    */
  var value: String
  
  /**
    * The identifier of the value list this item belongs to.
    */
  var value_list: String
}
object ResponseValueListItem {
  
  inline def apply(
    created: Double,
    created_by: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    value: String,
    value_list: String
  ): ResponseValueListItem = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], value_list = value_list.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("radar.value_list_item")
    __obj.asInstanceOf[ResponseValueListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseValueListItem] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: radarDotvalue_list_item): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValue_list(value: String): Self = StObject.set(x, "value_list", value.asInstanceOf[js.Any])
  }
}
