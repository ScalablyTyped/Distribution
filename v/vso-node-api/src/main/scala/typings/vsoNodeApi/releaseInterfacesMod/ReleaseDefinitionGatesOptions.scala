package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionGatesOptions extends js.Object {
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
}

