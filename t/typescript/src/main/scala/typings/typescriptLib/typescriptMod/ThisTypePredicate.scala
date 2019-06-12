package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThisTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  @JSName("kind")
  var kind_ThisTypePredicate: typescriptLib.typescriptMod.TypePredicateKind.This
}

object ThisTypePredicate {
  @scala.inline
  def apply(kind: typescriptLib.typescriptMod.TypePredicateKind.This, `type`: Type): ThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ThisTypePredicate]
  }
}

