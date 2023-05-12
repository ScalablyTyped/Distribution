package typings.stripe.anon

import typings.stripe.mod.Stripe.Address
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.terminalDotlocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Terminal.Location> */
trait ResponseLocation extends StObject {
  
  var address: Address
  
  /**
    * The ID of a configuration that will be used to customize all readers in this location.
    */
  var configuration_overrides: js.UndefOr[String] = js.undefined
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * The display name of the location.
    */
  var display_name: String
  
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
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: terminalDotlocation
}
object ResponseLocation {
  
  inline def apply(
    address: Address,
    display_name: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata
  ): ResponseLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")("terminal.location")
    __obj.asInstanceOf[ResponseLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseLocation] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setConfiguration_overrides(value: String): Self = StObject.set(x, "configuration_overrides", value.asInstanceOf[js.Any])
    
    inline def setConfiguration_overridesUndefined: Self = StObject.set(x, "configuration_overrides", js.undefined)
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: terminalDotlocation): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
