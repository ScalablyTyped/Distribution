package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Construction options for a model validation state.
trait ModelValidationStateOptions extends js.Object {
  var excludeFromSummary: scala.Boolean
  var failureMessage: java.lang.String
  def applicable(): scala.Boolean
  def name(): java.lang.String
  def paused(): scala.Boolean
}

object ModelValidationStateOptions {
  @scala.inline
  def apply(
    applicable: () => scala.Boolean,
    excludeFromSummary: scala.Boolean,
    failureMessage: java.lang.String,
    name: () => java.lang.String,
    paused: () => scala.Boolean
  ): ModelValidationStateOptions = {
    val __obj = js.Dynamic.literal(applicable = js.Any.fromFunction0(applicable), excludeFromSummary = excludeFromSummary, failureMessage = failureMessage, name = js.Any.fromFunction0(name), paused = js.Any.fromFunction0(paused))
  
    __obj.asInstanceOf[ModelValidationStateOptions]
  }
}

