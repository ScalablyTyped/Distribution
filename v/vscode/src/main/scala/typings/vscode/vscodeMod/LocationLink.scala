package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationLink extends js.Object {
  /**
  		 * Span of the origin of this link.
  		 *
  		 * Used as the underlined span for mouse definition hover. Defaults to the word range at
  		 * the definition position.
  		 */
  var originSelectionRange: js.UndefOr[Range] = js.undefined
  /**
  		 * The full target range of this link.
  		 */
  var targetRange: Range
  /**
  		 * The span of this link.
  		 */
  var targetSelectionRange: js.UndefOr[Range] = js.undefined
  /**
  		 * The target resource identifier of this link.
  		 */
  var targetUri: Uri
}

object LocationLink {
  @scala.inline
  def apply(
    targetRange: Range,
    targetUri: Uri,
    originSelectionRange: Range = null,
    targetSelectionRange: Range = null
  ): LocationLink = {
    val __obj = js.Dynamic.literal(targetRange = targetRange, targetUri = targetUri)
    if (originSelectionRange != null) __obj.updateDynamic("originSelectionRange")(originSelectionRange)
    if (targetSelectionRange != null) __obj.updateDynamic("targetSelectionRange")(targetSelectionRange)
    __obj.asInstanceOf[LocationLink]
  }
}

