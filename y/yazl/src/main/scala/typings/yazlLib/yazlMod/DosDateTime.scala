package typings
package yazlLib.yazlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DosDateTime extends js.Object {
  var date: scala.Double
  var time: scala.Double
}

object DosDateTime {
  @scala.inline
  def apply(date: scala.Double, time: scala.Double): DosDateTime = {
    val __obj = js.Dynamic.literal(date = date, time = time)
  
    __obj.asInstanceOf[DosDateTime]
  }
}

