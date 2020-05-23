package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterations extends js.Object {
  var iterations: scala.Double
  var none: scala.Double
  var workItems: scala.Double
}

object Iterations {
  @scala.inline
  def apply(iterations: scala.Double, none: scala.Double, workItems: scala.Double): Iterations = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterations]
  }
}

