package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountInstances extends js.Object {
  var count: Double
  var instances: Double
  var start: Double
}

object Anon_CountInstances {
  @scala.inline
  def apply(count: Double, instances: Double, start: Double): Anon_CountInstances = {
    val __obj = js.Dynamic.literal(count = count, instances = instances, start = start)
  
    __obj.asInstanceOf[Anon_CountInstances]
  }
}

