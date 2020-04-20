package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemove extends js.Object {
  var create: Double
  var remove: Double
}

object AnonRemove {
  @scala.inline
  def apply(create: Double, remove: Double): AnonRemove = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemove]
  }
}

