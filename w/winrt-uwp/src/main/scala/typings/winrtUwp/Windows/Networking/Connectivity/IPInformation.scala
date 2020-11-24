package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the association between an IP address and an adapter on the network. */
@js.native
trait IPInformation extends js.Object {
  
  /** Retrieves the network adapter associated with the IP address. */
  var networkAdapter: NetworkAdapter = js.native
  
  /** Retrieves the length of the prefix, or network part of the IP address. */
  var prefixLength: Double = js.native
}
object IPInformation {
  
  @scala.inline
  def apply(networkAdapter: NetworkAdapter, prefixLength: Double): IPInformation = {
    val __obj = js.Dynamic.literal(networkAdapter = networkAdapter.asInstanceOf[js.Any], prefixLength = prefixLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPInformation]
  }
  
  @scala.inline
  implicit class IPInformationOps[Self <: IPInformation] (val x: Self) extends AnyVal {
    
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
    def setNetworkAdapter(value: NetworkAdapter): Self = this.set("networkAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixLength(value: Double): Self = this.set("prefixLength", value.asInstanceOf[js.Any])
  }
}
