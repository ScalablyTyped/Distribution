package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doing extends js.Object {
  var doing: scala.Double
  var done: scala.Double
  var followed: scala.Double
}

object Anon_Doing {
  @scala.inline
  def apply(doing: scala.Double, done: scala.Double, followed: scala.Double): Anon_Doing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("doing")(doing)
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("followed")(followed)
    __obj.asInstanceOf[Anon_Doing]
  }
}

