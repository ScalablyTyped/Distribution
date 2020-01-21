package typings.swaggerParser

import org.scalablytyped.runtime.StringDictionary
import typings.swaggerParser.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJson
  extends /* key */ StringDictionary[js.UndefOr[ParserOptions | Boolean]] {
  var json: js.UndefOr[ParserOptions | Boolean] = js.undefined
  var text: js.UndefOr[(ParserOptions with AnonEncoding) | Boolean] = js.undefined
  var yaml: js.UndefOr[ParserOptions | Boolean] = js.undefined
}

object AnonJson {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[ParserOptions | Boolean]] = null,
    json: ParserOptions | Boolean = null,
    text: (ParserOptions with AnonEncoding) | Boolean = null,
    yaml: ParserOptions | Boolean = null
  ): AnonJson = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (yaml != null) __obj.updateDynamic("yaml")(yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJson]
  }
}

