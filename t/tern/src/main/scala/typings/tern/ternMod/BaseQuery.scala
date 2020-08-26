package typings.tern.ternMod

import typings.tern.ternStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseQuery extends js.Object {
  var docFormat: js.UndefOr[full] = js.native
  var lineCharPositions: js.UndefOr[Boolean] = js.native
  var `type`: String = js.native
}

object BaseQuery {
  @scala.inline
  def apply(`type`: String): BaseQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQuery]
  }
  @scala.inline
  implicit class BaseQueryOps[Self <: BaseQuery] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocFormat(value: full): Self = this.set("docFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocFormat: Self = this.set("docFormat", js.undefined)
    @scala.inline
    def setLineCharPositions(value: Boolean): Self = this.set("lineCharPositions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCharPositions: Self = this.set("lineCharPositions", js.undefined)
  }
  
}

