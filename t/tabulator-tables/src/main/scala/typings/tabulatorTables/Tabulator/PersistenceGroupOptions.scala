package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistenceGroupOptions extends js.Object {
  var groupBy: js.UndefOr[Boolean] = js.native
  var groupHeader: js.UndefOr[Boolean] = js.native
  var groupStartOpen: js.UndefOr[Boolean] = js.native
}

object PersistenceGroupOptions {
  @scala.inline
  def apply(): PersistenceGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceGroupOptions]
  }
  @scala.inline
  implicit class PersistenceGroupOptionsOps[Self <: PersistenceGroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupBy(value: Boolean): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    @scala.inline
    def setGroupHeader(value: Boolean): Self = this.set("groupHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupHeader: Self = this.set("groupHeader", js.undefined)
    @scala.inline
    def setGroupStartOpen(value: Boolean): Self = this.set("groupStartOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupStartOpen: Self = this.set("groupStartOpen", js.undefined)
  }
  
}

