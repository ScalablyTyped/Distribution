package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a source of timed text data. */
@js.native
trait TimedTextSource extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resolved(
    `type`: resolved,
    listener: TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs]
  ): Unit = js.native
  
  /** Occurs when the TimedTextSource is resolved. */
  def onresolved(ev: TimedTextSourceResolveResultEventArgs & WinRTEvent[TimedTextSource]): Unit = js.native
  /** Occurs when the TimedTextSource is resolved. */
  @JSName("onresolved")
  var onresolved_Original: TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resolved(
    `type`: resolved,
    listener: TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs]
  ): Unit = js.native
}
