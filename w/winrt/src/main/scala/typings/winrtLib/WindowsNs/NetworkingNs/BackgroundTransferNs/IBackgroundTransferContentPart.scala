package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBackgroundTransferContentPart extends js.Object {
  def setFile(value: winrtLib.WindowsNs.StorageNs.IStorageFile): scala.Unit
  def setHeader(headerName: java.lang.String, headerValue: java.lang.String): scala.Unit
  def setText(value: java.lang.String): scala.Unit
}

