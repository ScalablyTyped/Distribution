package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionInfoAndBoundSpan extends js.Object {
  var definitions: js.UndefOr[js.Array[DefinitionInfo]] = js.undefined
  var textSpan: TextSpan
}

object DefinitionInfoAndBoundSpan {
  @scala.inline
  def apply(textSpan: TextSpan, definitions: js.Array[DefinitionInfo] = null): DefinitionInfoAndBoundSpan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("textSpan")(textSpan)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    __obj.asInstanceOf[DefinitionInfoAndBoundSpan]
  }
}

