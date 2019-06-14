package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Printing3DObjectType extends js.Object

/** Specifies the function of the object in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DObjectType")
@js.native
object Printing3DObjectType extends js.Object {
  /** Functions as a core component of the 3D model. */
  @js.native
  sealed trait model
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DObjectType
  
  /** Functions in some other capacity. */
  @js.native
  sealed trait others
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DObjectType
  
  /** Functions as a support object. */
  @js.native
  sealed trait support
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DObjectType
  
  /* 0 */ val model: model with scala.Double = js.native
  /* 2 */ val others: others with scala.Double = js.native
  /* 1 */ val support: support with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Printing3DObjectType with scala.Double
  ] = js.native
}

