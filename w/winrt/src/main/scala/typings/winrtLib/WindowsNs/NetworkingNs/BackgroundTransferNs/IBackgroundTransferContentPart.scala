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

object IBackgroundTransferContentPart {
  @scala.inline
  def apply(
    setFile: js.Function1[winrtLib.WindowsNs.StorageNs.IStorageFile, scala.Unit],
    setHeader: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setText: js.Function1[java.lang.String, scala.Unit]
  ): IBackgroundTransferContentPart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFile")(setFile)
    __obj.updateDynamic("setHeader")(setHeader)
    __obj.updateDynamic("setText")(setText)
    __obj.asInstanceOf[IBackgroundTransferContentPart]
  }
}

