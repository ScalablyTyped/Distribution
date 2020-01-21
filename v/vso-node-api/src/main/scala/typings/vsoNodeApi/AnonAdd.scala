package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdd extends js.Object {
  var add: Double
  var delete: Double
  var update: Double
}

object AnonAdd {
  @scala.inline
  def apply(add: Double, delete: Double, update: Double): AnonAdd = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdd]
  }
}

