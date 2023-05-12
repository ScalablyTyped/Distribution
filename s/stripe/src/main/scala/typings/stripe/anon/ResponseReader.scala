package typings.stripe.anon

import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Terminal.Location
import typings.stripe.mod.Stripe.Terminal.Reader.Action
import typings.stripe.mod.Stripe.Terminal.Reader.DeviceType
import typings.stripe.stripeStrings.terminalDotreader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Terminal.Reader> */
trait ResponseReader extends StObject {
  
  /**
    * The most recent action performed by the reader.
    */
  var action: Action | Null
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * The current software version of the reader.
    */
  var device_sw_version: String | Null
  
  /**
    * Type of reader, one of `bbpos_wisepad3`, `stripe_m2`, `bbpos_chipper2x`, `bbpos_wisepos_e`, `verifone_P400`, or `simulated_wisepos_e`.
    */
  var device_type: DeviceType
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * The local IP address of the reader.
    */
  var ip_address: String | Null
  
  /**
    * Custom label given to the reader for easier identification.
    */
  var label: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * The location identifier of the reader.
    */
  var location: String | Location | Null
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: terminalDotreader
  
  /**
    * Serial number of the reader.
    */
  var serial_number: String
  
  /**
    * The networking status of the reader.
    */
  var status: String | Null
}
object ResponseReader {
  
  inline def apply(
    device_type: DeviceType,
    id: String,
    label: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    serial_number: String
  ): ResponseReader = {
    val __obj = js.Dynamic.literal(device_type = device_type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], serial_number = serial_number.asInstanceOf[js.Any], action = null, device_sw_version = null, ip_address = null, location = null, status = null)
    __obj.updateDynamic("object")("terminal.reader")
    __obj.asInstanceOf[ResponseReader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseReader] (val x: Self) extends AnyVal {
    
    inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDevice_sw_version(value: String): Self = StObject.set(x, "device_sw_version", value.asInstanceOf[js.Any])
    
    inline def setDevice_sw_versionNull: Self = StObject.set(x, "device_sw_version", null)
    
    inline def setDevice_type(value: DeviceType): Self = StObject.set(x, "device_type", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
    
    inline def setIp_addressNull: Self = StObject.set(x, "ip_address", null)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String | Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: terminalDotreader): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setSerial_number(value: String): Self = StObject.set(x, "serial_number", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
  }
}
