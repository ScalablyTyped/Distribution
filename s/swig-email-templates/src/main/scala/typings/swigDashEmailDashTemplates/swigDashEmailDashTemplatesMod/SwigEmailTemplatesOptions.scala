package typings.swigDashEmailDashTemplates.swigDashEmailDashTemplatesMod

import typings.jquery.JQueryStatic
import typings.swig.swigMod.SwigOptions
import typings.swig.swigMod.TemplateLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwigEmailTemplatesOptions extends SwigOptions {
  var juice: js.UndefOr[js.Any] = js.undefined
  var rewrite: js.UndefOr[js.Function1[/* $ */ JQueryStatic, Unit]] = js.undefined
  var rewriteUrl: js.UndefOr[js.Function1[/* href */ String, String]] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object SwigEmailTemplatesOptions {
  @scala.inline
  def apply(
    autoescape: js.UndefOr[Boolean] = js.undefined,
    cache: js.Any = null,
    cmtControls: js.Array[String] = null,
    juice: js.Any = null,
    loader: TemplateLoader = null,
    locals: js.Any = null,
    rewrite: /* $ */ JQueryStatic => Unit = null,
    rewriteUrl: /* href */ String => String = null,
    root: String = null,
    tagControls: js.Array[String] = null,
    varControls: js.Array[String] = null
  ): SwigEmailTemplatesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoescape)) __obj.updateDynamic("autoescape")(autoescape)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cmtControls != null) __obj.updateDynamic("cmtControls")(cmtControls)
    if (juice != null) __obj.updateDynamic("juice")(juice)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (rewrite != null) __obj.updateDynamic("rewrite")(js.Any.fromFunction1(rewrite))
    if (rewriteUrl != null) __obj.updateDynamic("rewriteUrl")(js.Any.fromFunction1(rewriteUrl))
    if (root != null) __obj.updateDynamic("root")(root)
    if (tagControls != null) __obj.updateDynamic("tagControls")(tagControls)
    if (varControls != null) __obj.updateDynamic("varControls")(varControls)
    __obj.asInstanceOf[SwigEmailTemplatesOptions]
  }
}

