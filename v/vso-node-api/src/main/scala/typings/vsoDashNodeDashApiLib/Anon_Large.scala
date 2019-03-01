package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Large extends js.Object {
  var large: scala.Double
  var medium: scala.Double
  var small: scala.Double
}

object Anon_Large {
  @scala.inline
  def apply(large: scala.Double, medium: scala.Double, small: scala.Double): Anon_Large = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("large")(large)
    __obj.updateDynamic("medium")(medium)
    __obj.updateDynamic("small")(small)
    __obj.asInstanceOf[Anon_Large]
  }
}

