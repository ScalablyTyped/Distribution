package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpOptions extends WorkDoneProgressOptions {
  /**
    * List of characters that re-trigger signature help.
    *
    * These trigger characters are only active when signature help is already showing. All trigger characters
    * are also counted as re-trigger characters.
    *
    * @since 3.15.0
    */
  var retriggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of characters that trigger signature help.
    */
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
}

object SignatureHelpOptions {
  @scala.inline
  def apply(
    retriggerCharacters: js.Array[String] = null,
    triggerCharacters: js.Array[String] = null,
    workDoneProgress: js.UndefOr[Boolean] = js.undefined
  ): SignatureHelpOptions = {
    val __obj = js.Dynamic.literal()
    if (retriggerCharacters != null) __obj.updateDynamic("retriggerCharacters")(retriggerCharacters.asInstanceOf[js.Any])
    if (triggerCharacters != null) __obj.updateDynamic("triggerCharacters")(triggerCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpOptions]
  }
}

