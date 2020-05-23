package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpProviderMetadata extends js.Object {
  /**
    * List of characters that re-trigger signature help.
    *
    * These trigger characters are only active when signature help is already showing. All trigger characters
    * are also counted as re-trigger characters.
    */
  val retriggerCharacters: js.Array[String]
  /**
    * List of characters that trigger signature help.
    */
  val triggerCharacters: js.Array[String]
}

object SignatureHelpProviderMetadata {
  @scala.inline
  def apply(retriggerCharacters: js.Array[String], triggerCharacters: js.Array[String]): SignatureHelpProviderMetadata = {
    val __obj = js.Dynamic.literal(retriggerCharacters = retriggerCharacters.asInstanceOf[js.Any], triggerCharacters = triggerCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpProviderMetadata]
  }
}

