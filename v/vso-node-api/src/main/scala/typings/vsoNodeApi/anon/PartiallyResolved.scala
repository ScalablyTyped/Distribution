package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartiallyResolved extends js.Object {
  var partiallyResolved: scala.Double
  var resolved: scala.Double
  var unresolved: scala.Double
}

object PartiallyResolved {
  @scala.inline
  def apply(partiallyResolved: scala.Double, resolved: scala.Double, unresolved: scala.Double): PartiallyResolved = {
    val __obj = js.Dynamic.literal(partiallyResolved = partiallyResolved.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], unresolved = unresolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartiallyResolved]
  }
}

