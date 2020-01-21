package typings.xmlJs

import typings.xmlJs.mod.DeclarationAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes extends js.Object {
  var _attributes: js.UndefOr[DeclarationAttributes] = js.undefined
}

object AnonAttributes {
  @scala.inline
  def apply(_attributes: DeclarationAttributes = null): AnonAttributes = {
    val __obj = js.Dynamic.literal()
    if (_attributes != null) __obj.updateDynamic("_attributes")(_attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes]
  }
}

