package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[wegameDashApiLib.wxNs.typesNs.ButtonStyle] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var `type`: wegameDashApiLib.wxNs.typesNs.ButtonType
}

object Anon_Image {
  @scala.inline
  def apply(
    `type`: wegameDashApiLib.wxNs.typesNs.ButtonType,
    image: java.lang.String = null,
    style: wegameDashApiLib.wxNs.typesNs.ButtonStyle = null,
    text: java.lang.String = null
  ): Anon_Image = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (image != null) __obj.updateDynamic("image")(image)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Image]
  }
}

