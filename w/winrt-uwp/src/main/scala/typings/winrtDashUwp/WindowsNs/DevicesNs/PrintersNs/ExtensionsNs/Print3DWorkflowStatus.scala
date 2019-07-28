package typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

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
  sealed trait abandoned extends Print3DWorkflowStatus
  
  /** The printing experience has been canceled. */
  @js.native
  sealed trait canceled extends Print3DWorkflowStatus
  
  /** The print request failed. */
  @js.native
  sealed trait failed extends Print3DWorkflowStatus
  
  /** The object is undergoing slicing in preparation for printing. */
  @js.native
  sealed trait slicing extends Print3DWorkflowStatus
  
  /** The print request has been submitted. */
  @js.native
  sealed trait submitted extends Print3DWorkflowStatus
  
  /* 0 */ val abandoned: typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowStatus.abandoned with Double = js.native
  /* 1 */ val canceled: typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowStatus.canceled with Double = js.native
  /* 2 */ val failed: typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowStatus.failed with Double = js.native
  /* 3 */ val slicing: typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowStatus.slicing with Double = js.native
  /* 4 */ val submitted: typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowStatus.submitted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Print3DWorkflowStatus with Double] = js.native
}

