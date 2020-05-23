package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when network connectivity changes.
  */
trait NetworkChangeEvent extends NetworkBaseEvent {
  /**
    * New network type
    */
  var networkType: Double
  /**
    * New network type as a string.
    */
  var networkTypeName: String
  /**
    * Boolean indicating if the device is connected to the network.
    */
  var online: Boolean
  /**
    * Human-readable text describing the reason for the change.
    */
  var reason: String
}

object NetworkChangeEvent {
  @scala.inline
  def apply(networkType: Double, networkTypeName: String, online: Boolean, reason: String, source: Network): NetworkChangeEvent = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any], networkTypeName = networkTypeName.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkChangeEvent]
  }
}

