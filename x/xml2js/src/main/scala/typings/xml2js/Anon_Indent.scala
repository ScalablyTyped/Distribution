package typings.xml2js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Indent extends js.Object {
  var indent: js.UndefOr[String] = js.undefined
  var newline: js.UndefOr[String] = js.undefined
  var pretty: js.UndefOr[Boolean] = js.undefined
}

object Anon_Indent {
  @scala.inline
  def apply(indent: String = null, newline: String = null, pretty: js.UndefOr[Boolean] = js.undefined): Anon_Indent = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Indent]
  }
}

