package typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs

import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
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
    val __obj = js.Dynamic.literal(costPolicy = costPolicy, getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group, guid = guid, method = method, requestedUri = requestedUri)
  
    __obj.asInstanceOf[IBackgroundTransferOperation]
  }
}

