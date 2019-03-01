package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Equals extends js.Object {
  @JSName("equals")
  var equals_FAnon_Equals: scala.Double
  var notEquals: scala.Double
}

object Anon_Equals {
  @scala.inline
  def apply(equals: scala.Double, notEquals: scala.Double): Anon_Equals = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("notEquals")(notEquals)
    __obj.asInstanceOf[Anon_Equals]
  }
}

