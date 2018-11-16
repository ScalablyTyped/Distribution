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
  
  val abandoned: abandoned with java.lang.String = js.native
  val canceled: canceled with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val slicing: slicing with java.lang.String = js.native
  val submitted: submitted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowStatus with java.lang.String
  ] = js.native
}

