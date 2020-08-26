package typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd

import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates detailed information about the result of an attempt to register a service instance using DNS-SD. */
@js.native
trait DnssdRegistrationResult extends js.Object {
  /** Indicates whether the instance name was changed in the course of the registration process. */
  var hasInstanceNameChanged: Boolean = js.native
  /** The IP address of the successfully-created service instance. */
  var ipAddress: HostName = js.native
  /** An enumeration value indicating the result of a service instance registration attempt. */
  var status: DnssdRegistrationStatus = js.native
}

object DnssdRegistrationResult {
  @scala.inline
  def apply(hasInstanceNameChanged: Boolean, ipAddress: HostName, status: DnssdRegistrationStatus): DnssdRegistrationResult = {
    val __obj = js.Dynamic.literal(hasInstanceNameChanged = hasInstanceNameChanged.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnssdRegistrationResult]
  }
  @scala.inline
  implicit class DnssdRegistrationResultOps[Self <: DnssdRegistrationResult] (val x: Self) extends AnyVal {
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
    def setHasInstanceNameChanged(value: Boolean): Self = this.set("hasInstanceNameChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpAddress(value: HostName): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: DnssdRegistrationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

