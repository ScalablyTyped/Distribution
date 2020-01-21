package typings.typescriptServices.TypeScript

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
    if (leadingTrivia != null) __obj.updateDynamic("leadingTrivia")(leadingTrivia.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (trailingTrivia != null) __obj.updateDynamic("trailingTrivia")(trailingTrivia.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITokenInfo]
  }
}

