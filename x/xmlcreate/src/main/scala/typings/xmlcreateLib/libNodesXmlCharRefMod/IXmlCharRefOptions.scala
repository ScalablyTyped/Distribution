package typings
package xmlcreateLib.libNodesXmlCharRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlCharRefOptions extends js.Object {
  /**
    * The character to represent using the reference.
    */
  var char: java.lang.String
  /**
    * Whether to use the hexadecimal or decimal representation for the
    * reference. Defaults to false.
    */
  var hex: js.UndefOr[scala.Boolean] = js.undefined
}

object IXmlCharRefOptions {
  @scala.inline
  def apply(char: java.lang.String, hex: js.UndefOr[scala.Boolean] = js.undefined): IXmlCharRefOptions = {
    val __obj = js.Dynamic.literal(char = char)
    if (!js.isUndefined(hex)) __obj.updateDynamic("hex")(hex)
    __obj.asInstanceOf[IXmlCharRefOptions]
  }
}

