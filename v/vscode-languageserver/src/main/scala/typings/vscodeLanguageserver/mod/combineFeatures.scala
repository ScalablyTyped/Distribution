package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "combineFeatures")
@js.native
object combineFeatures extends js.Object {
  def apply[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace, TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace](
    one: Features[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace, _underscore],
    two: Features[TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace, _underscore]
  ): Features[
    OConsole with TConsole, 
    OTracer with TTracer, 
    OTelemetry with TTelemetry, 
    OClient with TClient, 
    OWindow with TWindow, 
    OWorkspace with TWorkspace, 
    _underscore
  ] = js.native
}

