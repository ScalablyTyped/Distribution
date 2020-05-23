package typings.xml.mod

import typings.xml.anon.Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  /**
    * Add default xml declaration (default false)
    */
  var declaration: js.UndefOr[Boolean | Encoding] = js.undefined
  /**
    * String used for tab, defaults to no tabs (compressed)
    */
  var indent: js.UndefOr[String] = js.undefined
  /**
    * Return the result as a `stream` (default false)
    */
  var stream: js.UndefOr[Boolean] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    declaration: Boolean | Encoding = null,
    indent: String = null,
    stream: js.UndefOr[Boolean] = js.undefined
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

