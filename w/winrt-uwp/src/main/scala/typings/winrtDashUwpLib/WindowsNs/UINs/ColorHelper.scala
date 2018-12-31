package typings
package winrtDashUwpLib.WindowsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides static helper methods for processing Color values. C# and Microsoft Visual Basic code should use methods of Color instead. */
@JSGlobal("Windows.UI.ColorHelper")
@js.native
abstract class ColorHelper () extends js.Object

/** Provides static helper methods for processing Color values. C# and Microsoft Visual Basic code should use methods of Color instead. */
@JSGlobal("Windows.UI.ColorHelper")
@js.native
object ColorHelper extends js.Object {
  /**
    * Generates a Color structure, based on discrete Byte values for ARGB components. C# and Microsoft Visual Basic code should use Color.FromArgb instead.
    * @param a The A (transparency) component of the desired color. Range is 0-255.
    * @param r The R component of the desired color. Range is 0-255.
    * @param g The G component of the desired color. Range is 0-255.
    * @param b The B component of the desired color. Range is 0-255.
    * @return The generated Color value.
    */
  def fromArgb(a: scala.Double, r: scala.Double, g: scala.Double, b: scala.Double): winrtDashUwpLib.WindowsNs.UINs.Color = js.native
}

