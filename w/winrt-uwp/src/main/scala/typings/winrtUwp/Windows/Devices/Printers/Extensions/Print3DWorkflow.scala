package typings.winrtUwp.Windows.Devices.Printers.Extensions

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.printrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a customized printing experience for a 3D printer. */
@js.native
trait Print3DWorkflow extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_printrequested(
    `type`: printrequested,
    listener: TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs]
  ): Unit = js.native
  
  /** Gets the device identifier of the 3D printer. */
  var deviceID: String = js.native
  
  /**
    * Gets the model of the 3D object to be printed.
    * @return The model of the 3D object to be printed.
    */
  def getPrintModelPackage(): js.Any = js.native
  
  /** Gets or sets a value that indicates the 3D object is ready for printing and no further user interaction is required. */
  var isPrintReady: Boolean = js.native
  
  /** Occurs when the user initiates printing. */
  def onprintrequested(ev: Print3DWorkflowPrintRequestedEventArgs with WinRTEvent[Print3DWorkflow]): Unit = js.native
  /** Occurs when the user initiates printing. */
  @JSName("onprintrequested")
  var onprintrequested_Original: TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_printrequested(
    `type`: printrequested,
    listener: TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs]
  ): Unit = js.native
}
