package typings
package swigDashEmailDashTemplatesLib.swigDashEmailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwigEmailTemplatesOptions
  extends swigLib.swigMod.SwigOptions {
  var juice: js.UndefOr[js.Any] = js.undefined
  var rewrite: js.UndefOr[js.Function1[/* $ */ jqueryLib.JQueryStatic, scala.Unit]] = js.undefined
  var rewriteUrl: js.UndefOr[js.Function1[/* href */ java.lang.String, java.lang.String]] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object SwigEmailTemplatesOptions {
  @scala.inline
  def apply(
    autoescape: js.UndefOr[scala.Boolean] = js.undefined,
    cache: js.Any = null,
    cmtControls: js.Array[java.lang.String] = null,
    juice: js.Any = null,
    loader: swigLib.swigMod.TemplateLoader = null,
    locals: js.Any = null,
    rewrite: js.Function1[/* $ */ jqueryLib.JQueryStatic, scala.Unit] = null,
    rewriteUrl: js.Function1[/* href */ java.lang.String, java.lang.String] = null,
    root: java.lang.String = null,
    tagControls: js.Array[java.lang.String] = null,
    varControls: js.Array[java.lang.String] = null
  ): SwigEmailTemplatesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoescape)) __obj.updateDynamic("autoescape")(autoescape)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cmtControls != null) __obj.updateDynamic("cmtControls")(cmtControls)
    if (juice != null) __obj.updateDynamic("juice")(juice)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (rewrite != null) __obj.updateDynamic("rewrite")(rewrite)
    if (rewriteUrl != null) __obj.updateDynamic("rewriteUrl")(rewriteUrl)
    if (root != null) __obj.updateDynamic("root")(root)
    if (tagControls != null) __obj.updateDynamic("tagControls")(tagControls)
    if (varControls != null) __obj.updateDynamic("varControls")(varControls)
    __obj.asInstanceOf[SwigEmailTemplatesOptions]
  }
}

