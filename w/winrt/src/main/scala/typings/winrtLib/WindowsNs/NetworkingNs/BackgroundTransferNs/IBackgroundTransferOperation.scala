package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferOperation extends js.Object {
  var costPolicy: BackgroundTransferCostPolicy
  var group: java.lang.String
  var guid: java.lang.String
  var method: java.lang.String
  var requestedUri: winrtLib.WindowsNs.FoundationNs.Uri
  def getResponseInformation(): ResponseInformation
  def getResultStreamAt(position: scala.Double): winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream
}

object IBackgroundTransferOperation {
  @scala.inline
  def apply(
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: js.Function0[ResponseInformation],
    getResultStreamAt: js.Function1[scala.Double, winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream],
    group: java.lang.String,
    guid: java.lang.String,
    method: java.lang.String,
    requestedUri: winrtLib.WindowsNs.FoundationNs.Uri
  ): IBackgroundTransferOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("costPolicy")(costPolicy)
    __obj.updateDynamic("getResponseInformation")(getResponseInformation)
    __obj.updateDynamic("getResultStreamAt")(getResultStreamAt)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("guid")(guid)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("requestedUri")(requestedUri)
    __obj.asInstanceOf[IBackgroundTransferOperation]
  }
}

