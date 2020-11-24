package typings.typeorm.typingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketOptions extends js.Object {
  
  /**
    * Reconnect on error.
    */
  var autoReconnect: js.UndefOr[Boolean] = js.native
  
  /**
    * TCP Connection timeout setting.
    */
  var connectTimeoutMS: js.UndefOr[scala.Double] = js.native
  
  /**
    * TCP KeepAlive on the socket with a X ms delay before start.
    */
  var keepAlive: js.UndefOr[scala.Double] = js.native
  
  /**
    * TCP Socket NoDelay option.
    */
  var noDelay: js.UndefOr[Boolean] = js.native
  
  /**
    * TCP Socket timeout setting.
    */
  var socketTimeoutMS: js.UndefOr[scala.Double] = js.native
}
object SocketOptions {
  
  @scala.inline
  def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoReconnect(value: Boolean): Self = this.set("autoReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoReconnect: Self = this.set("autoReconnect", js.undefined)
    
    @scala.inline
    def setConnectTimeoutMS(value: scala.Double): Self = this.set("connectTimeoutMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeoutMS: Self = this.set("connectTimeoutMS", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: scala.Double): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    
    @scala.inline
    def setNoDelay(value: Boolean): Self = this.set("noDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDelay: Self = this.set("noDelay", js.undefined)
    
    @scala.inline
    def setSocketTimeoutMS(value: scala.Double): Self = this.set("socketTimeoutMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketTimeoutMS: Self = this.set("socketTimeoutMS", js.undefined)
  }
}
