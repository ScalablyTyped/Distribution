package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for handling message events. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsEndUserMessageManager")
@js.native
abstract class RcsEndUserMessageManager () extends js.Object {
  /** Occurs when a new message is available. */
  @JSName("onmessageavailablechanged")
  var onmessageavailablechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[RcsEndUserMessageManager, RcsEndUserMessageAvailableEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageavailablechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messageavailablechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[RcsEndUserMessageManager, RcsEndUserMessageAvailableEventArgs]
  ): scala.Unit = js.native
  /** Occurs when a new message is available. */
  def onmessageavailablechanged(
    ev: RcsEndUserMessageAvailableEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[RcsEndUserMessageManager]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageavailablechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messageavailablechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[RcsEndUserMessageManager, RcsEndUserMessageAvailableEventArgs]
  ): scala.Unit = js.native
}

