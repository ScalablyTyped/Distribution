package typings
package vscodeDashLanguageclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vscodeDashLanguageclientMod {
  /* Rewritten from type alias, can be one of: 
    - Executable
    - vscodeDashLanguageclientLib.Anon_Debug
    - vscodeDashLanguageclientLib.Anon_DebugRun
    - NodeModule
    - js.Function0[
  vscodeDashJsonrpcLib.Thenable[
    nodeLib.childUnderscoreProcessMod.ChildProcess | StreamInfo | vscodeDashLanguageclientLib.libClientMod.MessageTransports | ChildProcessInfo
  ]]
  */
  type ServerOptions = _ServerOptions | (js.Function0[
    vscodeDashJsonrpcLib.Thenable[
      nodeLib.childUnderscoreProcessMod.ChildProcess | StreamInfo | vscodeDashLanguageclientLib.libClientMod.MessageTransports | ChildProcessInfo
    ]
  ])
}
