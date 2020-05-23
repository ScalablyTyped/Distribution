package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instances extends js.Object {
  var count: Double
  var instances: Double
  var start: Double
}

object Instances {
  @scala.inline
  def apply(count: Double, instances: Double, start: Double): Instances = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instances]
  }
}

