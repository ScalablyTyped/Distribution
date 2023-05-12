package typings.stripe.anon

import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Radar.ValueList.ItemType
import typings.stripe.mod.Stripe.Radar.ValueListItem
import typings.stripe.stripeStrings.radarDotvalue_list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Radar.ValueList> */
trait ResponseValueList extends StObject {
  
  /**
    * The name of the value list for use in rules.
    */
  var alias: String
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The name or email address of the user who created this value list.
    */
  var created_by: String
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * The type of items in the value list. One of `card_fingerprint`, `card_bin`, `email`, `ip_address`, `country`, `string`, `case_sensitive_string`, or `customer_id`.
    */
  var item_type: ItemType
  
  var lastResponse: ApiVersion
  
  /**
    * List of items contained within this value list.
    */
  var list_items: ApiList[ValueListItem]
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * The name of the value list.
    */
  var name: String
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: radarDotvalue_list
}
object ResponseValueList {
  
  inline def apply(
    alias: String,
    created: Double,
    created_by: String,
    id: String,
    item_type: ItemType,
    lastResponse: ApiVersion,
    list_items: ApiList[ValueListItem],
    livemode: Boolean,
    metadata: Metadata,
    name: String
  ): ResponseValueList = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], list_items = list_items.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("radar.value_list")
    __obj.asInstanceOf[ResponseValueList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseValueList] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setItem_type(value: ItemType): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setList_items(value: ApiList[ValueListItem]): Self = StObject.set(x, "list_items", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObject(value: radarDotvalue_list): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
