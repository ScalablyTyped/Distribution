package typings.typescript.typescriptMod

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
    val __obj = js.Dynamic.literal(textSpan = textSpan.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionInfoAndBoundSpan]
  }
}

