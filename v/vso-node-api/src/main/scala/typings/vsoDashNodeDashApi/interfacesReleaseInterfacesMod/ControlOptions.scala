package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlOptions extends js.Object {
  var alwaysRun: Boolean
  var continueOnError: Boolean
  var enabled: Boolean
}

object ControlOptions {
  @scala.inline
  def apply(alwaysRun: Boolean, continueOnError: Boolean, enabled: Boolean): ControlOptions = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun, continueOnError = continueOnError, enabled = enabled)
  
    __obj.asInstanceOf[ControlOptions]
  }
}

