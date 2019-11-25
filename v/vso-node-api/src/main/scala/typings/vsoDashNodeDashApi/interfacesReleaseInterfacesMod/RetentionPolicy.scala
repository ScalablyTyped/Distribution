package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetentionPolicy extends js.Object {
  var daysToKeep: Double
}

object RetentionPolicy {
  @scala.inline
  def apply(daysToKeep: Double): RetentionPolicy = {
    val __obj = js.Dynamic.literal(daysToKeep = daysToKeep.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RetentionPolicy]
  }
}

