package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotSelectionRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRangeServerCapabilities extends js.Object {
  /**
    * The server provides selection range support.
    */
  var selectionRangeProvider: js.UndefOr[
    scala.Boolean | SelectionRangeProviderOptions | (SelectionRangeProviderOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentRegistrationOptions with vscodeDashLanguageserverDashProtocolLib.libProtocolMod.StaticRegistrationOptions)
  ] = js.undefined
}

