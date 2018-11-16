package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to search for chat messages in the ChatMessageStore . */
@JSGlobal("Windows.ApplicationModel.Chat.ChatSearchReader")
@js.native
abstract class ChatSearchReader () extends js.Object {
  /**
                   * Returns a batch of found items matching the search criteria.
                   * @return A list of items matching the search criteria.
                   */
  def readBatchAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Returns a batch of found items matching the search criteria.
                   * @param count The maximum number of items to return.
                   * @return A list of items matching the search criteria.
                   */
  def readBatchAsync(count: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
}

