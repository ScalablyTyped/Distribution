package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsDnssdServiceInstance extends js.Object {
  /** The retrieved DnssdServiceInstance objects. */ var items: DnssdServiceInstance = js.native
  /** The number of items in items. */ var returnValue: Double = js.native
}

object ItemsDnssdServiceInstance {
  @scala.inline
  def apply(items: DnssdServiceInstance, returnValue: Double): ItemsDnssdServiceInstance = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsDnssdServiceInstance]
  }
  @scala.inline
  implicit class ItemsDnssdServiceInstanceOps[Self <: ItemsDnssdServiceInstance] (val x: Self) extends AnyVal {
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
    def setItems(value: DnssdServiceInstance): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

