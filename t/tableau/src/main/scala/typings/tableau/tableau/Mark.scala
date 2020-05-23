package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Marks Selection
/**
  * A mark represents a single data point on the visualization.
  * It is independent of the type of visualization (bar, line, pie, etc.).
  */
trait Mark extends js.Object {
  /** Gets a collection of field name/value pairs associated with the mark. */
  def getPairs(): js.Array[Pair]
}

object Mark {
  @scala.inline
  def apply(getPairs: () => js.Array[Pair]): Mark = {
    val __obj = js.Dynamic.literal(getPairs = js.Any.fromFunction0(getPairs))
    __obj.asInstanceOf[Mark]
  }
}

