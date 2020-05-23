package typings.xmlJs.anon

import typings.xmlJs.mod.DeclarationAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var _attributes: js.UndefOr[DeclarationAttributes] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(_attributes: DeclarationAttributes = null): Attributes = {
    val __obj = js.Dynamic.literal()
    if (_attributes != null) __obj.updateDynamic("_attributes")(_attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

