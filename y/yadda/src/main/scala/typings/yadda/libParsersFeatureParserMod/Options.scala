package typings.yadda.libParsersFeatureParserMod

import typings.yadda.libLocalisationLanguageMod.Library
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var language: js.UndefOr[typings.yadda.libLocalisationLanguageMod.^[Library]] = js.undefined
  var leftPlaceholderChar: String
  var rightPlaceholderChar: String
}

object Options {
  @scala.inline
  def apply(
    leftPlaceholderChar: String,
    rightPlaceholderChar: String,
    language: typings.yadda.libLocalisationLanguageMod.^[Library] = null
  ): Options = {
    val __obj = js.Dynamic.literal(leftPlaceholderChar = leftPlaceholderChar, rightPlaceholderChar = rightPlaceholderChar)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[Options]
  }
}

