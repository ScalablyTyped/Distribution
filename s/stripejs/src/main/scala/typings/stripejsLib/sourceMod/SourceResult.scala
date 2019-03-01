package typings
package stripejsLib.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceResult extends js.Object {
  /**
    * There was an error. This includes client-side validation errors.
    */
  var error: js.UndefOr[stripejsLib.stripejsMod.StripeError] = js.undefined
  /**
    * The identifier of the source to be retrieved
    */
  var source: Source
}

object SourceResult {
  @scala.inline
  def apply(source: Source, error: stripejsLib.stripejsMod.StripeError = null): SourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[SourceResult]
  }
}

