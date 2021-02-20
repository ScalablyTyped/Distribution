package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when network connectivity changes.
  */
@js.native
trait NetworkChangeEvent extends NetworkBaseEvent {
  
  /**
    * New network type
    */
  var networkType: Double = js.native
  
  /**
    * New network type as a string.
    */
  var networkTypeName: String = js.native
  
  /**
    * Boolean indicating if the device is connected to the network.
    */
  var online: Boolean = js.native
  
  /**
    * Human-readable text describing the reason for the change.
    */
  var reason: String = js.native
}
object NetworkChangeEvent {
  
  @scala.inline
  def apply(networkType: Double, networkTypeName: String, online: Boolean, reason: String, source: Network): NetworkChangeEvent = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any], networkTypeName = networkTypeName.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkChangeEvent]
  }
  
  @scala.inline
  implicit class NetworkChangeEventMutableBuilder[Self <: NetworkChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkType(value: Double): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTypeName(value: String): Self = StObject.set(x, "networkTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
