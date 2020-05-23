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
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ListViewIndexEntry {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, title: java.lang.String = null): ListViewIndexEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewIndexEntry]
  }
}

