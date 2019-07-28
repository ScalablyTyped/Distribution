package typings.vanillaDashTilt.vanillaDashTiltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiltValues extends js.Object {
  /**
    * The current percentage on the X axis
    */
  var percentageX: Double
  /**
    * The current percentage on the Y axis
    */
  var percentageY: Double
  /**
    * The current tilt on the X axis
    */
  var tiltX: Double
  /**
    * The current tilt on the Y axis
    */
  var tiltY: Double
}

object TiltValues {
  @scala.inline
  def apply(percentageX: Double, percentageY: Double, tiltX: Double, tiltY: Double): TiltValues = {
    val __obj = js.Dynamic.literal(percentageX = percentageX, percentageY = percentageY, tiltX = tiltX, tiltY = tiltY)
  
    __obj.asInstanceOf[TiltValues]
  }
}

