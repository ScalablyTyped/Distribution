package typings.webpackBlocksAssets.mod.css

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  var context: js.UndefOr[String] = js.undefined
  var emitFile: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String | NameFunction] = js.undefined
  var outputPath: js.UndefOr[String | PathFunction] = js.undefined
  var postTransformPublicPath: js.UndefOr[js.Function1[/* p */ String, String]] = js.undefined
  var publicPath: js.UndefOr[String | PathFunction] = js.undefined
  var regExp: js.UndefOr[RegExp] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(
    context: String = null,
    emitFile: js.UndefOr[Boolean] = js.undefined,
    name: String | NameFunction = null,
    outputPath: String | PathFunction = null,
    postTransformPublicPath: /* p */ String => String = null,
    publicPath: String | PathFunction = null,
    regExp: RegExp = null
  ): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(emitFile)) __obj.updateDynamic("emitFile")(emitFile.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    if (postTransformPublicPath != null) __obj.updateDynamic("postTransformPublicPath")(js.Any.fromFunction1(postTransformPublicPath))
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (regExp != null) __obj.updateDynamic("regExp")(regExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

