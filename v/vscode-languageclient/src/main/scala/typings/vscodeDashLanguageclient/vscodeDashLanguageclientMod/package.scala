package typings.vscodeDashLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vscodeDashLanguageclientMod {
  import typings.node.childUnderscoreProcessMod.ChildProcess
  import typings.vscodeDashJsonrpc.Thenable

  /* Rewritten from type alias, can be one of: 
    - typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod.Executable
    - typings.vscodeDashLanguageclient.Anon_Debug
    - typings.vscodeDashLanguageclient.Anon_DebugRun
    - typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod.NodeModule
    - js.Function0[
  typings.vscodeDashJsonrpc.Thenable[
    typings.node.childUnderscoreProcessMod.ChildProcess | typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod.StreamInfo | typings.vscodeDashLanguageclient.libClientMod.MessageTransports | typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod.ChildProcessInfo
  ]]
  */
  type ServerOptions = _ServerOptions | (js.Function0[
    Thenable[
      ChildProcess | StreamInfo | typings.vscodeDashLanguageclient.libClientMod.MessageTransports | ChildProcessInfo
    ]
  ])
}
