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
    applicable: js.Function0[scala.Boolean],
    excludeFromSummary: scala.Boolean,
    failureMessage: java.lang.String,
    name: js.Function0[java.lang.String],
    paused: js.Function0[scala.Boolean]
  ): ModelValidationStateOptions = {
    val __obj = js.Dynamic.literal(applicable = applicable, excludeFromSummary = excludeFromSummary, failureMessage = failureMessage, name = name, paused = paused)
  
    __obj.asInstanceOf[ModelValidationStateOptions]
  }
}

