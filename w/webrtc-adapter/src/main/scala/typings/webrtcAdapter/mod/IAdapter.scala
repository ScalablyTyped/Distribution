package typings.webrtcAdapter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAdapter extends js.Object {
  var browserDetails: IBrowserDetails
  var browserShim: js.UndefOr[IChromeShim | IEdgeShim | IFirefoxShim | ISafariShim] = js.undefined
  var commonShim: ICommonShim
  def disableLog(disable: Boolean): Unit
  def disableWarnings(disable: Boolean): Unit
  def extractVersion(uastring: String, expr: String, pos: Double): Double
}

object IAdapter {
  @scala.inline
  def apply(
    browserDetails: IBrowserDetails,
    commonShim: ICommonShim,
    disableLog: Boolean => Unit,
    disableWarnings: Boolean => Unit,
    extractVersion: (String, String, Double) => Double,
    browserShim: IChromeShim | IEdgeShim | IFirefoxShim | ISafariShim = null
  ): IAdapter = {
    val __obj = js.Dynamic.literal(browserDetails = browserDetails.asInstanceOf[js.Any], commonShim = commonShim.asInstanceOf[js.Any], disableLog = js.Any.fromFunction1(disableLog), disableWarnings = js.Any.fromFunction1(disableWarnings), extractVersion = js.Any.fromFunction3(extractVersion))
    if (browserShim != null) __obj.updateDynamic("browserShim")(browserShim.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAdapter]
  }
}

