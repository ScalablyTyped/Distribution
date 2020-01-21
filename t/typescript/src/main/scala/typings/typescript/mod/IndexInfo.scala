package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexInfo extends js.Object {
  var declaration: js.UndefOr[IndexSignatureDeclaration] = js.undefined
  var isReadonly: Boolean
  var `type`: Type
}

object IndexInfo {
  @scala.inline
  def apply(isReadonly: Boolean, `type`: Type, declaration: IndexSignatureDeclaration = null): IndexInfo = {
    val __obj = js.Dynamic.literal(isReadonly = isReadonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexInfo]
  }
}

