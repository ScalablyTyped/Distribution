package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelled extends js.Object {
  var cancelled: scala.Double
  var error: scala.Double
  var published: scala.Double
  var unpublished: scala.Double
}

object Cancelled {
  @scala.inline
  def apply(cancelled: scala.Double, error: scala.Double, published: scala.Double, unpublished: scala.Double): Cancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], unpublished = unpublished.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelled]
  }
}

