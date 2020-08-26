package typings.twemojiParser.mod

import typings.twemojiParser.twemojiParserStrings.png
import typings.twemojiParser.twemojiParserStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsingOptions extends js.Object {
  /**
    * @default 'svg'
    */
  var assetType: js.UndefOr[png | svg] = js.native
  var buildUrl: js.UndefOr[js.Function2[/* codepoints */ String, /* assetType */ String, String]] = js.native
}

object ParsingOptions {
  @scala.inline
  def apply(): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsingOptions]
  }
  @scala.inline
  implicit class ParsingOptionsOps[Self <: ParsingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssetType(value: png | svg): Self = this.set("assetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetType: Self = this.set("assetType", js.undefined)
    @scala.inline
    def setBuildUrl(value: (/* codepoints */ String, /* assetType */ String) => String): Self = this.set("buildUrl", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBuildUrl: Self = this.set("buildUrl", js.undefined)
  }
  
}

