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

