package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketOptions extends StObject {
  
  /**
    * Reconnect on error.
    */
  var autoReconnect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * TCP Connection timeout setting.
    */
  var connectTimeoutMS: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * TCP KeepAlive on the socket with a X ms delay before start.
    */
  var keepAlive: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * TCP Socket NoDelay option.
    */
  var noDelay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * TCP Socket timeout setting.
    */
  var socketTimeoutMS: js.UndefOr[scala.Double] = js.undefined
}
object SocketOptions {
  
  inline def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  
  extension [Self <: SocketOptions](x: Self) {
    
    inline def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
    
    inline def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
    
    inline def setConnectTimeoutMS(value: scala.Double): Self = StObject.set(x, "connectTimeoutMS", value.asInstanceOf[js.Any])
    
    inline def setConnectTimeoutMSUndefined: Self = StObject.set(x, "connectTimeoutMS", js.undefined)
    
    inline def setKeepAlive(value: scala.Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
    
    inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
    
    inline def setSocketTimeoutMS(value: scala.Double): Self = StObject.set(x, "socketTimeoutMS", value.asInstanceOf[js.Any])
    
    inline def setSocketTimeoutMSUndefined: Self = StObject.set(x, "socketTimeoutMS", js.undefined)
  }
}
