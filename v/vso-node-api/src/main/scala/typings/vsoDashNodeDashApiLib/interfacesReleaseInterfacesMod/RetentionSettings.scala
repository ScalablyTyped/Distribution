package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetentionSettings extends js.Object {
  var daysToKeepDeletedReleases: scala.Double
  var defaultEnvironmentRetentionPolicy: EnvironmentRetentionPolicy
  var maximumEnvironmentRetentionPolicy: EnvironmentRetentionPolicy
}

object RetentionSettings {
  @scala.inline
  def apply(
    daysToKeepDeletedReleases: scala.Double,
    defaultEnvironmentRetentionPolicy: EnvironmentRetentionPolicy,
    maximumEnvironmentRetentionPolicy: EnvironmentRetentionPolicy
  ): RetentionSettings = {
    val __obj = js.Dynamic.literal(daysToKeepDeletedReleases = daysToKeepDeletedReleases, defaultEnvironmentRetentionPolicy = defaultEnvironmentRetentionPolicy, maximumEnvironmentRetentionPolicy = maximumEnvironmentRetentionPolicy)
  
    __obj.asInstanceOf[RetentionSettings]
  }
}

