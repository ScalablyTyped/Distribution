package typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer.ResponseInformation")
@js.native
class ResponseInformation () extends IResponseInformation {
  /* CompleteClass */
  override var actualUri: Uri = js.native
  /* CompleteClass */
  override var headers: IMapView[String, String] = js.native
  /* CompleteClass */
  override var isResumable: Boolean = js.native
  /* CompleteClass */
  override var statusCode: Double = js.native
}

