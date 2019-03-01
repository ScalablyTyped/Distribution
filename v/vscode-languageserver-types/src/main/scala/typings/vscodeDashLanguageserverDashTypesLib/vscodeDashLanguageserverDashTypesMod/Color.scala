package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /**
    * The alpha component of this color in the range [0-1].
    */
  val alpha: scala.Double
  /**
    * The blue component of this color in the range [0-1].
    */
  val blue: scala.Double
  /**
    * The green component of this color in the range [0-1].
    */
  val green: scala.Double
  /**
    * The red component of this color in the range [0-1].
    */
  val red: scala.Double
}

object Color {
  @scala.inline
  def apply(alpha: scala.Double, blue: scala.Double, green: scala.Double, red: scala.Double): Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha)
    __obj.updateDynamic("blue")(blue)
    __obj.updateDynamic("green")(green)
    __obj.updateDynamic("red")(red)
    __obj.asInstanceOf[Color]
  }
}

