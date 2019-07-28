package typings.xmlDashJs

import typings.xmlDashJs.xmlDashJsMod.DeclarationAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributesDeclarationAttributes extends js.Object {
  var attributes: js.UndefOr[DeclarationAttributes] = js.undefined
}

object Anon_AttributesDeclarationAttributes {
  @scala.inline
  def apply(attributes: DeclarationAttributes = null): Anon_AttributesDeclarationAttributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[Anon_AttributesDeclarationAttributes]
  }
}

