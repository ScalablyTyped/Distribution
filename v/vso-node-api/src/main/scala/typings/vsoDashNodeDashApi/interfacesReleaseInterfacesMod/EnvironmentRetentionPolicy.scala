package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentRetentionPolicy extends js.Object {
  var daysToKeep: Double
  var releasesToKeep: Double
  var retainBuild: Boolean
}

object EnvironmentRetentionPolicy {
  @scala.inline
  def apply(daysToKeep: Double, releasesToKeep: Double, retainBuild: Boolean): EnvironmentRetentionPolicy = {
    val __obj = js.Dynamic.literal(daysToKeep = daysToKeep, releasesToKeep = releasesToKeep, retainBuild = retainBuild)
  
    __obj.asInstanceOf[EnvironmentRetentionPolicy]
  }
}

