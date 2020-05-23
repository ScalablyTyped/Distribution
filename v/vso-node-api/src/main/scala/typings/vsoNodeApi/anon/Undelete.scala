package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Undelete extends js.Object {
  var add: scala.Double
  var delete: scala.Double
  var undelete: scala.Double
  var update: scala.Double
}

object Undelete {
  @scala.inline
  def apply(add: scala.Double, delete: scala.Double, undelete: scala.Double, update: scala.Double): Undelete = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], undelete = undelete.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Undelete]
  }
}

