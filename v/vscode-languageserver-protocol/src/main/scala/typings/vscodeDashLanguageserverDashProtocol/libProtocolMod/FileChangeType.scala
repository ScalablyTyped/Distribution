package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`1`
import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`2`
import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`1`
  - typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`2`
  - typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolNumbers.`3`
*/
trait FileChangeType extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol", "FileChangeType")
@js.native
object FileChangeType extends js.Object {
  /**
    * The file got changed.
    */
  val Changed: `2` = js.native
  /**
    * The file got created.
    */
  val Created: `1` = js.native
  /**
    * The file got deleted.
    */
  val Deleted: `3` = js.native
}

