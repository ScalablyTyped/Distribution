package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildFirst extends js.Object {
  var childFirst: scala.Double
  var parentFirst: scala.Double
}

object ChildFirst {
  @scala.inline
  def apply(childFirst: scala.Double, parentFirst: scala.Double): ChildFirst = {
    val __obj = js.Dynamic.literal(childFirst = childFirst.asInstanceOf[js.Any], parentFirst = parentFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildFirst]
  }
}

