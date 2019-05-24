package typings
package xmlcreateLib.libNodesXmlAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlAttributeOptions extends js.Object {
  /**
    * The name of the attribute.
    */
  var name: java.lang.String
  /**
    * Whether to replace any invalid characters in the name of the attribute
    * with the Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInName: js.UndefOr[scala.Boolean] = js.undefined
}

object IXmlAttributeOptions {
  @scala.inline
  def apply(name: java.lang.String, replaceInvalidCharsInName: js.UndefOr[scala.Boolean] = js.undefined): IXmlAttributeOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(replaceInvalidCharsInName)) __obj.updateDynamic("replaceInvalidCharsInName")(replaceInvalidCharsInName)
    __obj.asInstanceOf[IXmlAttributeOptions]
  }
}

