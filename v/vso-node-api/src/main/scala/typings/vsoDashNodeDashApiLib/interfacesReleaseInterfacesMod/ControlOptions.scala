package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlOptions extends js.Object {
  var alwaysRun: scala.Boolean
  var continueOnError: scala.Boolean
  var enabled: scala.Boolean
}

object ControlOptions {
  @scala.inline
  def apply(alwaysRun: scala.Boolean, continueOnError: scala.Boolean, enabled: scala.Boolean): ControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alwaysRun")(alwaysRun)
    __obj.updateDynamic("continueOnError")(continueOnError)
    __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[ControlOptions]
  }
}

