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
    setFile: winrtLib.WindowsNs.StorageNs.IStorageFile => scala.Unit,
    setHeader: (java.lang.String, java.lang.String) => scala.Unit,
    setText: java.lang.String => scala.Unit
  ): IBackgroundTransferContentPart = {
    val __obj = js.Dynamic.literal(setFile = js.Any.fromFunction1(setFile), setHeader = js.Any.fromFunction2(setHeader), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[IBackgroundTransferContentPart]
  }
}

