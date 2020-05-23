package typings.wordpressComponents.autocompleteMod.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * There are currently two supported actions:
  *   - `insert-at-caret` (default): Insert the `value` into the text.
  *   - `replace`: Replace the current block with the block specified in
  *      the `value` property.
  */
/* Rewritten from type alias, can be one of: 
  - typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
  - typings.wordpressComponents.wordpressComponentsStrings.replace
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def `insert-at-caret`: typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret` = "insert-at-caret".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`]
  @scala.inline
  def replace: typings.wordpressComponents.wordpressComponentsStrings.replace = "replace".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.replace]
}

