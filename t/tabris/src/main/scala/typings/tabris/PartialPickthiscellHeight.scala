package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<this, 'cellHeight' | 'cellType' | 'createCell'>> */
trait PartialPickthiscellHeight extends js.Object {
  var cellHeight: js.UndefOr[js.Any] = js.undefined
  var cellType: js.UndefOr[js.Any] = js.undefined
  var createCell: js.UndefOr[js.Any] = js.undefined
}

object PartialPickthiscellHeight {
  @scala.inline
  def apply(cellHeight: js.Any = null, cellType: js.Any = null, createCell: js.Any = null): PartialPickthiscellHeight = {
    val __obj = js.Dynamic.literal()
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cellType != null) __obj.updateDynamic("cellType")(cellType.asInstanceOf[js.Any])
    if (createCell != null) __obj.updateDynamic("createCell")(createCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickthiscellHeight]
  }
}

