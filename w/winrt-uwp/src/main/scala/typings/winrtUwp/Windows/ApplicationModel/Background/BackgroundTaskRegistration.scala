package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.completed
import typings.winrtUwp.winrtUwpStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a background task that has been registered with the system. */
@js.native
trait BackgroundTaskRegistration extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(`type`: completed, listener: BackgroundTaskCompletedEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: BackgroundTaskProgressEventHandler): Unit = js.native
  
  /** Gets the name of a registered background task. */
  var name: String = js.native
  
  /** Attaches a completed event handler to the registered background task. */
  def oncompleted(ev: BackgroundTaskCompletedEventArgs with WinRTEvent[BackgroundTaskRegistration]): Unit = js.native
  /** Attaches a completed event handler to the registered background task. */
  @JSName("oncompleted")
  var oncompleted_Original: BackgroundTaskCompletedEventHandler = js.native
  
  /** Attaches a progress event handler to the registered background task. */
  def onprogress(ev: BackgroundTaskProgressEventArgs with WinRTEvent[BackgroundTaskRegistration]): Unit = js.native
  /** Attaches a progress event handler to the registered background task. */
  @JSName("onprogress")
  var onprogress_Original: BackgroundTaskProgressEventHandler = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(`type`: completed, listener: BackgroundTaskCompletedEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(`type`: progress, listener: BackgroundTaskProgressEventHandler): Unit = js.native
  
  /** Gets the identifier of a registered background task. */
  var taskId: String = js.native
  
  /** This is not intended for use in your code. For all unsupported trigger types, the value returned by this property is null. */
  var trigger: IBackgroundTrigger = js.native
  
  /**
    * Cancels the registration of a registered background task.
    * @param cancelTask True if currently running instances of this background task should be canceled. If this parameter is false, currently running instances are allowed to finish. Canceled instances receive a Canceled event with a cancellation reason of Abort.
    */
  def unregister(cancelTask: Boolean): Unit = js.native
}
