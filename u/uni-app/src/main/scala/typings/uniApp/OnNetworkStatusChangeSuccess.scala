package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnNetworkStatusChangeSuccess extends StObject {
  
  /**
    * 当前是否有网络连接
    */
  var isConnected: js.UndefOr[Double] = js.undefined
  
  /**
    * 网络类型
    */
  var networkType: js.UndefOr[String] = js.undefined
}
object OnNetworkStatusChangeSuccess {
  
  inline def apply(): OnNetworkStatusChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnNetworkStatusChangeSuccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnNetworkStatusChangeSuccess] (val x: Self) extends AnyVal {
    
    inline def setIsConnected(value: Double): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    inline def setIsConnectedUndefined: Self = StObject.set(x, "isConnected", js.undefined)
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "networkType", js.undefined)
  }
}
