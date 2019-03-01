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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ThisTypePredicate]
  }
}

