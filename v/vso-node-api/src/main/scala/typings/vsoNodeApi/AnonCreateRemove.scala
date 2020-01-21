package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreateRemove extends js.Object {
  var create: Double
  var remove: Double
}

object AnonCreateRemove {
  @scala.inline
  def apply(create: Double, remove: Double): AnonCreateRemove = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCreateRemove]
  }
}

