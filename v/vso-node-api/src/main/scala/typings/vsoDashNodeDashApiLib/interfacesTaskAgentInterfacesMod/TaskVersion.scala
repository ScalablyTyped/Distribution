package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskVersion extends js.Object {
  var isTest: scala.Boolean
  var major: scala.Double
  var minor: scala.Double
  var patch: scala.Double
}

object TaskVersion {
  @scala.inline
  def apply(isTest: scala.Boolean, major: scala.Double, minor: scala.Double, patch: scala.Double): TaskVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isTest")(isTest)
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[TaskVersion]
  }
}

