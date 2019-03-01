package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flat extends js.Object {
  var flat: scala.Double
  var oneHop: scala.Double
  var tree: scala.Double
}

object Anon_Flat {
  @scala.inline
  def apply(flat: scala.Double, oneHop: scala.Double, tree: scala.Double): Anon_Flat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flat")(flat)
    __obj.updateDynamic("oneHop")(oneHop)
    __obj.updateDynamic("tree")(tree)
    __obj.asInstanceOf[Anon_Flat]
  }
}

