package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.binding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Core.MediaBinder")
@js.native
/** Initializes a new instance of the MediaBinder class. */
class MediaBinder () extends js.Object {
  /** Occurs when a media player is ready for the media content to be bound to a MediaSource . Use the handler for this to set the media content for the source by calling SetStream , SetStreamReference , or SetUri . */
  @JSName("onbinding")
  var onbinding_Original: TypedEventHandler[MediaBinder, MediaBindingEventArgs] = js.native
  /** Gets the MediaSource object associated with the MediaBinder . */
  var source: MediaSource = js.native
  /** Gets or sets an app-specified string that is used to identify the media content that the app should bind when the Binding event is raised. */
  var token: String = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_binding(`type`: binding, listener: TypedEventHandler[MediaBinder, MediaBindingEventArgs]): Unit = js.native
  /** Occurs when a media player is ready for the media content to be bound to a MediaSource . Use the handler for this to set the media content for the source by calling SetStream , SetStreamReference , or SetUri . */
  def onbinding(ev: MediaBindingEventArgs with WinRTEvent[MediaBinder]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_binding(`type`: binding, listener: TypedEventHandler[MediaBinder, MediaBindingEventArgs]): Unit = js.native
}

