package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** PdfHeadingDetection. */
trait PdfHeadingDetection extends js.Object {
  var fonts: js.UndefOr[js.Array[FontSetting]] = js.undefined
}

object PdfHeadingDetection {
  @scala.inline
  def apply(fonts: js.Array[FontSetting] = null): PdfHeadingDetection = {
    val __obj = js.Dynamic.literal()
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfHeadingDetection]
  }
}

