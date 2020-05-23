package typings.winrtUwp.global.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the target app the user chose to share content with. To get this object, you must handle the TargetApplicationChosen event. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.TargetApplicationChosenEventArgs")
@js.native
abstract class TargetApplicationChosenEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.TargetApplicationChosenEventArgs {
  /** Contains the name of the app that the user chose to share content with. */
  /* CompleteClass */
  override var applicationName: String = js.native
}

