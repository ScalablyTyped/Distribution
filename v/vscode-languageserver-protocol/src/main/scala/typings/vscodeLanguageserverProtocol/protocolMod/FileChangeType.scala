package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
*/
trait FileChangeType extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol", "FileChangeType")
@js.native
object FileChangeType extends js.Object {
  /**
    * The file got changed.
    */
  val Changed: /* 2 */ Double = js.native
  /**
    * The file got created.
    */
  val Created: /* 1 */ Double = js.native
  /**
    * The file got deleted.
    */
  val Deleted: /* 3 */ Double = js.native
}

