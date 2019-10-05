package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import org.scalablytyped.runtime.Instantiable0
import typings.vscodeDashLanguageserver.vscodeDashLanguageserverStrings.features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] extends js.Object {
  var __brand: features
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
    __brand: features,
    client: /* Base */ Instantiable0[RemoteClient] => Instantiable0[RemoteClient with PClient] = null,
    console: /* Base */ Instantiable0[RemoteConsole] => Instantiable0[RemoteConsole with PConsole] = null,
    telemetry: /* Base */ Instantiable0[Telemetry] => Instantiable0[Telemetry with PTelemetry] = null,
    tracer: /* Base */ Instantiable0[Tracer] => Instantiable0[Tracer with PTracer] = null,
    window: /* Base */ Instantiable0[RemoteWindow] => Instantiable0[RemoteWindow with PWindow] = null,
    workspace: /* Base */ Instantiable0[RemoteWorkspace] => Instantiable0[RemoteWorkspace with PWorkspace] = null
  ): Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
    val __obj = js.Dynamic.literal(__brand = __brand)
    if (client != null) __obj.updateDynamic("client")(js.Any.fromFunction1(client))
    if (console != null) __obj.updateDynamic("console")(js.Any.fromFunction1(console))
    if (telemetry != null) __obj.updateDynamic("telemetry")(js.Any.fromFunction1(telemetry))
    if (tracer != null) __obj.updateDynamic("tracer")(js.Any.fromFunction1(tracer))
    if (window != null) __obj.updateDynamic("window")(js.Any.fromFunction1(window))
    if (workspace != null) __obj.updateDynamic("workspace")(js.Any.fromFunction1(workspace))
    __obj.asInstanceOf[Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]]
  }
}

