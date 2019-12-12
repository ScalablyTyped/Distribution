package typings.winrtDashUwp.Windows.Devices.Printers.Extensions

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.abandoned
import typings.winrtDashUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.canceled
import typings.winrtDashUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.failed
import typings.winrtDashUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.slicing
import typings.winrtDashUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.submitted
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Print3DWorkflowStatus with Double] = js.native
  /* 0 */ @js.native
  object abandoned extends TopLevel[abandoned with Double]
  
  /* 1 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 2 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 3 */ @js.native
  object slicing extends TopLevel[slicing with Double]
  
  /* 4 */ @js.native
  object submitted extends TopLevel[submitted with Double]
  
}

