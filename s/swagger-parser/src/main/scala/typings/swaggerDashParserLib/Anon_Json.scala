package typings
package swaggerDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Json
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[swaggerDashParserLib.swaggerDashParserMod.ParserOptions | scala.Boolean]
    ] {
  var json: js.UndefOr[swaggerDashParserLib.swaggerDashParserMod.ParserOptions | scala.Boolean] = js.undefined
  var text: js.UndefOr[
    (swaggerDashParserLib.swaggerDashParserMod.ParserOptions with Anon_Encoding) | scala.Boolean
  ] = js.undefined
  var yaml: js.UndefOr[swaggerDashParserLib.swaggerDashParserMod.ParserOptions | scala.Boolean] = js.undefined
}

object Anon_Json {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[swaggerDashParserLib.swaggerDashParserMod.ParserOptions | scala.Boolean]
    ] = null,
    json: swaggerDashParserLib.swaggerDashParserMod.ParserOptions | scala.Boolean = null,
    text: (swaggerDashParserLib.swaggerDashParserMod.ParserOptions with Anon_Encoding) | scala.Boolean = null,
    yaml: swaggerDashParserLib.swaggerDashParserMod.ParserOptions | scala.Boolean = null
  ): Anon_Json = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (yaml != null) __obj.updateDynamic("yaml")(yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Json]
  }
}

