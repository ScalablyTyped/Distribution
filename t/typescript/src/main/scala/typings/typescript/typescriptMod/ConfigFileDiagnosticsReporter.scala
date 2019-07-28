package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reports config file diagnostics
  */
@js.native
trait ConfigFileDiagnosticsReporter extends js.Object {
  /**
    * Reports unrecoverable error when parsing config file
    */
  @JSName("onUnRecoverableConfigFileDiagnostic")
  var onUnRecoverableConfigFileDiagnostic_Original: DiagnosticReporter = js.native
  /**
    * Reports unrecoverable error when parsing config file
    */
  def onUnRecoverableConfigFileDiagnostic(diagnostic: Diagnostic): Unit = js.native
}

