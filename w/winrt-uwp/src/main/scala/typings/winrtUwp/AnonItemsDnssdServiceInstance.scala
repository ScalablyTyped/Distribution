package typings.winrtUwp

import typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsDnssdServiceInstance extends js.Object {
  /** The retrieved DnssdServiceInstance objects. */ var items: DnssdServiceInstance
  /** The number of items in items. */ var returnValue: Double
}

object AnonItemsDnssdServiceInstance {
  @scala.inline
  def apply(items: DnssdServiceInstance, returnValue: Double): AnonItemsDnssdServiceInstance = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsDnssdServiceInstance]
  }
}

