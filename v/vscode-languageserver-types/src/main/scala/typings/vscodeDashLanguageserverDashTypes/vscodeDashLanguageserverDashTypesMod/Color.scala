package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /**
    * The alpha component of this color in the range [0-1].
    */
  val alpha: Double
  /**
    * The blue component of this color in the range [0-1].
    */
  val blue: Double
  /**
    * The green component of this color in the range [0-1].
    */
  val green: Double
  /**
    * The red component of this color in the range [0-1].
    */
  val red: Double
}

object Color {
  @scala.inline
  def apply(alpha: Double, blue: Double, green: Double, red: Double): Color = {
    val __obj = js.Dynamic.literal(alpha = alpha, blue = blue, green = green, red = red)
  
    __obj.asInstanceOf[Color]
  }
}

