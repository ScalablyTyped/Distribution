package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: js.UndefOr[java.lang.String] = js.undefined
  var style: wegameDashApiLib.wxNs.typesNs.ButtonStyle
  var text: js.UndefOr[java.lang.String] = js.undefined
  var `type`: wegameDashApiLib.wxNs.typesNs.ButtonType
}

object Anon_Image {
  @scala.inline
  def apply(
    style: wegameDashApiLib.wxNs.typesNs.ButtonStyle,
    `type`: wegameDashApiLib.wxNs.typesNs.ButtonType,
    image: java.lang.String = null,
    text: java.lang.String = null
  ): Anon_Image = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("style")(style)
    if (image != null) __obj.updateDynamic("image")(image)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Image]
  }
}

