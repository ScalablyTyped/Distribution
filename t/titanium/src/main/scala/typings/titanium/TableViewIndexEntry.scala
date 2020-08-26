package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object that represents an index entry in a `TableView`.
  */
@js.native
trait TableViewIndexEntry extends js.Object {
  /**
    * Row index associated with this item.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Title to display in the index bar for this item.
    */
  var title: js.UndefOr[java.lang.String] = js.native
}

object TableViewIndexEntry {
  @scala.inline
  def apply(): TableViewIndexEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableViewIndexEntry]
  }
  @scala.inline
  implicit class TableViewIndexEntryOps[Self <: TableViewIndexEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setTitle(value: java.lang.String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

