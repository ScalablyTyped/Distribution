package typings
package vscodeDashLanguageserverLib.libWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFolders extends js.Object {
  @JSName("onDidChangeWorkspaceFolders")
  var onDidChangeWorkspaceFolders_Original: vscodeDashJsonrpcLib.libEventsMod.Event[
    vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersChangeEvent
  ] = js.native
  def getWorkspaceFolders(): vscodeDashLanguageserverLib.Thenable[
    (js.Array[
      vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.WorkspaceFolder
    ]) | scala.Null
  ] = js.native
  def onDidChangeWorkspaceFolders(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersChangeEvent, 
      _
    ]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onDidChangeWorkspaceFolders(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersChangeEvent, 
      _
    ],
    thisArgs: js.Any
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onDidChangeWorkspaceFolders(
    listener: js.Function1[
      /* e */ vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersChangeEvent, 
      _
    ],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
}

