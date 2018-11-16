package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart")
@js.native
class BackgroundTransferContentPart () extends IBackgroundTransferContentPart {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, fileName: java.lang.String) = this()
  /* CompleteClass */
  override def setFile(value: winrtLib.WindowsNs.StorageNs.IStorageFile): scala.Unit = js.native
  /* CompleteClass */
  override def setHeader(headerName: java.lang.String, headerValue: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def setText(value: java.lang.String): scala.Unit = js.native
}

