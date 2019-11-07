package typings.typescript.typescriptMod

import typings.typescript.typescriptMod.TypePredicateKind.AssertsIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertsIdentifierTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  @JSName("kind")
  var kind_AssertsIdentifierTypePredicate: AssertsIdentifier
  var parameterIndex: Double
  var parameterName: String
}

object AssertsIdentifierTypePredicate {
  @scala.inline
  def apply(kind: AssertsIdentifier, parameterIndex: Double, parameterName: String, `type`: Type = null): AssertsIdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind, parameterIndex = parameterIndex, parameterName = parameterName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AssertsIdentifierTypePredicate]
  }
}

