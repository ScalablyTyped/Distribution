package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Friday extends js.Object {
  var friday: scala.Double
  var monday: scala.Double
  var saturday: scala.Double
  var sunday: scala.Double
  var thursday: scala.Double
  var tuesday: scala.Double
  var wednesday: scala.Double
}

object Anon_Friday {
  @scala.inline
  def apply(
    friday: scala.Double,
    monday: scala.Double,
    saturday: scala.Double,
    sunday: scala.Double,
    thursday: scala.Double,
    tuesday: scala.Double,
    wednesday: scala.Double
  ): Anon_Friday = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("friday")(friday)
    __obj.updateDynamic("monday")(monday)
    __obj.updateDynamic("saturday")(saturday)
    __obj.updateDynamic("sunday")(sunday)
    __obj.updateDynamic("thursday")(thursday)
    __obj.updateDynamic("tuesday")(tuesday)
    __obj.updateDynamic("wednesday")(wednesday)
    __obj.asInstanceOf[Anon_Friday]
  }
}

