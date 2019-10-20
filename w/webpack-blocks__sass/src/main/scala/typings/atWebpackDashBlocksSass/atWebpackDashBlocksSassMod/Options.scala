package typings.atWebpackDashBlocksSass.atWebpackDashBlocksSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var includePaths: js.UndefOr[js.Array[String]] = js.undefined
  var indentedSyntax: js.UndefOr[Boolean] = js.undefined
  var outputStyle: js.UndefOr[String] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    includePaths: js.Array[String] = null,
    indentedSyntax: js.UndefOr[Boolean] = js.undefined,
    outputStyle: String = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths)
    if (!js.isUndefined(indentedSyntax)) __obj.updateDynamic("indentedSyntax")(indentedSyntax)
    if (outputStyle != null) __obj.updateDynamic("outputStyle")(outputStyle)
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    __obj.asInstanceOf[Options]
  }
}

