package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abusive extends js.Object {
  var abusive: scala.Double
  var general: scala.Double
  var spam: scala.Double
}

object Anon_Abusive {
  @scala.inline
  def apply(abusive: scala.Double, general: scala.Double, spam: scala.Double): Anon_Abusive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abusive")(abusive)
    __obj.updateDynamic("general")(general)
    __obj.updateDynamic("spam")(spam)
    __obj.asInstanceOf[Anon_Abusive]
  }
}

