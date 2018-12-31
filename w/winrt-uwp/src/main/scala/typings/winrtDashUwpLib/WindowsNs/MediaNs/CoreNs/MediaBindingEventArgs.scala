package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Core.MediaBindingEventArgs")
@js.native
abstract class MediaBindingEventArgs () extends js.Object {
  /** Gets the MediaBinder associated with the binding event. */
  var mediaBinder: MediaBinder = js.native
  /** Occurs when the binding operation is cancelled. */
  @JSName("oncanceled")
  var oncanceled_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaBindingEventArgs, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canceled(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.canceled,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaBindingEventArgs, _]
  ): scala.Unit = js.native
  /**
    * Informs the system that the app might continue to perform work after the Binding event handler returns.
    * @return The requested deferral.
    */
  def getDeferral(): winrtDashUwpLib.WindowsNs.FoundationNs.Deferral = js.native
  /** Occurs when the binding operation is cancelled. */
  def oncanceled(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaBindingEventArgs]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canceled(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.canceled,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaBindingEventArgs, _]
  ): scala.Unit = js.native
  /**
    * Sets the media content to be bound to the MediaSource .
    * @param stream A stream containing the media content.
    * @param contentType A string specifying the content type of the media content.
    */
  def setStream(
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    contentType: java.lang.String
  ): scala.Unit = js.native
  /**
    * Sets the media content to be bound to the MediaSource .
    * @param stream A stream reference containing the media content to be bound.
    * @param contentType A string specifying the content type of the media content.
    */
  def setStreamReference(
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference,
    contentType: java.lang.String
  ): scala.Unit = js.native
  /**
    * Sets the URI of the media content to be bound to the MediaSource .
    * @param uri The URI of the media content to be bound.
    */
  def setUri(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): scala.Unit = js.native
}

