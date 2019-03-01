package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponseInformation extends js.Object {
  var actualUri: winrtLib.WindowsNs.FoundationNs.Uri
  var headers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String]
  var isResumable: scala.Boolean
  var statusCode: scala.Double
}

object IResponseInformation {
  @scala.inline
  def apply(
    actualUri: winrtLib.WindowsNs.FoundationNs.Uri,
    headers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String],
    isResumable: scala.Boolean,
    statusCode: scala.Double
  ): IResponseInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actualUri")(actualUri)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("isResumable")(isResumable)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[IResponseInformation]
  }
}

