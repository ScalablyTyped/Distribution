package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result to the application that launched the current application for results. */
@JSGlobal("Windows.System.ProtocolForResultsOperation")
@js.native
abstract class ProtocolForResultsOperation () extends js.Object {
  /**
    * Indicates that the application activated for results is ready to return to the application that launched it for results.
    * @param data The data to return to the application that activated this app.
    */
  def reportCompleted(data: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet): scala.Unit = js.native
}

