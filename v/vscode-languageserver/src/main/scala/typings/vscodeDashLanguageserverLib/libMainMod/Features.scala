package typings
package vscodeDashLanguageserverLib.libMainMod

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

object Features {
  @scala.inline
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    __brand: vscodeDashLanguageserverLib.vscodeDashLanguageserverLibStrings.features,
    client: ClientFeature[PClient] = null,
    console: ConsoleFeature[PConsole] = null,
    telemetry: TelemetryFeature[PTelemetry] = null,
    tracer: TracerFeature[PTracer] = null,
    window: WindowFeature[PWindow] = null,
    workspace: WorkspaceFeature[PWorkspace] = null
  ): Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
    val __obj = js.Dynamic.literal(__brand = __brand)
    if (client != null) __obj.updateDynamic("client")(client)
    if (console != null) __obj.updateDynamic("console")(console)
    if (telemetry != null) __obj.updateDynamic("telemetry")(telemetry)
    if (tracer != null) __obj.updateDynamic("tracer")(tracer)
    if (window != null) __obj.updateDynamic("window")(window)
    if (workspace != null) __obj.updateDynamic("workspace")(workspace)
    __obj.asInstanceOf[Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]]
  }
}

