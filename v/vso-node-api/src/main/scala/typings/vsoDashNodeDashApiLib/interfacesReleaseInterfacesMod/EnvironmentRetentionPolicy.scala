package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentRetentionPolicy extends js.Object {
  var daysToKeep: scala.Double
  var releasesToKeep: scala.Double
  var retainBuild: scala.Boolean
}

object EnvironmentRetentionPolicy {
  @scala.inline
  def apply(daysToKeep: scala.Double, releasesToKeep: scala.Double, retainBuild: scala.Boolean): EnvironmentRetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("daysToKeep")(daysToKeep)
    __obj.updateDynamic("releasesToKeep")(releasesToKeep)
    __obj.updateDynamic("retainBuild")(retainBuild)
    __obj.asInstanceOf[EnvironmentRetentionPolicy]
  }
}

