package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Altitude extends js.Object {
  var altitude: scala.Boolean
  var `type`: java.lang.String
}

object Anon_Altitude {
  @scala.inline
  def apply(altitude: scala.Boolean, `type`: java.lang.String): Anon_Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Altitude]
  }
}

