package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigFileDiagnosticsReporter extends StObject {
  
  /**
    * Reports unrecoverable error when parsing config file
    */
  def onUnRecoverableConfigFileDiagnostic(diagnostic: Diagnostic): Unit = js.native
  /**
    * Reports unrecoverable error when parsing config file
    */
  @JSName("onUnRecoverableConfigFileDiagnostic")
  var onUnRecoverableConfigFileDiagnostic_Original: DiagnosticReporter = js.native
}
