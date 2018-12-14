package typings
package vscodeDashLanguageserverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vscodeDashLanguageserverMod {
  type ClientFeature[P] = Feature[RemoteClient, P]
  type ConsoleFeature[P] = Feature[RemoteConsole, P]
  type Feature[B, P] = js.Function1[
    /* Base */ org.scalablytyped.runtime.Instantiable0[B], 
    org.scalablytyped.runtime.Instantiable0[B with P]
  ]
  type FoldingRangeKind = vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRangeKind
  type IConnection = Connection[`_`, `_`, `_`, `_`, `_`, `_`]
  type RemoteWorkspace = _RemoteWorkspace with vscodeDashLanguageserverLib.libConfigurationMod.Configuration with vscodeDashLanguageserverLib.libWorkspaceFoldersMod.WorkspaceFolders
  type TelemetryFeature[P] = Feature[Telemetry, P]
  type Trace = vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Trace
  type TraceFormat = vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.TraceFormat
  type TracerFeature[P] = Feature[Tracer, P]
  type WindowFeature[P] = Feature[RemoteWindow, P]
  type WorkspaceFeature[P] = Feature[RemoteWorkspace, P]
}
