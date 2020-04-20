package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferOperation extends js.Object {
  var costPolicy: BackgroundTransferCostPolicy
  var group: String
  var guid: String
  var method: String
  var requestedUri: Uri
  def getResponseInformation(): ResponseInformation
  def getResultStreamAt(position: Double): IInputStream
}

object IBackgroundTransferOperation {
  @scala.inline
  def apply(
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: () => ResponseInformation,
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    requestedUri: Uri
  ): IBackgroundTransferOperation = {
    val __obj = js.Dynamic.literal(costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTransferOperation]
  }
}

