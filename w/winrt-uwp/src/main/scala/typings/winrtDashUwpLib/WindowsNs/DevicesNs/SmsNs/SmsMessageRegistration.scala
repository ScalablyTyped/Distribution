package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class used to represent registered message filters. */
@JSGlobal("Windows.Devices.Sms.SmsMessageRegistration")
@js.native
abstract class SmsMessageRegistration () extends js.Object {
  /** Gets an identifier for this registered message filter. */
  var id: java.lang.String = js.native
  /** Event signaled when a message has been received that meets the filter criteria set in a registered message filter. */
  @JSName("onmessagereceived")
  var onmessagereceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SmsMessageRegistration, SmsMessageReceivedTriggerDetails] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messagereceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SmsMessageRegistration, SmsMessageReceivedTriggerDetails]
  ): scala.Unit = js.native
  /** Event signaled when a message has been received that meets the filter criteria set in a registered message filter. */
  def onmessagereceived(
    ev: SmsMessageReceivedTriggerDetails with winrtDashUwpLib.WindowsNs.WinRTEvent[SmsMessageRegistration]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messagereceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SmsMessageRegistration, SmsMessageReceivedTriggerDetails]
  ): scala.Unit = js.native
  /** Unregisters a previously-registered message filter. The filter will no longer be applied to incoming messages. */
  def unregister(): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sms.SmsMessageRegistration")
@js.native
object SmsMessageRegistration extends js.Object {
  /** Static property that gets a list of currently registered message filters.. */
  var allRegistrations: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageRegistration] = js.native
  /**
    * Registers a message filter.
    * @param id Identifier used to describe this message filter.
    * @param filterRules An object that represents the filter rules to be used for this registered message filter.
    * @return On successful completion, the SmsMessageRegistration object that represents this registered message filter.
    */
  def register(id: java.lang.String, filterRules: winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsFilterRules): winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageRegistration = js.native
}

