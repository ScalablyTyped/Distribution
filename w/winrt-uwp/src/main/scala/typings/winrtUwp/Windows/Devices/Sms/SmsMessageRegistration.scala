package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.messagereceived
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Class used to represent registered message filters. */
@js.native
trait SmsMessageRegistration extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceived(
    `type`: messagereceived,
    listener: TypedEventHandler[SmsMessageRegistration, SmsMessageReceivedTriggerDetails]
  ): Unit = js.native
  
  /** Gets an identifier for this registered message filter. */
  var id: String = js.native
  
  /** Event signaled when a message has been received that meets the filter criteria set in a registered message filter. */
  def onmessagereceived(ev: SmsMessageReceivedTriggerDetails & WinRTEvent[SmsMessageRegistration]): Unit = js.native
  /** Event signaled when a message has been received that meets the filter criteria set in a registered message filter. */
  @JSName("onmessagereceived")
  var onmessagereceived_Original: TypedEventHandler[SmsMessageRegistration, SmsMessageReceivedTriggerDetails] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceived(
    `type`: messagereceived,
    listener: TypedEventHandler[SmsMessageRegistration, SmsMessageReceivedTriggerDetails]
  ): Unit = js.native
  
  /** Unregisters a previously-registered message filter. The filter will no longer be applied to incoming messages. */
  def unregister(): Unit = js.native
}
