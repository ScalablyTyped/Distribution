package typings.vegaDashLite.buildSrcRepeatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repeat extends js.Object {
  /**
    * Horizontal repeated views.
    */
  var column: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Vertical repeated views.
    */
  var row: js.UndefOr[js.Array[String]] = js.undefined
}

object Repeat {
  @scala.inline
  def apply(column: js.Array[String] = null, row: js.Array[String] = null): Repeat = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[Repeat]
  }
}

