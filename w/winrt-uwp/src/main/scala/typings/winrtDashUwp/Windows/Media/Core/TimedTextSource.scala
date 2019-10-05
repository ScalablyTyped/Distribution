package typings.winrtDashUwp.Windows.Media.Core

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.resolved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a source of timed text data. */
@JSGlobal("Windows.Media.Core.TimedTextSource")
@js.native
abstract class TimedTextSource () extends js.Object {
  /** Occurs when the TimedTextSource is resolved. */
  @JSName("onresolved")
  var onresolved_Original: TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resolved(
    `type`: resolved,
    listener: TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs]
  ): Unit = js.native
  /** Occurs when the TimedTextSource is resolved. */
  def onresolved(ev: TimedTextSourceResolveResultEventArgs with WinRTEvent[TimedTextSource]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resolved(
    `type`: resolved,
    listener: TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Media.Core.TimedTextSource")
@js.native
object TimedTextSource extends js.Object {
  /**
    * Creates a new instance of TimedTextSource from the provided stream.
    * @param stream The stream from which the timed text source is created.
    * @return The new timed text source.
    */
  def createFromStream(stream: IRandomAccessStream): TimedTextSource = js.native
  /**
    * Creates a new instance of TimedTextSource with the specified default language from the provided stream.
    * @param stream The stream from which the timed text source is created.
    * @param defaultLanguage A string specifying the default language for the timed text source.
    * @return The new timed text source.
    */
  def createFromStream(stream: IRandomAccessStream, defaultLanguage: String): TimedTextSource = js.native
  /**
    * Creates a new instance of TimedTextSource from the provided URI.
    * @param uri The URI from which the timed text source is created.
    * @return The new timed text source.
    */
  def createFromUri(uri: Uri): TimedTextSource = js.native
  /**
    * Creates a new instance of TimedTextSource with the specified default language from the provided URI.
    * @param uri The URI from which the timed text source is created.
    * @param defaultLanguage A string specifying the default language for the timed text source.
    * @return The new timed text source.
    */
  def createFromUri(uri: Uri, defaultLanguage: String): TimedTextSource = js.native
}

