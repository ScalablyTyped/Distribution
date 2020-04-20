package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var container: Double
  var job: Double
}

object AnonContainer {
  @scala.inline
  def apply(container: Double, job: Double): AnonContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainer]
  }
}

