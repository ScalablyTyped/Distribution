package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNetworkTypeSuccess extends StObject {
  
  /**
    * 网络类型
    */
  var networkType: js.UndefOr[String] = js.native
}
object GetNetworkTypeSuccess {
  
  @scala.inline
  def apply(): GetNetworkTypeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkTypeSuccess]
  }
  
  @scala.inline
  implicit class GetNetworkTypeSuccessMutableBuilder[Self <: GetNetworkTypeSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTypeUndefined: Self = StObject.set(x, "networkType", js.undefined)
  }
}
