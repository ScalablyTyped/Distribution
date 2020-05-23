package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends js.Object {
  var create: scala.Double
  var delete: scala.Double
  var update: scala.Double
}

object Delete {
  @scala.inline
  def apply(create: scala.Double, delete: scala.Double, update: scala.Double): Delete = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
}

