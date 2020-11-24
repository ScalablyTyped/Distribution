package typings.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/Rectangle", JSImport.Namespace)
@js.native
object rectangleMod extends js.Object {
  
  @js.native
  class Rectangle () extends js.Object {
    def this(left: Double) = this()
    def this(left: js.UndefOr[scala.Nothing], right: Double) = this()
    def this(left: Double, right: Double) = this()
    def this(left: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], top: Double) = this()
    def this(left: js.UndefOr[scala.Nothing], right: Double, top: Double) = this()
    def this(left: Double, right: js.UndefOr[scala.Nothing], top: Double) = this()
    def this(left: Double, right: Double, top: Double) = this()
    def this(
      left: js.UndefOr[scala.Nothing],
      right: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      bottom: Double
    ) = this()
    def this(left: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], top: Double, bottom: Double) = this()
    def this(left: js.UndefOr[scala.Nothing], right: Double, top: js.UndefOr[scala.Nothing], bottom: Double) = this()
    def this(left: js.UndefOr[scala.Nothing], right: Double, top: Double, bottom: Double) = this()
    def this(left: Double, right: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], bottom: Double) = this()
    def this(left: Double, right: js.UndefOr[scala.Nothing], top: Double, bottom: Double) = this()
    def this(left: Double, right: Double, top: js.UndefOr[scala.Nothing], bottom: Double) = this()
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
    
    var bottom: Double = js.native
    
    /**
      * Tests if another rect is approximately equal to this rect (within 4 decimal places.)
      */
    def equals(rect: Rectangle): Boolean = js.native
    
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
  }
}
