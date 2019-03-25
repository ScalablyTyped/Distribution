package typings
package vscodeLib.vscodeMod

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
  val retriggerCharacters: js.Array[java.lang.String]
  /**
  		 * List of characters that trigger signature help.
  		 */
  val triggerCharacters: js.Array[java.lang.String]
}

object SignatureHelpProviderMetadata {
  @scala.inline
  def apply(retriggerCharacters: js.Array[java.lang.String], triggerCharacters: js.Array[java.lang.String]): SignatureHelpProviderMetadata = {
    val __obj = js.Dynamic.literal(retriggerCharacters = retriggerCharacters, triggerCharacters = triggerCharacters)
  
    __obj.asInstanceOf[SignatureHelpProviderMetadata]
  }
}

