package typings.stripe.mod.topups

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITopupUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.native
}

object ITopupUpdateOptions {
  @scala.inline
  def apply(): ITopupUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITopupUpdateOptions]
  }
  @scala.inline
  implicit class ITopupUpdateOptionsOps[Self <: ITopupUpdateOptions] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

