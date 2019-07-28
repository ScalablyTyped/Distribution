package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueDnssdServiceInstance extends js.Object {
  /** The retrieved DnssdServiceInstance objects. */ var items: DnssdServiceInstance
  /** The number of items in items. */ var returnValue: Double
}

object Anon_ItemsReturnValueDnssdServiceInstance {
  @scala.inline
  def apply(items: DnssdServiceInstance, returnValue: Double): Anon_ItemsReturnValueDnssdServiceInstance = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueDnssdServiceInstance]
  }
}

