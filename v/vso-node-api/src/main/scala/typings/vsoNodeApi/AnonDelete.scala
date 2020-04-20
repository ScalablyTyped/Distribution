package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelete extends js.Object {
  var create: Double
  var delete: Double
  var update: Double
}

object AnonDelete {
  @scala.inline
  def apply(create: Double, delete: Double, update: Double): AnonDelete = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelete]
  }
}

