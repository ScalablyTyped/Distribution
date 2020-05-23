package typings.winrtUwp.Windows.Devices.Printers.Extensions

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
  
}

