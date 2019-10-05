package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`1`
import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`2`
import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`3`
import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`1`
  - typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`2`
  - typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`3`
  - typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`4`
*/
trait MessageType extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol", "MessageType")
@js.native
object MessageType extends js.Object {
  /**
    * An error message.
    */
  val Error: `1` = js.native
  /**
    * An information message.
    */
  val Info: `3` = js.native
  /**
    * A log message.
    */
  val Log: `4` = js.native
  /**
    * A warning message.
    */
  val Warning: `2` = js.native
}

