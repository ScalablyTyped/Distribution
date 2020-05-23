package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines save options to control how appointment, recurring appointment, or service activity records are processed.
  *
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-data/save External Link: save(Client API reference)}
  */
trait SaveOptions extends js.Object {
  /**
    * Indicates whether to use the Book or Reschedule messages rather than the Create or Update messages.
    * Applicable to appointment, recurring appointment, or service activity records.
    */
  var UseSchedulingEngine: js.UndefOr[Boolean] = js.undefined
}

object SaveOptions {
  @scala.inline
  def apply(UseSchedulingEngine: js.UndefOr[Boolean] = js.undefined): SaveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(UseSchedulingEngine)) __obj.updateDynamic("UseSchedulingEngine")(UseSchedulingEngine.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveOptions]
  }
}

