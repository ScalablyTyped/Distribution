package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D print job. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTask")
@js.native
abstract class Print3DTask () extends js.Object {
  /** Occurs when the print request has been sent to the 3D printer and the 3D print job has been created. */
  @JSName("oncompleted")
  var oncompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DTask, Print3DTaskCompletedEventArgs] = js.native
  /** Occurs when the workflow modifies the 3D print package. */
  @JSName("onsourcechanged")
  var onsourcechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DTask, Print3DTaskSourceChangedEventArgs] = js.native
  /** Occurs when the 3D print package has been submitted to the 3D printer. */
  @JSName("onsubmitting")
  var onsubmitting_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DTask, _] = js.native
  /** Gets the 3D print package to be printed. */
  var source: Printing3D3MFPackage = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.completed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DTask, Print3DTaskCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourcechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourcechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DTask, Print3DTaskSourceChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submitting(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.submitting,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DTask, _]
  ): scala.Unit = js.native
  /** Occurs when the print request has been sent to the 3D printer and the 3D print job has been created. */
  def oncompleted(ev: Print3DTaskCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Print3DTask]): scala.Unit = js.native
  /** Occurs when the workflow modifies the 3D print package. */
  def onsourcechanged(ev: Print3DTaskSourceChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Print3DTask]): scala.Unit = js.native
  /** Occurs when the 3D print package has been submitted to the 3D printer. */
  def onsubmitting(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[Print3DTask]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.completed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DTask, Print3DTaskCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourcechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sourcechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DTask, Print3DTaskSourceChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submitting(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.submitting,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Print3DTask, _]
  ): scala.Unit = js.native
}

