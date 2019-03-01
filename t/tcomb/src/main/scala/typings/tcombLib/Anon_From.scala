package typings
package tcombLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: scala.Double
  var to: scala.Double
}

object Anon_From {
  @scala.inline
  def apply(from: scala.Double, to: scala.Double): Anon_From = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_From]
  }
}

