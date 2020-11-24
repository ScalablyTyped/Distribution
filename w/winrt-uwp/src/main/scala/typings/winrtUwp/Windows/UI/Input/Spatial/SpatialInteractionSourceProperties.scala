package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialInteractionSourceProperties extends js.Object {
  
  var sourceLossRisk: js.Any = js.native
  
   /* unmapped type */ var tryGetLocation: js.Any = js.native
  
   /* unmapped type */ var tryGetSourceLossMitigationDirection: js.Any = js.native
}
object SpatialInteractionSourceProperties {
  
  @scala.inline
  def apply(sourceLossRisk: js.Any, tryGetLocation: js.Any, tryGetSourceLossMitigationDirection: js.Any): SpatialInteractionSourceProperties = {
    val __obj = js.Dynamic.literal(sourceLossRisk = sourceLossRisk.asInstanceOf[js.Any], tryGetLocation = tryGetLocation.asInstanceOf[js.Any], tryGetSourceLossMitigationDirection = tryGetSourceLossMitigationDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceProperties]
  }
  
  @scala.inline
  implicit class SpatialInteractionSourcePropertiesOps[Self <: SpatialInteractionSourceProperties] (val x: Self) extends AnyVal {
    
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
    def setSourceLossRisk(value: js.Any): Self = this.set("sourceLossRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetLocation(value: js.Any): Self = this.set("tryGetLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetSourceLossMitigationDirection(value: js.Any): Self = this.set("tryGetSourceLossMitigationDirection", value.asInstanceOf[js.Any])
  }
}
