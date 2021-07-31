package typings.wegameApi.anon

import typings.wegameApi.wx.types.NetworkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsConnected extends StObject {
  
  /**
    * 当前是否有网络链接
    */
  var isConnected: Boolean
  
  /**
    * none - 无网络, unknown - Android 下不常见的网络类型
    */
  var networkType: NetworkType
}
object IsConnected {
  
  @scala.inline
  def apply(isConnected: Boolean, networkType: NetworkType): IsConnected = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsConnected]
  }
  
  @scala.inline
  implicit class IsConnectedMutableBuilder[Self <: IsConnected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkType(value: NetworkType): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
