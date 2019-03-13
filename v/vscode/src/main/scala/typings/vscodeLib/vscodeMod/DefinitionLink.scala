package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionLink extends js.Object {
  /**
  		 * Span of the symbol being defined in the source file.
  		 *
  		 * Used as the underlined span for mouse definition hover. Defaults to the word range at
  		 * the definition position.
  		 */
  var originSelectionRange: js.UndefOr[Range] = js.undefined
  /**
  		 * The full range of the definition.
  		 *
  		 * For a class definition for example, this would be the entire body of the class definition.
  		 */
  var targetRange: Range
  /**
  		 * The span of the symbol definition.
  		 *
  		 * For a class definition, this would be the class name itself in the class definition.
  		 */
  var targetSelectionRange: js.UndefOr[Range] = js.undefined
  /**
  		 * The resource identifier of the definition.
  		 */
  var targetUri: Uri
}

object DefinitionLink {
  @scala.inline
  def apply(
    targetRange: Range,
    targetUri: Uri,
    originSelectionRange: Range = null,
    targetSelectionRange: Range = null
  ): DefinitionLink = {
    val __obj = js.Dynamic.literal(targetRange = targetRange, targetUri = targetUri)
    if (originSelectionRange != null) __obj.updateDynamic("originSelectionRange")(originSelectionRange)
    if (targetSelectionRange != null) __obj.updateDynamic("targetSelectionRange")(targetSelectionRange)
    __obj.asInstanceOf[DefinitionLink]
  }
}

