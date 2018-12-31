package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Marks Selection
/**
  * A mark represents a single data point on the visualization.
  * It is independent of the type of visualization (bar, line, pie, etc.).
  */
@JSGlobal("tableau.Mark")
@js.native
class Mark protected () extends js.Object {
  /** Creates a new Mark with the specified pairs. */
  def this(pairs: js.Array[Pair]) = this()
  /** Gets a collection of field name/value pairs associated with the mark. */
  def getPairs(): js.Array[Pair] = js.native
}

