package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines save options to control how appointment, recurring appointment, or service activity records are processed.
  *
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-data/save External Link: save(Client API reference)}
  */
@js.native
trait SaveOptions extends js.Object {
  /**
    * Indicates whether to use the Book or Reschedule messages rather than the Create or Update messages.
    * Applicable to appointment, recurring appointment, or service activity records.
    */
  var UseSchedulingEngine: js.UndefOr[Boolean] = js.native
}

object SaveOptions {
  @scala.inline
  def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
  @scala.inline
  implicit class SaveOptionsOps[Self <: SaveOptions] (val x: Self) extends AnyVal {
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
    def setUseSchedulingEngine(value: Boolean): Self = this.set("UseSchedulingEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSchedulingEngine: Self = this.set("UseSchedulingEngine", js.undefined)
  }
  
}

