package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Core.MediaBinder")
@js.native
/** Initializes a new instance of the MediaBinder class. */
class MediaBinder () extends js.Object {
  /** Occurs when a media player is ready for the media content to be bound to a MediaSource . Use the handler for this to set the media content for the source by calling SetStream , SetStreamReference , or SetUri . */
  @JSName("onbinding")
  var onbinding_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaBinder, MediaBindingEventArgs] = js.native
  /** Gets the MediaSource object associated with the MediaBinder . */
  var source: MediaSource = js.native
  /** Gets or sets an app-specified string that is used to identify the media content that the app should bind when the Binding event is raised. */
  var token: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_binding(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.binding,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaBinder, MediaBindingEventArgs]
  ): scala.Unit = js.native
  /** Occurs when a media player is ready for the media content to be bound to a MediaSource . Use the handler for this to set the media content for the source by calling SetStream , SetStreamReference , or SetUri . */
  def onbinding(ev: MediaBindingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaBinder]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_binding(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.binding,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaBinder, MediaBindingEventArgs]
  ): scala.Unit = js.native
}

