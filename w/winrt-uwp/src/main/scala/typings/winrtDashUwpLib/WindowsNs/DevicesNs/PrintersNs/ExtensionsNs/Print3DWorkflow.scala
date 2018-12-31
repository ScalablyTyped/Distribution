package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a customized printing experience for a 3D printer. */
@JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflow")
@js.native
abstract class Print3DWorkflow () extends js.Object {
  /** Gets the device identifier of the 3D printer. */
  var deviceID: java.lang.String = js.native
  /** Gets or sets a value that indicates the 3D object is ready for printing and no further user interaction is required. */
  var isPrintReady: scala.Boolean = js.native
  /** Occurs when the user initiates printing. */
  @JSName("onprintrequested")
  var onprintrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_printrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.printrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs]
  ): scala.Unit = js.native
  /**
    * Gets the model of the 3D object to be printed.
    * @return The model of the 3D object to be printed.
    */
  def getPrintModelPackage(): js.Any = js.native
  /** Occurs when the user initiates printing. */
  def onprintrequested(
    ev: Print3DWorkflowPrintRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Print3DWorkflow]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_printrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.printrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs]
  ): scala.Unit = js.native
}

