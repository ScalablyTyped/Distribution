package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var container: scala.Double
  var job: scala.Double
}

object Container {
  @scala.inline
  def apply(container: scala.Double, job: scala.Double): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

