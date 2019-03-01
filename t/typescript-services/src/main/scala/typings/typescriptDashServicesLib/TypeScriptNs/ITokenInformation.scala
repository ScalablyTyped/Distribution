package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenInformation extends js.Object {
  var nextToken: ISyntaxToken
  var previousToken: ISyntaxToken
}

object ITokenInformation {
  @scala.inline
  def apply(nextToken: ISyntaxToken, previousToken: ISyntaxToken): ITokenInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nextToken")(nextToken)
    __obj.updateDynamic("previousToken")(previousToken)
    __obj.asInstanceOf[ITokenInformation]
  }
}

