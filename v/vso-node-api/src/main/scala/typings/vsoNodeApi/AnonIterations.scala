package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIterations extends js.Object {
  var iterations: Double
  var none: Double
  var workItems: Double
}

object AnonIterations {
  @scala.inline
  def apply(iterations: Double, none: Double, workItems: Double): AnonIterations = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIterations]
  }
}

