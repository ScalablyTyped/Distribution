package typings.trtcJsSdk.mod

import typings.trtcJsSdk.trtcJsSdkInts.`1`
import typings.trtcJsSdk.trtcJsSdkInts.`2`
import typings.trtcJsSdk.trtcJsSdkInts.`3`
import typings.trtcJsSdk.trtcJsSdkInts.`4`
import typings.trtcJsSdk.trtcJsSdkInts.`5`
import typings.trtcJsSdk.trtcJsSdkInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkQuality extends StObject {
  
  /** 下行网络质量为 腾讯云到 SDK 的所有下行连接的平均网络质量 */
  var downlinkNetworkQuality: `1` | `2` | `3` | `4` | `5` | `6`
  
  /** 上行网络质量为 SDK 到腾讯云的上行连接网络质量 */
  var uplinkNetworkQuality: `1` | `2` | `3` | `4` | `5` | `6`
}
object NetworkQuality {
  
  inline def apply(
    downlinkNetworkQuality: `1` | `2` | `3` | `4` | `5` | `6`,
    uplinkNetworkQuality: `1` | `2` | `3` | `4` | `5` | `6`
  ): NetworkQuality = {
    val __obj = js.Dynamic.literal(downlinkNetworkQuality = downlinkNetworkQuality.asInstanceOf[js.Any], uplinkNetworkQuality = uplinkNetworkQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkQuality]
  }
  
  extension [Self <: NetworkQuality](x: Self) {
    
    inline def setDownlinkNetworkQuality(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "downlinkNetworkQuality", value.asInstanceOf[js.Any])
    
    inline def setUplinkNetworkQuality(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "uplinkNetworkQuality", value.asInstanceOf[js.Any])
  }
}
