package typings
package triplesecLib.triplesecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var i: scala.Double
  var total: scala.Double
  var what: java.lang.String
}

object Progress {
  @scala.inline
  def apply(i: scala.Double, total: scala.Double, what: java.lang.String): Progress = {
    val __obj = js.Dynamic.literal(i = i, total = total, what = what)
  
    __obj.asInstanceOf[Progress]
  }
}

