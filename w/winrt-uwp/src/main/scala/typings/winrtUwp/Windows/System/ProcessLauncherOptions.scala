package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessLauncherOptions extends js.Object {
  var standardError: js.Any
   /* unmapped type */ var standardInput: js.Any
   /* unmapped type */ var standardOutput: js.Any
   /* unmapped type */ var workingDirectory: js.Any
}

object ProcessLauncherOptions {
  @scala.inline
  def apply(standardError: js.Any, standardInput: js.Any, standardOutput: js.Any, workingDirectory: js.Any): ProcessLauncherOptions = {
    val __obj = js.Dynamic.literal(standardError = standardError.asInstanceOf[js.Any], standardInput = standardInput.asInstanceOf[js.Any], standardOutput = standardOutput.asInstanceOf[js.Any], workingDirectory = workingDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessLauncherOptions]
  }
}

