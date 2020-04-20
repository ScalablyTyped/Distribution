package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the result of the PlayReady-ND license fetch. */
trait INDLicenseFetchResult extends js.Object {
  /** Gets the custom data from a license fetch response. */
  var responseCustomData: INDCustomData
}

object INDLicenseFetchResult {
  @scala.inline
  def apply(responseCustomData: INDCustomData): INDLicenseFetchResult = {
    val __obj = js.Dynamic.literal(responseCustomData = responseCustomData.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDLicenseFetchResult]
  }
}

