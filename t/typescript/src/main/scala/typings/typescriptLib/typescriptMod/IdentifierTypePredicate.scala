package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  @JSName("kind")
  var kind_IdentifierTypePredicate: typescriptLib.typescriptMod.TypePredicateKind.Identifier
  var parameterIndex: scala.Double
  var parameterName: java.lang.String
}

object IdentifierTypePredicate {
  @scala.inline
  def apply(
    kind: typescriptLib.typescriptMod.TypePredicateKind.Identifier,
    parameterIndex: scala.Double,
    parameterName: java.lang.String,
    `type`: Type
  ): IdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind, parameterIndex = parameterIndex, parameterName = parameterName)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IdentifierTypePredicate]
  }
}

