package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Print3DTaskCompletion extends js.Object

/** Specifies the completion status of a 3D print request. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskCompletion")
@js.native
object Print3DTaskCompletion extends js.Object {
  /** The request has been abandoned. */
  @js.native
  sealed trait abandoned
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskCompletion
  
  /** The request has been canceled. */
  @js.native
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskCompletion
  
  /** The request has failed. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskCompletion
  
  /** The driver is preparing layer by layer slices of the 3D model for the printer. */
  @js.native
  sealed trait slicing
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskCompletion
  
  /** The request has been submitted successfully. */
  @js.native
  sealed trait submitted
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskCompletion
  
  /* 0 */ val abandoned: abandoned with scala.Double = js.native
  /* 1 */ val canceled: canceled with scala.Double = js.native
  /* 2 */ val failed: failed with scala.Double = js.native
  /* 3 */ val slicing: slicing with scala.Double = js.native
  /* 4 */ val submitted: submitted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskCompletion with scala.Double
  ] = js.native
}

