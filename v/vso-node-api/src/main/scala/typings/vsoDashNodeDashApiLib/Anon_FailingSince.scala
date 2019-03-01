package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailingSince extends js.Object {
  var failingSince: scala.Double
  var regular: scala.Double
}

object Anon_FailingSince {
  @scala.inline
  def apply(failingSince: scala.Double, regular: scala.Double): Anon_FailingSince = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failingSince")(failingSince)
    __obj.updateDynamic("regular")(regular)
    __obj.asInstanceOf[Anon_FailingSince]
  }
}

