package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal(isEnabled = isEnabled, samplingInterval = samplingInterval, stabilizationTime = stabilizationTime, timeout = timeout)
  
    __obj.asInstanceOf[ReleaseDefinitionGatesOptions]
  }
}

