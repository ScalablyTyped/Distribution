package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] extends js.Object {
  var __brand: vscodeDashLanguageserverLib.vscodeDashLanguageserverLibStrings.features
  var client: js.UndefOr[ClientFeature[PClient]] = js.undefined
  var console: js.UndefOr[ConsoleFeature[PConsole]] = js.undefined
  var telemetry: js.UndefOr[TelemetryFeature[PTelemetry]] = js.undefined
  var tracer: js.UndefOr[TracerFeature[PTracer]] = js.undefined
  var window: js.UndefOr[WindowFeature[PWindow]] = js.undefined
  var workspace: js.UndefOr[WorkspaceFeature[PWorkspace]] = js.undefined
}

