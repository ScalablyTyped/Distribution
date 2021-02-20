package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsDnssdServiceInstance extends StObject {
  
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
  implicit class ItemsDnssdServiceInstanceMutableBuilder[Self <: ItemsDnssdServiceInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: DnssdServiceInstance): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
