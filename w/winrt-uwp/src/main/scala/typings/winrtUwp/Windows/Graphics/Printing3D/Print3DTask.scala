package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.completed
import typings.winrtUwp.winrtUwpStrings.sourcechanged
import typings.winrtUwp.winrtUwpStrings.submitting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D print job. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTask")
@js.native
abstract class Print3DTask () extends js.Object {
  /** Occurs when the print request has been sent to the 3D printer and the 3D print job has been created. */
  @JSName("oncompleted")
  var oncompleted_Original: TypedEventHandler[Print3DTask, Print3DTaskCompletedEventArgs] = js.native
  /** Occurs when the workflow modifies the 3D print package. */
  @JSName("onsourcechanged")
  var onsourcechanged_Original: TypedEventHandler[Print3DTask, Print3DTaskSourceChangedEventArgs] = js.native
  /** Occurs when the 3D print package has been submitted to the 3D printer. */
  @JSName("onsubmitting")
  var onsubmitting_Original: TypedEventHandler[Print3DTask, _] = js.native
  /** Gets the 3D print package to be printed. */
  var source: Printing3D3MFPackage = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(`type`: completed, listener: TypedEventHandler[Print3DTask, Print3DTaskCompletedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sourcechanged(`type`: sourcechanged, listener: TypedEventHandler[Print3DTask, Print3DTaskSourceChangedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submitting(`type`: submitting, listener: TypedEventHandler[Print3DTask, _]): Unit = js.native
  /** Occurs when the print request has been sent to the 3D printer and the 3D print job has been created. */
  def oncompleted(ev: Print3DTaskCompletedEventArgs with WinRTEvent[Print3DTask]): Unit = js.native
  /** Occurs when the workflow modifies the 3D print package. */
  def onsourcechanged(ev: Print3DTaskSourceChangedEventArgs with WinRTEvent[Print3DTask]): Unit = js.native
  /** Occurs when the 3D print package has been submitted to the 3D printer. */
  def onsubmitting(ev: js.Any with WinRTEvent[Print3DTask]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(`type`: completed, listener: TypedEventHandler[Print3DTask, Print3DTaskCompletedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sourcechanged(`type`: sourcechanged, listener: TypedEventHandler[Print3DTask, Print3DTaskSourceChangedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submitting(`type`: submitting, listener: TypedEventHandler[Print3DTask, _]): Unit = js.native
}

