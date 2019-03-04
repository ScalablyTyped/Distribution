package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierTransform extends _Transforms {
  var as: java.lang.String
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.identifier
}

object IdentifierTransform {
  @scala.inline
  def apply(as: java.lang.String, `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.identifier): IdentifierTransform = {
    val __obj = js.Dynamic.literal(as = as)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IdentifierTransform]
  }
}

