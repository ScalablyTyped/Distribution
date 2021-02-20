package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnNetworkStatusChangeSuccess extends StObject {
  
  /**
    * 当前是否有网络连接
    */
  var isConnected: js.UndefOr[Double] = js.native
  
  /**
    * 网络类型
    */
  var networkType: js.UndefOr[String] = js.native
}
object OnNetworkStatusChangeSuccess {
  
  @scala.inline
  def apply(): OnNetworkStatusChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnNetworkStatusChangeSuccess]
  }
  
  @scala.inline
  implicit class OnNetworkStatusChangeSuccessMutableBuilder[Self <: OnNetworkStatusChangeSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsConnected(value: Double): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConnectedUndefined: Self = StObject.set(x, "isConnected", js.undefined)
    
    @scala.inline
    def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTypeUndefined: Self = StObject.set(x, "networkType", js.undefined)
  }
}
