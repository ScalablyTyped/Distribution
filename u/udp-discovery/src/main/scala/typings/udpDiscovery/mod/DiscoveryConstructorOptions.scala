package typings.udpDiscovery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoveryConstructorOptions extends js.Object {
  
  /**
    * The address to bind to. Default: listens to all interfaces.
    */
  var bindAddr: js.UndefOr[String] = js.native
  
  /**
    * Either 'udp4' or 'udp6'. Default: 'udp4'.
    */
  var dgramType: js.UndefOr[String] = js.native
  
  /**
    * The port to listen upon for service announcements. Default: 44201.
    */
  var port: js.UndefOr[Double] = js.native
}
object DiscoveryConstructorOptions {
  
  @scala.inline
  def apply(): DiscoveryConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveryConstructorOptions]
  }
  
  @scala.inline
  implicit class DiscoveryConstructorOptionsOps[Self <: DiscoveryConstructorOptions] (val x: Self) extends AnyVal {
    
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
    def setBindAddr(value: String): Self = this.set("bindAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindAddr: Self = this.set("bindAddr", js.undefined)
    
    @scala.inline
    def setDgramType(value: String): Self = this.set("dgramType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDgramType: Self = this.set("dgramType", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
