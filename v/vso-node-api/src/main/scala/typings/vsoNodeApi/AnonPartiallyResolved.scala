package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPartiallyResolved extends js.Object {
  var partiallyResolved: Double
  var resolved: Double
  var unresolved: Double
}

object AnonPartiallyResolved {
  @scala.inline
  def apply(partiallyResolved: Double, resolved: Double, unresolved: Double): AnonPartiallyResolved = {
    val __obj = js.Dynamic.literal(partiallyResolved = partiallyResolved.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], unresolved = unresolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPartiallyResolved]
  }
}

