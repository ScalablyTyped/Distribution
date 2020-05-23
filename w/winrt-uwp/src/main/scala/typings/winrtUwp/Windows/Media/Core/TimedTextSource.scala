package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.resolved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a source of timed text data. */
@js.native
trait TimedTextSource extends js.Object {
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

