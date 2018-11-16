package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a source of timed text data. */
@JSGlobal("Windows.Media.Core.TimedTextSource")
@js.native
abstract class TimedTextSource () extends js.Object {
  /** Occurs when the TimedTextSource is resolved. */
  @JSName("onresolved")
  var onresolved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resolved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.resolved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs]
  ): scala.Unit = js.native
  /** Occurs when the TimedTextSource is resolved. */
  def onresolved(
    ev: TimedTextSourceResolveResultEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[TimedTextSource]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resolved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.resolved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs]
  ): scala.Unit = js.native
}

/** Represents a source of timed text data. */
@JSGlobal("Windows.Media.Core.TimedTextSource")
@js.native
object TimedTextSource extends js.Object {
  /**
                   * Creates a new instance of TimedTextSource from the provided stream.
                   * @param stream The stream from which the timed text source is created.
                   * @return The new timed text source.
                   */
  def createFromStream(stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextSource = js.native
  /**
                   * Creates a new instance of TimedTextSource with the specified default language from the provided stream.
                   * @param stream The stream from which the timed text source is created.
                   * @param defaultLanguage A string specifying the default language for the timed text source.
                   * @return The new timed text source.
                   */
  def createFromStream(
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    defaultLanguage: java.lang.String
  ): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextSource = js.native
  /**
                   * Creates a new instance of TimedTextSource from the provided URI.
                   * @param uri The URI from which the timed text source is created.
                   * @return The new timed text source.
                   */
  def createFromUri(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextSource = js.native
  /**
                   * Creates a new instance of TimedTextSource with the specified default language from the provided URI.
                   * @param uri The URI from which the timed text source is created.
                   * @param defaultLanguage A string specifying the default language for the timed text source.
                   * @return The new timed text source.
                   */
  def createFromUri(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri, defaultLanguage: java.lang.String): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedTextSource = js.native
}

