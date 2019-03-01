package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Git extends js.Object {
  var git: scala.Double
  var tfvc: scala.Double
}

object Anon_Git {
  @scala.inline
  def apply(git: scala.Double, tfvc: scala.Double): Anon_Git = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("git")(git)
    __obj.updateDynamic("tfvc")(tfvc)
    __obj.asInstanceOf[Anon_Git]
  }
}

