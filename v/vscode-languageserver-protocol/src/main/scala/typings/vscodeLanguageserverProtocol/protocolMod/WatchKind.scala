package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "WatchKind")
@js.native
object WatchKind extends js.Object {
  /**
    * Interested in change events
    */
  val Change: `2` = js.native
  /**
    * Interested in create events.
    */
  val Create: `1` = js.native
  /**
    * Interested in delete events
    */
  val Delete: `4` = js.native
}

