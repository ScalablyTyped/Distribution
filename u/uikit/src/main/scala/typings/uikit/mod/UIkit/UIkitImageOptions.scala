package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitImageOptions extends js.Object {
  var dataSrc: js.UndefOr[String] = js.undefined
  var dataSrcset: js.UndefOr[String | Boolean] = js.undefined
  var height: js.UndefOr[String | Boolean] = js.undefined
  var offsetLeft: js.UndefOr[String | Double] = js.undefined
  var offsetTop: js.UndefOr[String] = js.undefined
  var sizes: js.UndefOr[String | Boolean] = js.undefined
  var target: js.UndefOr[String | Boolean] = js.undefined
  var width: js.UndefOr[String | Boolean] = js.undefined
}

object UIkitImageOptions {
  @scala.inline
  def apply(
    dataSrc: String = null,
    dataSrcset: String | Boolean = null,
    height: String | Boolean = null,
    offsetLeft: String | Double = null,
    offsetTop: String = null,
    sizes: String | Boolean = null,
    target: String | Boolean = null,
    width: String | Boolean = null
  ): UIkitImageOptions = {
    val __obj = js.Dynamic.literal()
    if (dataSrc != null) __obj.updateDynamic("dataSrc")(dataSrc.asInstanceOf[js.Any])
    if (dataSrcset != null) __obj.updateDynamic("dataSrcset")(dataSrcset.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitImageOptions]
  }
}

