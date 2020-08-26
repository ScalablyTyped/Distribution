package typings.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeleteConfirmation extends js.Object {
  var deleted: Boolean = js.native
  var id: String = js.native
  var `object`: String = js.native
}

object IDeleteConfirmation {
  @scala.inline
  def apply(deleted: Boolean, id: String, `object`: String): IDeleteConfirmation = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteConfirmation]
  }
  @scala.inline
  implicit class IDeleteConfirmationOps[Self <: IDeleteConfirmation] (val x: Self) extends AnyVal {
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
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
  }
  
}

