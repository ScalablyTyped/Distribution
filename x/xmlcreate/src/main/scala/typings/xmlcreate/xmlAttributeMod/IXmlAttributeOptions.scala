package typings.xmlcreate.xmlAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlAttributeOptions extends js.Object {
  /**
    * The name of the attribute.
    */
  var name: String
  /**
    * Whether to replace any invalid characters in the name of the attribute
    * with the Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInName: js.UndefOr[Boolean] = js.undefined
}

object IXmlAttributeOptions {
  @scala.inline
  def apply(name: String, replaceInvalidCharsInName: js.UndefOr[Boolean] = js.undefined): IXmlAttributeOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceInvalidCharsInName)) __obj.updateDynamic("replaceInvalidCharsInName")(replaceInvalidCharsInName.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlAttributeOptions]
  }
}

