package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildFirst extends js.Object {
  var childFirst: Double
  var parentFirst: Double
}

object AnonChildFirst {
  @scala.inline
  def apply(childFirst: Double, parentFirst: Double): AnonChildFirst = {
    val __obj = js.Dynamic.literal(childFirst = childFirst.asInstanceOf[js.Any], parentFirst = parentFirst.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildFirst]
  }
}

