package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of PDF conversion settings. */
trait PdfSettings extends js.Object {
  var heading: js.UndefOr[PdfHeadingDetection] = js.undefined
}

object PdfSettings {
  @scala.inline
  def apply(heading: PdfHeadingDetection = null): PdfSettings = {
    val __obj = js.Dynamic.literal()
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfSettings]
  }
}

