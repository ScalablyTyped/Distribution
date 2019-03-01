package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildFirst extends js.Object {
  var childFirst: scala.Double
  var parentFirst: scala.Double
}

object Anon_ChildFirst {
  @scala.inline
  def apply(childFirst: scala.Double, parentFirst: scala.Double): Anon_ChildFirst = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childFirst")(childFirst)
    __obj.updateDynamic("parentFirst")(parentFirst)
    __obj.asInstanceOf[Anon_ChildFirst]
  }
}

