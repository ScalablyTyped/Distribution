package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Print3DWorkflowStatus extends js.Object

/** Specifies the status of the Print3DWorkflow class. */
@JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflowStatus")
@js.native
object Print3DWorkflowStatus extends js.Object {
  /** The printing experience has been abandoned. */
  @js.native
  sealed trait abandoned
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowStatus
  
  /** The printing experience has been canceled. */
  @js.native
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowStatus
  
  /** The print request failed. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowStatus
  
  /** The object is undergoing slicing in preparation for printing. */
  @js.native
  sealed trait slicing
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowStatus
  
  /** The print request has been submitted. */
  @js.native
  sealed trait submitted
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowStatus
  
  /* 0 */ val abandoned: abandoned with scala.Double = js.native
  /* 1 */ val canceled: canceled with scala.Double = js.native
  /* 2 */ val failed: failed with scala.Double = js.native
  /* 3 */ val slicing: slicing with scala.Double = js.native
  /* 4 */ val submitted: submitted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowStatus with scala.Double
  ] = js.native
}

