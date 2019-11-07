package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  @JSName("kind")
  var kind_IdentifierTypePredicate: typings.typescript.typescriptMod.TypePredicateKind.Identifier
  var parameterIndex: Double
  var parameterName: String
  @JSName("type")
  var type_IdentifierTypePredicate: Type
}

object IdentifierTypePredicate {
  @scala.inline
  def apply(
    kind: typings.typescript.typescriptMod.TypePredicateKind.Identifier,
    parameterIndex: Double,
    parameterName: String,
    `type`: Type
  ): IdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind, parameterIndex = parameterIndex, parameterName = parameterName)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IdentifierTypePredicate]
  }
}

