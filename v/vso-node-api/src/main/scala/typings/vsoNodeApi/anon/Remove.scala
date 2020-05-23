package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remove extends js.Object {
  var create: scala.Double
  var remove: scala.Double
}

object Remove {
  @scala.inline
  def apply(create: scala.Double, remove: scala.Double): Remove = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remove]
  }
}

