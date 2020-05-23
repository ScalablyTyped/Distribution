package typings.xml2js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indent extends js.Object {
  var indent: js.UndefOr[String] = js.undefined
  var newline: js.UndefOr[String] = js.undefined
  var pretty: js.UndefOr[Boolean] = js.undefined
}

object Indent {
  @scala.inline
  def apply(indent: String = null, newline: String = null, pretty: js.UndefOr[Boolean] = js.undefined): Indent = {
    val __obj = js.Dynamic.literal()
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indent]
  }
}

