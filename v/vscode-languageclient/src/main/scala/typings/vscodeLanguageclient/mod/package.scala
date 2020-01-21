package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeLanguageclient.mod.Executable
    - typings.vscodeLanguageclient.AnonDebug
    - typings.vscodeLanguageclient.AnonDebugRun
    - typings.vscodeLanguageclient.mod.NodeModule
    - js.Function0[
  typings.vscodeJsonrpc.Thenable[
    typings.node.childProcessMod.ChildProcess | typings.vscodeLanguageclient.mod.StreamInfo | typings.vscodeLanguageclient.clientMod.MessageTransports | typings.vscodeLanguageclient.mod.ChildProcessInfo
  ]]
  */
  type ServerOptions = typings.vscodeLanguageclient.mod._ServerOptions | (js.Function0[
    typings.vscodeJsonrpc.Thenable[
      typings.node.childProcessMod.ChildProcess | typings.vscodeLanguageclient.mod.StreamInfo | typings.vscodeLanguageclient.clientMod.MessageTransports | typings.vscodeLanguageclient.mod.ChildProcessInfo
    ]
  ])
}
