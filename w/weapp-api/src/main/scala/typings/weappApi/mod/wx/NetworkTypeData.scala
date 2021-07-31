package typings.weappApi.mod.wx

import typings.weappApi.weappApiStrings.`2g`
import typings.weappApi.weappApiStrings.`3g`
import typings.weappApi.weappApiStrings.`4g`
import typings.weappApi.weappApiStrings.wifi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkTypeData extends StObject {
  
  /** 返回网络类型2g，3g，4g，wifi */
  var networkType: `2g` | `3g` | `4g` | wifi
}
object NetworkTypeData {
  
  @scala.inline
  def apply(networkType: `2g` | `3g` | `4g` | wifi): NetworkTypeData = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkTypeData]
  }
  
  @scala.inline
  implicit class NetworkTypeDataMutableBuilder[Self <: NetworkTypeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkType(value: `2g` | `3g` | `4g` | wifi): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
