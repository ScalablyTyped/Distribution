package typings.vscodeDashLanguageserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vscodeDashLanguageserverMod {
  import org.scalablytyped.runtime.Instantiable0
  import typings.vscodeDashLanguageserver.libConfigurationMod.Configuration
  import typings.vscodeDashLanguageserver.libWorkspaceFoldersMod.WorkspaceFolders

  type ClientFeature[P] = Feature[RemoteClient, P]
  type ConsoleFeature[P] = Feature[RemoteConsole, P]
  type Feature[B, P] = js.Function1[/* Base */ Instantiable0[B], Instantiable0[B with P]]
  type IConnection = Connection[_underscore, _underscore, _underscore, _underscore, _underscore, _underscore]
  type RemoteWorkspace = _RemoteWorkspace with Configuration with WorkspaceFolders
  type TelemetryFeature[P] = Feature[Telemetry, P]
  type TracerFeature[P] = Feature[typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Tracer, P]
  type WindowFeature[P] = Feature[RemoteWindow, P]
  type WorkspaceFeature[P] = Feature[RemoteWorkspace, P]
}
