package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionGatesOptions extends StObject {
  
  var isEnabled: Boolean
  
  var samplingInterval: Double
  
  var stabilizationTime: Double
  
  var timeout: Double
}
object ReleaseDefinitionGatesOptions {
  
  @scala.inline
  def apply(isEnabled: Boolean, samplingInterval: Double, stabilizationTime: Double, timeout: Double): ReleaseDefinitionGatesOptions = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], samplingInterval = samplingInterval.asInstanceOf[js.Any], stabilizationTime = stabilizationTime.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionGatesOptions]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionGatesOptionsMutableBuilder[Self <: ReleaseDefinitionGatesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingInterval(value: Double): Self = StObject.set(x, "samplingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStabilizationTime(value: Double): Self = StObject.set(x, "stabilizationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
