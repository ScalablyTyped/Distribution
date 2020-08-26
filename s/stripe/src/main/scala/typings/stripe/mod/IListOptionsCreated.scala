package typings.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListOptionsCreated extends IListOptions {
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can
    * be a dictionary.
    */
  var created: js.UndefOr[String | IDateFilter] = js.native
}

object IListOptionsCreated {
  @scala.inline
  def apply(): IListOptionsCreated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListOptionsCreated]
  }
  @scala.inline
  implicit class IListOptionsCreatedOps[Self <: IListOptionsCreated] (val x: Self) extends AnyVal {
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
    def setCreated(value: String | IDateFilter): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
  }
  
}

