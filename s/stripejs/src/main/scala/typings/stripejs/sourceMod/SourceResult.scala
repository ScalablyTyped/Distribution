package typings.stripejs.sourceMod

import typings.stripejs.mod.StripeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceResult extends js.Object {
  /**
    * There was an error. This includes client-side validation errors.
    */
  var error: js.UndefOr[StripeError] = js.native
  /**
    * The identifier of the source to be retrieved
    */
  var source: Source = js.native
}

object SourceResult {
  @scala.inline
  def apply(source: Source): SourceResult = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceResult]
  }
  @scala.inline
  implicit class SourceResultOps[Self <: SourceResult] (val x: Self) extends AnyVal {
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
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: StripeError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

