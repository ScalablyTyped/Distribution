package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "InitializeError")
@js.native
object InitializeErrorNs extends js.Object {
  /**
       * If the protocol version provided by the client can't be handled by the server.
       * @deprecated This initialize error got replaced by client capabilities. There is
       * no version handshake in version 3.0x
       */
  val unknownProtocolVersion: scala.Double = js.native
}

