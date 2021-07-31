package typings.tizenAccessory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAPeerAgent extends StObject {
  
  val appName: String
  
  val feature: js.Array[String]
  
  val maxAllowedDataSize: Double
  
  val peerAccessory: SAPeerAccessory
  
  val peerId: String
  
  val profileVersion: String
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
  implicit class SAPeerAgentMutableBuilder[Self <: SAPeerAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeature(value: js.Array[String]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureVarargs(value: String*): Self = StObject.set(x, "feature", js.Array(value :_*))
    
    @scala.inline
    def setMaxAllowedDataSize(value: Double): Self = StObject.set(x, "maxAllowedDataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerAccessory(value: SAPeerAccessory): Self = StObject.set(x, "peerAccessory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerId(value: String): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileVersion(value: String): Self = StObject.set(x, "profileVersion", value.asInstanceOf[js.Any])
  }
}
