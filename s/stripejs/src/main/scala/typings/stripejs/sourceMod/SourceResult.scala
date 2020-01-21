package typings.stripejs.sourceMod

import typings.stripejs.mod.StripeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceResult extends js.Object {
  /**
    * There was an error. This includes client-side validation errors.
    */
  var error: js.UndefOr[StripeError] = js.undefined
  /**
    * The identifier of the source to be retrieved
    */
  var source: Source
}

object SourceResult {
  @scala.inline
  def apply(source: Source, error: StripeError = null): SourceResult = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceResult]
  }
}

