package typings.twemojiParser.mod

import typings.twemojiParser.twemojiParserStrings.png
import typings.twemojiParser.twemojiParserStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsingOptions extends js.Object {
  /**
    * @default 'svg'
    */
  var assetType: js.UndefOr[png | svg] = js.undefined
  var buildUrl: js.UndefOr[js.Function2[/* codepoints */ String, /* assetType */ String, String]] = js.undefined
}

object ParsingOptions {
  @scala.inline
  def apply(
    assetType: png | svg = null,
    buildUrl: (/* codepoints */ String, /* assetType */ String) => String = null
  ): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    if (assetType != null) __obj.updateDynamic("assetType")(assetType.asInstanceOf[js.Any])
    if (buildUrl != null) __obj.updateDynamic("buildUrl")(js.Any.fromFunction2(buildUrl))
    __obj.asInstanceOf[ParsingOptions]
  }
}

