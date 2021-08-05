package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkTypeSuccess extends StObject {
  
  /**
    * 网络类型
    */
  var networkType: js.UndefOr[String] = js.undefined
}
object GetNetworkTypeSuccess {
  
  inline def apply(): GetNetworkTypeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkTypeSuccess]
  }
  
  extension [Self <: GetNetworkTypeSuccess](x: Self) {
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "networkType", js.undefined)
  }
}
