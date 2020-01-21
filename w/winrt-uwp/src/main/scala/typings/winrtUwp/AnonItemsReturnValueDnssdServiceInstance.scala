package typings.winrtUwp

import typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueDnssdServiceInstance extends js.Object {
  /** The retrieved DnssdServiceInstance objects. */ var items: DnssdServiceInstance
  /** The number of items in items. */ var returnValue: Double
}

object AnonItemsReturnValueDnssdServiceInstance {
  @scala.inline
  def apply(items: DnssdServiceInstance, returnValue: Double): AnonItemsReturnValueDnssdServiceInstance = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueDnssdServiceInstance]
  }
}

