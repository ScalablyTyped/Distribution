package typings
package atUifabricUtilitiesLib.libRectangleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/Rectangle", "Rectangle")
@js.native
class Rectangle () extends js.Object {
  def this(left: scala.Double) = this()
  def this(left: scala.Double, right: scala.Double) = this()
  def this(left: scala.Double, right: scala.Double, top: scala.Double) = this()
  def this(left: scala.Double, right: scala.Double, top: scala.Double, bottom: scala.Double) = this()
  var bottom: scala.Double = js.native
  /**
       * Calculated automatically by subtracting the bottom from top.
       */
  val height: scala.Double = js.native
  var left: scala.Double = js.native
  var right: scala.Double = js.native
  var top: scala.Double = js.native
  /**
       * Calculated automatically by subtracting the right from left
       */
  val width: scala.Double = js.native
  /**
       * Tests if another rect is approximately equal to this rect (within 4 decimal places.)
       */
  def equals(rect: Rectangle): scala.Boolean = js.native
}

