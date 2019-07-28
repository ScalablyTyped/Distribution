package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Selection")
@js.native
class Selection protected () extends Range {
  /**
  		 * Create a selection from two positions.
  		 *
  		 * @param anchor A position.
  		 * @param active A position.
  		 */
  def this(anchor: Position, active: Position) = this()
  /**
  		 * Create a selection from four coordinates.
  		 *
  		 * @param anchorLine A zero-based line value.
  		 * @param anchorCharacter A zero-based character value.
  		 * @param activeLine A zero-based line value.
  		 * @param activeCharacter A zero-based character value.
  		 */
  def this(anchorLine: Double, anchorCharacter: Double, activeLine: Double, activeCharacter: Double) = this()
  /**
  		 * The position of the cursor.
  		 * This position might be before or after [anchor](#Selection.anchor).
  		 */
  var active: Position = js.native
  /**
  		 * The position at which the selection starts.
  		 * This position might be before or after [active](#Selection.active).
  		 */
  var anchor: Position = js.native
  /**
  		 * A selection is reversed if [active](#Selection.active).isBefore([anchor](#Selection.anchor)).
  		 */
  var isReversed: Boolean = js.native
}

