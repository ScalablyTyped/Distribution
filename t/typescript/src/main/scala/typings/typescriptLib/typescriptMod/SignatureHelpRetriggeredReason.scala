package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Signals that this signature help request came from typing a character or moving the cursor.
  * This should only occur if a signature help session was already active and the editor needs to see if it should adjust.
  * The language service will unconditionally attempt to provide a result.
  * `triggerCharacter` can be `undefined` for a retrigger caused by a cursor move.
  */
trait SignatureHelpRetriggeredReason extends SignatureHelpTriggerReason {
  var kind: typescriptLib.typescriptLibStrings.retrigger
  /**
    * Character that was responsible for triggering signature help.
    */
  var triggerCharacter: js.UndefOr[SignatureHelpRetriggerCharacter] = js.undefined
}

object SignatureHelpRetriggeredReason {
  @scala.inline
  def apply(
    kind: typescriptLib.typescriptLibStrings.retrigger,
    triggerCharacter: SignatureHelpRetriggerCharacter = null
  ): SignatureHelpRetriggeredReason = {
    val __obj = js.Dynamic.literal(kind = kind)
    if (triggerCharacter != null) __obj.updateDynamic("triggerCharacter")(triggerCharacter)
    __obj.asInstanceOf[SignatureHelpRetriggeredReason]
  }
}

