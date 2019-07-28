package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.TypePredicateKind.This
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThisTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  @JSName("kind")
  var kind_ThisTypePredicate: This
}

object ThisTypePredicate {
  @scala.inline
  def apply(kind: This, `type`: Type): ThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ThisTypePredicate]
  }
}

