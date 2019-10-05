package typings.winrtDashUwp.Windows.Devices.Sms

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.messagereceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class used to represent registered message filters. */
@JSGlobal("Windows.Devices.Sms.SmsMessageRegistration")
@js.native
abstract class SmsMessageRegistration () extends js.Object {
  /** Gets an identifier for this registered message filter. */
  var id: String = js.native
  /** Event signaled when a message has been received that meets the filter criteria set in a registered message filter. */
  @JSName("onmessagereceived")
  var onmessagereceived_Original: TypedEventHandler[SmsMessageRegistration, SmsMessageReceivedTriggerDetails] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceived(
    `type`: messagereceived,
    listener: TypedEventHandler[SmsMessageRegistration, SmsMessageReceivedTriggerDetails]
  ): Unit = js.native
  /** Event signaled when a message has been received that meets the filter criteria set in a registered message filter. */
  def onmessagereceived(ev: SmsMessageReceivedTriggerDetails with WinRTEvent[SmsMessageRegistration]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceived(
    `type`: messagereceived,
    listener: TypedEventHandler[SmsMessageRegistration, SmsMessageReceivedTriggerDetails]
  ): Unit = js.native
  /** Unregisters a previously-registered message filter. The filter will no longer be applied to incoming messages. */
  def unregister(): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsMessageRegistration")
@js.native
object SmsMessageRegistration extends js.Object {
  /** Static property that gets a list of currently registered message filters.. */
  var allRegistrations: IVectorView[SmsMessageRegistration] = js.native
  /**
    * Registers a message filter.
    * @param id Identifier used to describe this message filter.
    * @param filterRules An object that represents the filter rules to be used for this registered message filter.
    * @return On successful completion, the SmsMessageRegistration object that represents this registered message filter.
    */
  def register(id: String, filterRules: SmsFilterRules): SmsMessageRegistration = js.native
}

