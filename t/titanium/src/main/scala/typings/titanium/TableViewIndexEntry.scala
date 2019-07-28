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
  var title: js.UndefOr[String] = js.undefined
}

object TableViewIndexEntry {
  @scala.inline
  def apply(index: Int | Double = null, title: String = null): TableViewIndexEntry = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TableViewIndexEntry]
  }
}

