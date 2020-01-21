package typings.xmlJs

import typings.xmlJs.mod.DeclarationAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributesDeclarationAttributes extends js.Object {
  var attributes: js.UndefOr[DeclarationAttributes] = js.undefined
}

object AnonAttributesDeclarationAttributes {
  @scala.inline
  def apply(attributes: DeclarationAttributes = null): AnonAttributesDeclarationAttributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributesDeclarationAttributes]
  }
}

