package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueDnssdServiceInstance extends js.Object {
  /** The retrieved DnssdServiceInstance objects. */ var items: winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceInstance
  /** The number of items in items. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueDnssdServiceInstance {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceInstance,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueDnssdServiceInstance = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueDnssdServiceInstance]
  }
}

