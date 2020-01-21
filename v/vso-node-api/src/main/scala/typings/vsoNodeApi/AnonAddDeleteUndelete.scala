package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddDeleteUndelete extends js.Object {
  var add: Double
  var delete: Double
  var undelete: Double
  var update: Double
}

object AnonAddDeleteUndelete {
  @scala.inline
  def apply(add: Double, delete: Double, undelete: Double, update: Double): AnonAddDeleteUndelete = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], undelete = undelete.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddDeleteUndelete]
  }
}

