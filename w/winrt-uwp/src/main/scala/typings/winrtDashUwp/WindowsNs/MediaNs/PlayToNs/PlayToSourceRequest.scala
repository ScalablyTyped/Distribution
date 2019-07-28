package typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request to connect a media element with a Play To target. */
@JSGlobal("Windows.Media.PlayTo.PlayToSourceRequest")
@js.native
abstract class PlayToSourceRequest () extends js.Object {
  /** Gets the time limit to supply the Play To source element. */
  var deadline: Date = js.native
  /**
    * Displays an error message in the Play To UI.
    * @param errorString The error message to display in the Play To UI.
    */
  def displayErrorString(errorString: String): Unit = js.native
  /**
    * Defers connecting a media source to a Play To target.
    * @return A deferral object that you can use to identify when the deferral is complete.
    */
  def getDeferral(): PlayToSourceDeferral = js.native
  /**
    * Sets the source element to connect to the Play To target.
    * @param value The source element to connect to the Play To target.
    */
  def setSource(value: PlayToSource): Unit = js.native
}

