package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates the 3D printing experience. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DManager")
@js.native
abstract class Print3DManager () extends js.Object {
  /** Occurs when a new 3D print job has been created. */
  @JSName("ontaskrequested")
  var ontaskrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DManager, Print3DTaskRequestedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.taskrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DManager, Print3DTaskRequestedEventArgs]
  ): scala.Unit = js.native
  /** Occurs when a new 3D print job has been created. */
  def ontaskrequested(ev: Print3DTaskRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Print3DManager]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_taskrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.taskrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DManager, Print3DTaskRequestedEventArgs]
  ): scala.Unit = js.native
}

/** Creates the 3D printing experience. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DManager")
@js.native
object Print3DManager extends js.Object {
  /**
                   * Gets a 3D print manager.
                   * @return The 3D print manager.
                   */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DManager = js.native
  /**
                   * Programmatically initiates the 3D printing user interface.
                   * @return true if the operation completes successfully; otherwise, false.
                   */
  def showPrintUIAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

