package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesNumbers.`1`
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesNumbers.`2`
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesNumbers.`1`
  - typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesNumbers.`2`
  - typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesNumbers.`3`
*/
trait TextDocumentSaveReason extends js.Object

@JSImport("vscode-languageserver-types", "TextDocumentSaveReason")
@js.native
object TextDocumentSaveReason extends js.Object {
  /**
    * Automatic after a delay.
    */
  val AfterDelay: `2` = js.native
  /**
    * When the editor lost focus.
    */
  val FocusOut: `3` = js.native
  /**
    * Manually triggered, e.g. by the user pressing save, by starting debugging,
    * or by an API call.
    */
  val Manual: `1` = js.native
}

