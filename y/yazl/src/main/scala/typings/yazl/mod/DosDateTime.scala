package typings.yazl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DosDateTime extends js.Object {
  var date: Double
  var time: Double
}

object DosDateTime {
  @scala.inline
  def apply(date: Double, time: Double): DosDateTime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DosDateTime]
  }
}

