package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialInteractionSourceProperties extends js.Object {
  var sourceLossRisk: js.Any
   /* unmapped type */ var tryGetLocation: js.Any
   /* unmapped type */ var tryGetSourceLossMitigationDirection: js.Any
}

object SpatialInteractionSourceProperties {
  @scala.inline
  def apply(sourceLossRisk: js.Any, tryGetLocation: js.Any, tryGetSourceLossMitigationDirection: js.Any): SpatialInteractionSourceProperties = {
    val __obj = js.Dynamic.literal(sourceLossRisk = sourceLossRisk.asInstanceOf[js.Any], tryGetLocation = tryGetLocation.asInstanceOf[js.Any], tryGetSourceLossMitigationDirection = tryGetSourceLossMitigationDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceProperties]
  }
}

