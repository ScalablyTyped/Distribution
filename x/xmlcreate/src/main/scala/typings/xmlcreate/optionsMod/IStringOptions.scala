package typings.xmlcreate.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringOptions extends js.Object {
  /**
    * Whether double quotes or single quotes should be used in XML attributes.
    * By default, single quotes are used.
    */
  var doubleQuotes: js.UndefOr[Boolean] = js.undefined
  /**
    * The indent string used for pretty-printing. The default indent string is
    * four spaces.
    */
  var indent: js.UndefOr[String] = js.undefined
  /**
    * The newline string used for pretty-printing. The default newline string
    * is "\n".
    */
  var newline: js.UndefOr[String] = js.undefined
  /**
    * Whether pretty-printing is enabled. By default, pretty-printing is
    * enabled.
    */
  var pretty: js.UndefOr[Boolean] = js.undefined
}

object IStringOptions {
  @scala.inline
  def apply(
    doubleQuotes: js.UndefOr[Boolean] = js.undefined,
    indent: String = null,
    newline: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined
  ): IStringOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doubleQuotes)) __obj.updateDynamic("doubleQuotes")(doubleQuotes.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStringOptions]
  }
}

