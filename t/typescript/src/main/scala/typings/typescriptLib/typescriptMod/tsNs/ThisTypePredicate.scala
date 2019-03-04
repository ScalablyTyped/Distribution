package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThisTypePredicate
  extends TypePredicateBase
     with TypePredicate

object ThisTypePredicate {
  @scala.inline
  def apply(kind: TypePredicateKind, `type`: Type): ThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ThisTypePredicate]
  }
}

