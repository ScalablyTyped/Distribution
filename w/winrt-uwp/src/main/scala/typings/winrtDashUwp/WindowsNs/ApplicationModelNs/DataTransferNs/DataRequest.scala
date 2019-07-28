package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.DataTransferNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Lets your app supply the content the user wants to share or specify a message, if an error occurs. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequest")
@js.native
abstract class DataRequest () extends js.Object {
  /** Sets or gets a DataPackage object that contains the content a user wants to share. */
  var data: DataPackage = js.native
  /** Gets the deadline for finishing a delayed rendering operation. If execution goes beyond that deadline, the results of delayed rendering are ignored. */
  var deadline: Date = js.native
  /**
    * Cancels the sharing operation and supplies an error string to display to the user.
    * @param value The text to display to the user.
    */
  def failWithDisplayText(value: String): Unit = js.native
  /**
    * Supports asynchronous sharing operations by creating and returning a DataRequestDeferral object.
    * @return An object that allows you to share or send content asynchronously.
    */
  def getDeferral(): DataRequestDeferral = js.native
}

