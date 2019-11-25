package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypePredicateBase extends js.Object {
  var kind: TypePredicateKind
  var `type`: js.UndefOr[Type] = js.undefined
}

object TypePredicateBase {
  @scala.inline
  def apply(kind: TypePredicateKind, `type`: Type = null): TypePredicateBase = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePredicateBase]
  }
}

