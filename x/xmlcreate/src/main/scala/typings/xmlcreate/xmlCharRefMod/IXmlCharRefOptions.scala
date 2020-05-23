package typings.xmlcreate.xmlCharRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlCharRefOptions extends js.Object {
  /**
    * The character to represent using the reference.
    */
  var char: String
  /**
    * Whether to use the hexadecimal or decimal representation for the
    * reference. Defaults to false.
    */
  var hex: js.UndefOr[Boolean] = js.undefined
}

object IXmlCharRefOptions {
  @scala.inline
  def apply(char: String, hex: js.UndefOr[Boolean] = js.undefined): IXmlCharRefOptions = {
    val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any])
    if (!js.isUndefined(hex)) __obj.updateDynamic("hex")(hex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlCharRefOptions]
  }
}

