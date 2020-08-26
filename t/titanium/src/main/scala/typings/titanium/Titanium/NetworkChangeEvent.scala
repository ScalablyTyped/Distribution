package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class NetworkChangeEventOps[Self <: NetworkChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNetworkType(value: Double): Self = this.set("networkType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkTypeName(value: String): Self = this.set("networkTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnline(value: Boolean): Self = this.set("online", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

