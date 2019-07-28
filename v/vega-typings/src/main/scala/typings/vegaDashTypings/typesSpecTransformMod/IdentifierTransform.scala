package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.vegaDashTypingsStrings.identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierTransform extends _Transforms {
  var as: String
  var `type`: identifier
}

object IdentifierTransform {
  @scala.inline
  def apply(as: String, `type`: identifier): IdentifierTransform = {
    val __obj = js.Dynamic.literal(as = as)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IdentifierTransform]
  }
}

