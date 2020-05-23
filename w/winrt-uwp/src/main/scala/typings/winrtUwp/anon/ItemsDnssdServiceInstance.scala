package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsDnssdServiceInstance extends js.Object {
  /** The retrieved DnssdServiceInstance objects. */ var items: DnssdServiceInstance
  /** The number of items in items. */ var returnValue: Double
}

object ItemsDnssdServiceInstance {
  @scala.inline
  def apply(items: DnssdServiceInstance, returnValue: Double): ItemsDnssdServiceInstance = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsDnssdServiceInstance]
  }
}

