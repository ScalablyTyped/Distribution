package typings.triplesec.triplesecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var i: Double
  var total: Double
  var what: String
}

object Progress {
  @scala.inline
  def apply(i: Double, total: Double, what: String): Progress = {
    val __obj = js.Dynamic.literal(i = i, total = total, what = what)
  
    __obj.asInstanceOf[Progress]
  }
}

