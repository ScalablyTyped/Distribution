package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for getting chat capabilities. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatCapabilitiesManager")
@js.native
abstract class ChatCapabilitiesManager () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Chat.ChatCapabilitiesManager")
@js.native
object ChatCapabilitiesManager extends js.Object {
  /**
    * Asynchronously gets the locally cached Rich Communication Services (RCS) chat capabilities for the specified phone number.
    * @param address The phone number for which to get the RCS chat capabilites
    * @return The locally cached RCS chat capabilities.
    */
  def getCachedCapabilitiesAsync(address: String): IPromiseWithIAsyncOperation[ChatCapabilities] = js.native
  /**
    * Asynchronously gets the Rich Communication Services (RCS) chat capabilities for the specified phone number from the service provider.
    * @param address The phone number for which to get the RCS chat capabilities.
    * @return The RCS chat capabilities from the service provider.
    */
  def getCapabilitiesFromNetworkAsync(address: String): IPromiseWithIAsyncOperation[ChatCapabilities] = js.native
}

