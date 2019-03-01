package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: scala.Double
  var position: scala.Double
}

object Anon_Duration {
  @scala.inline
  def apply(duration: scala.Double, position: scala.Double): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_Duration]
  }
}

