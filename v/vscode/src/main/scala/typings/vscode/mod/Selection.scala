package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "Selection")
@js.native
open class Selection protected () extends Range {
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
  		 * This position might be before or after {@link Selection.anchor anchor}.
  		 */
  var active: Position = js.native
  
  /**
  		 * The position at which the selection starts.
  		 * This position might be before or after {@link Selection.active active}.
  		 */
  var anchor: Position = js.native
  
  /**
  		 * A selection is reversed if its {@link Selection.anchor anchor} is the {@link Selection.end end} position.
  		 */
  var isReversed: Boolean = js.native
}
