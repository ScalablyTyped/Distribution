package typings.winrtUwp.global.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the Completed event of the 3D print request. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskCompletedEventArgs")
@js.native
abstract class Print3DTaskCompletedEventArgs ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletedEventArgs {
  /** Gets the status of the 3D print request. */
  /* CompleteClass */
  override var completion: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion = js.native
  /** Gets the type of error encountered during the 3D print request. */
  /* CompleteClass */
  override var extendedStatus: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskDetail = js.native
}

