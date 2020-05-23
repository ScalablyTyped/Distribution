package typings.xmlJs.anon

import typings.xmlJs.mod.DeclarationAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributesDeclarationAttributes extends js.Object {
  var attributes: js.UndefOr[DeclarationAttributes] = js.undefined
}

object AttributesDeclarationAttributes {
  @scala.inline
  def apply(attributes: DeclarationAttributes = null): AttributesDeclarationAttributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesDeclarationAttributes]
  }
}

