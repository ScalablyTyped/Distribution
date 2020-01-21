package typings.xml.mod

import typings.xml.AnonEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  /**
    * Add default xml declaration (default false)
    */
  var declaration: js.UndefOr[Boolean | AnonEncoding] = js.undefined
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
    declaration: Boolean | AnonEncoding = null,
    indent: String = null,
    stream: js.UndefOr[Boolean] = js.undefined
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

