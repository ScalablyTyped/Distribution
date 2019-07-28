package typings.typescript.typescriptMod

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
    val __obj = js.Dynamic.literal(isReadonly = isReadonly)
    __obj.updateDynamic("type")(`type`)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration)
    __obj.asInstanceOf[IndexInfo]
  }
}

