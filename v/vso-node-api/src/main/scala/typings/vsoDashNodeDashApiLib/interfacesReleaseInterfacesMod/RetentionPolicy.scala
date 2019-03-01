package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetentionPolicy extends js.Object {
  var daysToKeep: scala.Double
}

object RetentionPolicy {
  @scala.inline
  def apply(daysToKeep: scala.Double): RetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("daysToKeep")(daysToKeep)
    __obj.asInstanceOf[RetentionPolicy]
  }
}

