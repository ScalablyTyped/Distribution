package typings.stripe.mod.transferReversals

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReversalUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * An arbitrary string which you can attach to a reversal object. It is displayed when in the web interface alongside the
    * reversal. This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.native
}

object IReversalUpdateOptions {
  @scala.inline
  def apply(): IReversalUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReversalUpdateOptions]
  }
  @scala.inline
  implicit class IReversalUpdateOptionsOps[Self <: IReversalUpdateOptions] (val x: Self) extends AnyVal {
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

