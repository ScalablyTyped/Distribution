package typings.winrtDashUwp.Windows.Media.Core

import typings.winrtDashUwp.Windows.Foundation.Deferral
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.canceled
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
  var oncanceled_Original: TypedEventHandler[MediaBindingEventArgs, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canceled(`type`: canceled, listener: TypedEventHandler[MediaBindingEventArgs, _]): Unit = js.native
  /**
    * Informs the system that the app might continue to perform work after the Binding event handler returns.
    * @return The requested deferral.
    */
  def getDeferral(): Deferral = js.native
  /** Occurs when the binding operation is cancelled. */
  def oncanceled(ev: js.Any with WinRTEvent[MediaBindingEventArgs]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canceled(`type`: canceled, listener: TypedEventHandler[MediaBindingEventArgs, _]): Unit = js.native
  /**
    * Sets the media content to be bound to the MediaSource .
    * @param stream A stream containing the media content.
    * @param contentType A string specifying the content type of the media content.
    */
  def setStream(stream: IRandomAccessStream, contentType: String): Unit = js.native
  /**
    * Sets the media content to be bound to the MediaSource .
    * @param stream A stream reference containing the media content to be bound.
    * @param contentType A string specifying the content type of the media content.
    */
  def setStreamReference(stream: IRandomAccessStreamReference, contentType: String): Unit = js.native
  /**
    * Sets the URI of the media content to be bound to the MediaSource .
    * @param uri The URI of the media content to be bound.
    */
  def setUri(uri: Uri): Unit = js.native
}

