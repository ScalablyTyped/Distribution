package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessLauncherResult extends js.Object {
  var exitCode: js.Any
}

object ProcessLauncherResult {
  @scala.inline
  def apply(exitCode: js.Any): ProcessLauncherResult = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessLauncherResult]
  }
}

