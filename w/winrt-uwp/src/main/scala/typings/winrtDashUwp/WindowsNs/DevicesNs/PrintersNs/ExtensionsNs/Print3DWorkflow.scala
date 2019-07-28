package typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.printrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a customized printing experience for a 3D printer. */
@JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflow")
@js.native
abstract class Print3DWorkflow () extends js.Object {
  /** Gets the device identifier of the 3D printer. */
  var deviceID: String = js.native
  /** Gets or sets a value that indicates the 3D object is ready for printing and no further user interaction is required. */
  var isPrintReady: Boolean = js.native
  /** Occurs when the user initiates printing. */
  @JSName("onprintrequested")
  var onprintrequested_Original: TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_printrequested(
    `type`: printrequested,
    listener: TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs]
  ): Unit = js.native
  /**
    * Gets the model of the 3D object to be printed.
    * @return The model of the 3D object to be printed.
    */
  def getPrintModelPackage(): js.Any = js.native
  /** Occurs when the user initiates printing. */
  def onprintrequested(ev: Print3DWorkflowPrintRequestedEventArgs with WinRTEvent[Print3DWorkflow]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_printrequested(
    `type`: printrequested,
    listener: TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs]
  ): Unit = js.native
}

