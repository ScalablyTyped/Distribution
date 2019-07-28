package typings.vscodeDashLanguageserver

import org.scalablytyped.runtime.Instantiable0
import typings.vscodeDashLanguageserver.libConfigurationMod.Configuration
import typings.vscodeDashLanguageserver.libWorkspaceFoldersMod.WorkspaceFolders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vscodeDashLanguageserverMod {
  type ClientFeature[P] = Feature[RemoteClient, P]
  type ConsoleFeature[P] = Feature[RemoteConsole, P]
  type Feature[B, P] = js.Function1[/* Base */ Instantiable0[B], Instantiable0[B with P]]
  type IConnection = Connection[`_`, `_`, `_`, `_`, `_`, `_`]
  type RemoteWorkspace = _RemoteWorkspace with Configuration with WorkspaceFolders
  type TelemetryFeature[P] = Feature[Telemetry, P]
  type TracerFeature[P] = Feature[Tracer, P]
  type WindowFeature[P] = Feature[RemoteWindow, P]
  type WorkspaceFeature[P] = Feature[RemoteWorkspace, P]
}
