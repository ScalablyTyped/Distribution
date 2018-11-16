package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the target app the user chose to share content with. To get this object, you must handle the TargetApplicationChosen event. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.TargetApplicationChosenEventArgs")
@js.native
abstract class TargetApplicationChosenEventArgs () extends js.Object {
  /** Contains the name of the app that the user chose to share content with. */
  var applicationName: java.lang.String = js.native
}

