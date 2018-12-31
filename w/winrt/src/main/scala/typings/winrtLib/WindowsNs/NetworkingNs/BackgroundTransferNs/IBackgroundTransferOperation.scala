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

