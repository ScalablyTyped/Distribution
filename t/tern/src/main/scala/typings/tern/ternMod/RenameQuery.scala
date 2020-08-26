package typings.tern.ternMod

import typings.tern.ternStrings.rename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameQuery
  extends BaseQueryWithFile
     with Query {
  /** Specify the location of the variable. */
  var end: Double | Position = js.native
  /** The new name of the variable */
  var newName: String = js.native
  /** Specify the location of the variable. */
  var start: js.UndefOr[Double | Position] = js.native
  /** Rename a variable in a scope-aware way. */
  @JSName("type")
  var type_RenameQuery: rename = js.native
}

object RenameQuery {
  @scala.inline
  def apply(end: Double | Position, file: String, newName: String, `type`: rename): RenameQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameQuery]
  }
  @scala.inline
  implicit class RenameQueryOps[Self <: RenameQuery] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double | Position): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewName(value: String): Self = this.set("newName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: rename): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double | Position): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

