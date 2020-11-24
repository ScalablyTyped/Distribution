package typings.tizenAccessory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAPeerAgent extends js.Object {
  
  val appName: String = js.native
  
  val feature: js.Array[String] = js.native
  
  val maxAllowedDataSize: Double = js.native
  
  val peerAccessory: SAPeerAccessory = js.native
  
  val peerId: String = js.native
  
  val profileVersion: String = js.native
}
object SAPeerAgent {
  
  @scala.inline
  def apply(
    appName: String,
    feature: js.Array[String],
    maxAllowedDataSize: Double,
    peerAccessory: SAPeerAccessory,
    peerId: String,
    profileVersion: String
  ): SAPeerAgent = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], maxAllowedDataSize = maxAllowedDataSize.asInstanceOf[js.Any], peerAccessory = peerAccessory.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], profileVersion = profileVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAPeerAgent]
  }
  
  @scala.inline
  implicit class SAPeerAgentOps[Self <: SAPeerAgent] (val x: Self) extends AnyVal {
    
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
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureVarargs(value: String*): Self = this.set("feature", js.Array(value :_*))
    
    @scala.inline
    def setFeature(value: js.Array[String]): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAllowedDataSize(value: Double): Self = this.set("maxAllowedDataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerAccessory(value: SAPeerAccessory): Self = this.set("peerAccessory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerId(value: String): Self = this.set("peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileVersion(value: String): Self = this.set("profileVersion", value.asInstanceOf[js.Any])
  }
}
