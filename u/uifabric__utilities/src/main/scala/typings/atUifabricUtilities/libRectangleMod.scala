package typings.atUifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/Rectangle", JSImport.Namespace)
@js.native
object libRectangleMod extends js.Object {
  @js.native
  class Rectangle () extends js.Object {
    def this(left: Double) = this()
    def this(left: Double, right: Double) = this()
    def this(left: Double, right: Double, top: Double) = this()
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
    var bottom: Double = js.native
    /**
      * Calculated automatically by subtracting the bottom from top.
      */
    val height: Double = js.native
    var left: Double = js.native
    var right: Double = js.native
    var top: Double = js.native
    /**
      * Calculated automatically by subtracting the right from left
      */
    val width: Double = js.native
    /**
      * Tests if another rect is approximately equal to this rect (within 4 decimal places.)
      */
    def equals(rect: Rectangle): Boolean = js.native
  }
  
}

