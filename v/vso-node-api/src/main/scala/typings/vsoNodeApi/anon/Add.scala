package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Add extends js.Object {
  var add: scala.Double
  var delete: scala.Double
  var update: scala.Double
}

object Add {
  @scala.inline
  def apply(add: scala.Double, delete: scala.Double, update: scala.Double): Add = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
}

