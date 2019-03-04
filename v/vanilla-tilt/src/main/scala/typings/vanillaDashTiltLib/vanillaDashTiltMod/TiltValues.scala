package typings
package vanillaDashTiltLib.vanillaDashTiltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiltValues extends js.Object {
  /**
    * The current percentage on the X axis
    */
  var percentageX: scala.Double
  /**
    * The current percentage on the Y axis
    */
  var percentageY: scala.Double
  /**
    * The current tilt on the X axis
    */
  var tiltX: scala.Double
  /**
    * The current tilt on the Y axis
    */
  var tiltY: scala.Double
}

object TiltValues {
  @scala.inline
  def apply(percentageX: scala.Double, percentageY: scala.Double, tiltX: scala.Double, tiltY: scala.Double): TiltValues = {
    val __obj = js.Dynamic.literal(percentageX = percentageX, percentageY = percentageY, tiltX = tiltX, tiltY = tiltY)
  
    __obj.asInstanceOf[TiltValues]
  }
}

