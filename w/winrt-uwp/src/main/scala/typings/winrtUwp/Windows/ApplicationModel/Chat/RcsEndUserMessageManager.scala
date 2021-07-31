package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.messageavailablechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for handling message events. */
@js.native
trait RcsEndUserMessageManager extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageavailablechanged(
    `type`: messageavailablechanged,
    listener: TypedEventHandler[RcsEndUserMessageManager, RcsEndUserMessageAvailableEventArgs]
  ): Unit = js.native
  
  /** Occurs when a new message is available. */
  def onmessageavailablechanged(ev: RcsEndUserMessageAvailableEventArgs & WinRTEvent[RcsEndUserMessageManager]): Unit = js.native
  /** Occurs when a new message is available. */
  @JSName("onmessageavailablechanged")
  var onmessageavailablechanged_Original: TypedEventHandler[RcsEndUserMessageManager, RcsEndUserMessageAvailableEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageavailablechanged(
    `type`: messageavailablechanged,
    listener: TypedEventHandler[RcsEndUserMessageManager, RcsEndUserMessageAvailableEventArgs]
  ): Unit = js.native
}
