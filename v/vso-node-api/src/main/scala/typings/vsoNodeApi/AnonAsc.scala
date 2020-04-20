package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsc extends js.Object {
  var asc: Double
  var desc: Double
}

object AnonAsc {
  @scala.inline
  def apply(asc: Double, desc: Double): AnonAsc = {
    val __obj = js.Dynamic.literal(asc = asc.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsc]
  }
}

