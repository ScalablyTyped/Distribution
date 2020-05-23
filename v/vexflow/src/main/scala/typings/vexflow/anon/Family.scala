package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Family extends js.Object {
  var family: String
  var size: Double
  var weight: String
}

object Family {
  @scala.inline
  def apply(family: String, size: Double, weight: String): Family = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Family]
  }
}

