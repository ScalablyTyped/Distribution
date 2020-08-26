package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundTransferOperation extends js.Object {
  var costPolicy: BackgroundTransferCostPolicy = js.native
  var group: String = js.native
  var guid: String = js.native
  var method: String = js.native
  var requestedUri: Uri = js.native
  def getResponseInformation(): ResponseInformation = js.native
  def getResultStreamAt(position: Double): IInputStream = js.native
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
  @scala.inline
  implicit class IBackgroundTransferOperationOps[Self <: IBackgroundTransferOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCostPolicy(value: BackgroundTransferCostPolicy): Self = this.set("costPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetResponseInformation(value: () => ResponseInformation): Self = this.set("getResponseInformation", js.Any.fromFunction0(value))
    @scala.inline
    def setGetResultStreamAt(value: Double => IInputStream): Self = this.set("getResultStreamAt", js.Any.fromFunction1(value))
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedUri(value: Uri): Self = this.set("requestedUri", value.asInstanceOf[js.Any])
  }
  
}

