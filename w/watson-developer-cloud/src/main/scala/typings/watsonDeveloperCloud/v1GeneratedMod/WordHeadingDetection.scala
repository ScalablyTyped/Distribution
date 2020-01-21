package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WordHeadingDetection. */
trait WordHeadingDetection extends js.Object {
  var fonts: js.UndefOr[js.Array[FontSetting]] = js.undefined
  var styles: js.UndefOr[js.Array[WordStyle]] = js.undefined
}

object WordHeadingDetection {
  @scala.inline
  def apply(fonts: js.Array[FontSetting] = null, styles: js.Array[WordStyle] = null): WordHeadingDetection = {
    val __obj = js.Dynamic.literal()
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordHeadingDetection]
  }
}

