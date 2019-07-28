package typings.swig.swigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwigOptions extends js.Object {
  var autoescape: js.UndefOr[Boolean] = js.undefined
  var cache: js.UndefOr[js.Any] = js.undefined
  var cmtControls: js.UndefOr[js.Array[String]] = js.undefined
  var loader: js.UndefOr[TemplateLoader] = js.undefined
  var locals: js.UndefOr[js.Any] = js.undefined
  var tagControls: js.UndefOr[js.Array[String]] = js.undefined
  var varControls: js.UndefOr[js.Array[String]] = js.undefined
}

object SwigOptions {
  @scala.inline
  def apply(
    autoescape: js.UndefOr[Boolean] = js.undefined,
    cache: js.Any = null,
    cmtControls: js.Array[String] = null,
    loader: TemplateLoader = null,
    locals: js.Any = null,
    tagControls: js.Array[String] = null,
    varControls: js.Array[String] = null
  ): SwigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoescape)) __obj.updateDynamic("autoescape")(autoescape)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cmtControls != null) __obj.updateDynamic("cmtControls")(cmtControls)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (tagControls != null) __obj.updateDynamic("tagControls")(tagControls)
    if (varControls != null) __obj.updateDynamic("varControls")(varControls)
    __obj.asInstanceOf[SwigOptions]
  }
}

