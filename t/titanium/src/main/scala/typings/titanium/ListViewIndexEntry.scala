package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object that represents an index entry in a `ListView`.
  */
trait ListViewIndexEntry extends js.Object {
  /**
  	 * Section index associated with this title.
  	 */
  var index: js.UndefOr[Double] = js.undefined
  /**
  	 * Title to display in the index bar.
  	 */
  var title: js.UndefOr[String] = js.undefined
}

object ListViewIndexEntry {
  @scala.inline
  def apply(index: Int | Double = null, title: String = null): ListViewIndexEntry = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ListViewIndexEntry]
  }
}

