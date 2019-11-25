package typings.webpagetest.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotOptions extends js.Object {
  /** returns the page screenshot at the Document Complete point (i.e.: when window.onload was fired) */
  var documentComplete: js.UndefOr[Boolean] = js.undefined
  /** returns the full resolution screenshot in PNG format if available */
  var fullResolution: js.UndefOr[Boolean] = js.undefined
  /** returns the page screenshot at the Start Render point (i.e.: when something was first displayed on screen) */
  var startRender: js.UndefOr[Boolean] = js.undefined
}

object ScreenshotOptions {
  @scala.inline
  def apply(
    documentComplete: js.UndefOr[Boolean] = js.undefined,
    fullResolution: js.UndefOr[Boolean] = js.undefined,
    startRender: js.UndefOr[Boolean] = js.undefined
  ): ScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(documentComplete)) __obj.updateDynamic("documentComplete")(documentComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(fullResolution)) __obj.updateDynamic("fullResolution")(fullResolution.asInstanceOf[js.Any])
    if (!js.isUndefined(startRender)) __obj.updateDynamic("startRender")(startRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotOptions]
  }
}

