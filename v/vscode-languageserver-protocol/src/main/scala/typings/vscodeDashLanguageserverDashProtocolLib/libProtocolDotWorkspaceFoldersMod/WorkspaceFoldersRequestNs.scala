package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "WorkspaceFoldersRequest")
@js.native
object WorkspaceFoldersRequestNs extends js.Object {
  val `type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestType0[
    (js.Array[
      vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.WorkspaceFolder
    ]) | scala.Null, 
    scala.Unit, 
    scala.Unit
  ] = js.native
  type HandlerSignature = vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler0[
    (js.Array[
      vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.WorkspaceFolder
    ]) | scala.Null, 
    scala.Unit
  ]
  type MiddlewareSignature = js.Function2[
    /* token */ vscodeDashJsonrpcLib.libCancellationMod.CancellationToken, 
    /* next */ HandlerSignature, 
    vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.HandlerResult[
      (js.Array[
        vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.WorkspaceFolder
      ]) | scala.Null, 
      scala.Unit
    ]
  ]
}

