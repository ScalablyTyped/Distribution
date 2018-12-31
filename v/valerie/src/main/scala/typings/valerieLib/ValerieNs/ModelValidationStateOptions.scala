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

