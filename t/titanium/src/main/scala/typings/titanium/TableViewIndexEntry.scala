package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object that represents an index entry in a `TableView`.
  */
trait TableViewIndexEntry extends js.Object {
  /**
    * Row index associated with this item.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Title to display in the index bar for this item.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object TableViewIndexEntry {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, title: java.lang.String = null): TableViewIndexEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewIndexEntry]
  }
}

