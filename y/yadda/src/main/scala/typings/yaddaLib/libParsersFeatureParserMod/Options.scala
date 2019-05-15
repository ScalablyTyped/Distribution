package typings
package yaddaLib.libParsersFeatureParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var language: js.UndefOr[
    yaddaLib.libLocalisationLanguageMod.^[yaddaLib.libLocalisationLanguageMod.Library]
  ] = js.undefined
  var leftPlaceholderChar: java.lang.String
  var rightPlaceholderChar: java.lang.String
}

object Options {
  @scala.inline
  def apply(
    leftPlaceholderChar: java.lang.String,
    rightPlaceholderChar: java.lang.String,
    language: yaddaLib.libLocalisationLanguageMod.^[yaddaLib.libLocalisationLanguageMod.Library] = null
  ): Options = {
    val __obj = js.Dynamic.literal(leftPlaceholderChar = leftPlaceholderChar, rightPlaceholderChar = rightPlaceholderChar)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[Options]
  }
}

