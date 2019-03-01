package typings
package xmlDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var _attributes: js.UndefOr[xmlDashJsLib.xmlDashJsMod.DeclarationAttributes] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(_attributes: xmlDashJsLib.xmlDashJsMod.DeclarationAttributes = null): Anon_Attributes = {
    val __obj = js.Dynamic.literal()
    if (_attributes != null) __obj.updateDynamic("_attributes")(_attributes)
    __obj.asInstanceOf[Anon_Attributes]
  }
}

