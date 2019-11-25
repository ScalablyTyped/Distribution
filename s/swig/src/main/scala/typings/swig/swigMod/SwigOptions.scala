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
    if (!js.isUndefined(autoescape)) __obj.updateDynamic("autoescape")(autoescape.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cmtControls != null) __obj.updateDynamic("cmtControls")(cmtControls.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (tagControls != null) __obj.updateDynamic("tagControls")(tagControls.asInstanceOf[js.Any])
    if (varControls != null) __obj.updateDynamic("varControls")(varControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwigOptions]
  }
}

