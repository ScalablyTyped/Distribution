package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a Uri launch. */
trait LaunchUriResult extends js.Object {
  /** Gets the result of the Uri launch. */
  var result: ValueSet
  /** Gets the status of the Uri launch. */
  var status: LaunchUriStatus
}

object LaunchUriResult {
  @scala.inline
  def apply(result: ValueSet, status: LaunchUriStatus): LaunchUriResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchUriResult]
  }
}

