package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenInfo extends js.Object {
  var leadingTrivia: js.UndefOr[js.Array[ISyntaxTrivia]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var trailingTrivia: js.UndefOr[js.Array[ISyntaxTrivia]] = js.undefined
}

object ITokenInfo {
  @scala.inline
  def apply(
    leadingTrivia: js.Array[ISyntaxTrivia] = null,
    text: String = null,
    trailingTrivia: js.Array[ISyntaxTrivia] = null
  ): ITokenInfo = {
    val __obj = js.Dynamic.literal()
    if (leadingTrivia != null) __obj.updateDynamic("leadingTrivia")(leadingTrivia)
    if (text != null) __obj.updateDynamic("text")(text)
    if (trailingTrivia != null) __obj.updateDynamic("trailingTrivia")(trailingTrivia)
    __obj.asInstanceOf[ITokenInfo]
  }
}

