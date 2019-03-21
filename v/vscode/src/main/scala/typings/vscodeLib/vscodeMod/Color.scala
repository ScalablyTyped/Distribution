package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Color")
@js.native
class Color protected () extends js.Object {
  /**
  		 * Creates a new color instance.
  		 *
  		 * @param red The red component.
  		 * @param green The green component.
  		 * @param blue The bluew component.
  		 * @param alpha The alpha component.
  		 */
  def this(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double) = this()
  /**
  		 * The alpha component of this color in the range [0-1].
  		 */
  val alpha: scala.Double = js.native
  /**
  		 * The blue component of this color in the range [0-1].
  		 */
  val blue: scala.Double = js.native
  /**
  		 * The green component of this color in the range [0-1].
  		 */
  val green: scala.Double = js.native
  /**
  		 * The red component of this color in the range [0-1].
  		 */
  val red: scala.Double = js.native
}

