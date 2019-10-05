package typings.winrtDashUwp.Windows.Graphics.Printing3D

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
  sealed trait abandoned extends Print3DTaskCompletion
  
  /** The request has been canceled. */
  @js.native
  sealed trait canceled extends Print3DTaskCompletion
  
  /** The request has failed. */
  @js.native
  sealed trait failed extends Print3DTaskCompletion
  
  /** The driver is preparing layer by layer slices of the 3D model for the printer. */
  @js.native
  sealed trait slicing extends Print3DTaskCompletion
  
  /** The request has been submitted successfully. */
  @js.native
  sealed trait submitted extends Print3DTaskCompletion
  
  /* 0 */ val abandoned: typings.winrtDashUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.abandoned with Double = js.native
  /* 1 */ val canceled: typings.winrtDashUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.canceled with Double = js.native
  /* 2 */ val failed: typings.winrtDashUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.failed with Double = js.native
  /* 3 */ val slicing: typings.winrtDashUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.slicing with Double = js.native
  /* 4 */ val submitted: typings.winrtDashUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.submitted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Print3DTaskCompletion with Double] = js.native
}

