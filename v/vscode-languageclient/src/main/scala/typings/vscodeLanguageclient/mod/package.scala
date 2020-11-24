package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeLanguageclient.mod.Executable
    - typings.vscodeLanguageclient.anon.Debug
    - typings.vscodeLanguageclient.anon.Run
    - typings.vscodeLanguageclient.mod.NodeModule
    - js.Function0[
  js.Promise[
    typings.node.childProcessMod.ChildProcess | typings.vscodeLanguageclient.mod.StreamInfo | typings.vscodeLanguageclient.clientMod.MessageTransports | typings.vscodeLanguageclient.mod.ChildProcessInfo
  ]]
  */
  type ServerOptions = typings.vscodeLanguageclient.mod._ServerOptions | (js.Function0[
    js.Promise[
      typings.node.childProcessMod.ChildProcess | typings.vscodeLanguageclient.mod.StreamInfo | typings.vscodeLanguageclient.clientMod.MessageTransports | typings.vscodeLanguageclient.mod.ChildProcessInfo
    ]
  ])
}
