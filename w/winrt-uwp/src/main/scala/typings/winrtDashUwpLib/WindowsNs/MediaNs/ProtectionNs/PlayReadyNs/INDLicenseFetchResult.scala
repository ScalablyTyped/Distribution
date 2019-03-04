package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

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
    val __obj = js.Dynamic.literal(responseCustomData = responseCustomData)
  
    __obj.asInstanceOf[INDLicenseFetchResult]
  }
}

