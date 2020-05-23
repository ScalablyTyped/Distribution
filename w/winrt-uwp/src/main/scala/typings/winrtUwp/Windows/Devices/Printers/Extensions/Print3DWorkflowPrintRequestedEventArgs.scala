package typings.winrtUwp.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the print request to the app that initiated the request. */
trait Print3DWorkflowPrintRequestedEventArgs extends js.Object {
  /** Gets the status of the print request. */
  var status: Print3DWorkflowStatus
  /**
    * Sets the extended status of the print request.
    * @param value The extended status of the print request.
    */
  def setExtendedStatus(value: Print3DWorkflowDetail): Unit
  /**
    * Sets the latest model data, including any updates made by the Print3DWorkflow .
    * @param source The latest model data, including any updates made by the Print3DWorkflow .
    */
  def setSource(source: js.Any): Unit
  /**
    * Indicates if the data model has been updated by the Print3DWorkflow .
    * @param value Returns true if the data model has been updated; otherwise, false.
    */
  def setSourceChanged(value: Boolean): Unit
}

object Print3DWorkflowPrintRequestedEventArgs {
  @scala.inline
  def apply(
    setExtendedStatus: Print3DWorkflowDetail => Unit,
    setSource: js.Any => Unit,
    setSourceChanged: Boolean => Unit,
    status: Print3DWorkflowStatus
  ): Print3DWorkflowPrintRequestedEventArgs = {
    val __obj = js.Dynamic.literal(setExtendedStatus = js.Any.fromFunction1(setExtendedStatus), setSource = js.Any.fromFunction1(setSource), setSourceChanged = js.Any.fromFunction1(setSourceChanged), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DWorkflowPrintRequestedEventArgs]
  }
}

