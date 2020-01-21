package typings.valerie.Valerie_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Construction options for a model validation state.
trait ModelValidationStateOptions extends js.Object {
  var excludeFromSummary: Boolean
  var failureMessage: String
  def applicable(): Boolean
  def name(): String
  def paused(): Boolean
}

object ModelValidationStateOptions {
  @scala.inline
  def apply(
    applicable: () => Boolean,
    excludeFromSummary: Boolean,
    failureMessage: String,
    name: () => String,
    paused: () => Boolean
  ): ModelValidationStateOptions = {
    val __obj = js.Dynamic.literal(applicable = js.Any.fromFunction0(applicable), excludeFromSummary = excludeFromSummary.asInstanceOf[js.Any], failureMessage = failureMessage.asInstanceOf[js.Any], name = js.Any.fromFunction0(name), paused = js.Any.fromFunction0(paused))
  
    __obj.asInstanceOf[ModelValidationStateOptions]
  }
}

