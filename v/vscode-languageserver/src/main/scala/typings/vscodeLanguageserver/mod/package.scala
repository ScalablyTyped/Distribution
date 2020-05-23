package typings.vscodeLanguageserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClientFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.RemoteClient, P]
  type ConsoleFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.RemoteConsole, P]
  type Feature[B, P] = js.Function1[
    /* Base */ org.scalablytyped.runtime.Instantiable0[B], 
    org.scalablytyped.runtime.Instantiable0[B with P]
  ]
  type IConnection = typings.vscodeLanguageserver.mod.Connection[
    typings.vscodeLanguageserver.mod._underscore, 
    typings.vscodeLanguageserver.mod._underscore, 
    typings.vscodeLanguageserver.mod._underscore, 
    typings.vscodeLanguageserver.mod._underscore, 
    typings.vscodeLanguageserver.mod._underscore, 
    typings.vscodeLanguageserver.mod._underscore, 
    typings.vscodeLanguageserver.mod._underscore
  ]
  type Languages = typings.vscodeLanguageserver.mod._Languages
  type LanguagesFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.Languages, P]
  type RemoteWindow = typings.vscodeLanguageserver.mod._RemoteWindow with typings.vscodeLanguageserver.progressMod.WindowProgress
  type RemoteWorkspace = typings.vscodeLanguageserver.mod._RemoteWorkspace with typings.vscodeLanguageserver.configurationMod.Configuration with typings.vscodeLanguageserver.workspaceFoldersMod.WorkspaceFolders
  type ServerRequestHandler[P, R, PR, E] = js.Function4[
    /* params */ P, 
    /* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
    /* workDoneProgress */ typings.vscodeLanguageserver.progressMod.WorkDoneProgress, 
    /* resultProgress */ js.UndefOr[typings.vscodeLanguageserver.progressMod.ResultProgress[PR]], 
    typings.vscodeJsonrpc.mod.HandlerResult[R, E]
  ]
  type TelemetryFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.Telemetry, P]
  type TracerFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.Tracer, P]
  type WindowFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.RemoteWindow, P]
  type WorkspaceFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.RemoteWorkspace, P]
}
