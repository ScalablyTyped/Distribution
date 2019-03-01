package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  var parameterIndex: scala.Double
  var parameterName: java.lang.String
}

object IdentifierTypePredicate {
  @scala.inline
  def apply(
    kind: TypePredicateKind,
    parameterIndex: scala.Double,
    parameterName: java.lang.String,
    `type`: Type
  ): IdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("parameterIndex")(parameterIndex)
    __obj.updateDynamic("parameterName")(parameterName)
    __obj.asInstanceOf[IdentifierTypePredicate]
  }
}

