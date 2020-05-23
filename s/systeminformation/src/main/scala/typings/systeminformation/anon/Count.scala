package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Double
  var revision: Double
}

object Count {
  @scala.inline
  def apply(count: Double, revision: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

