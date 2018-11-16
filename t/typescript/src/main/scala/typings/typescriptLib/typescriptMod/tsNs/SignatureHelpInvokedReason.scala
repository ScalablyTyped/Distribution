package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Signals that the user manually requested signature help.
     * The language service will unconditionally attempt to provide a result.
     */

trait SignatureHelpInvokedReason extends js.Object {
  var kind: typescriptLib.typescriptLibStrings.invoked
  var triggerCharacter: js.UndefOr[scala.Nothing] = js.undefined
}

