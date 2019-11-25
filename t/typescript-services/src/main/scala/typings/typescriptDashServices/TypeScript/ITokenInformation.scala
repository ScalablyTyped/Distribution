package typings.typescriptDashServices.TypeScript

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
    val __obj = js.Dynamic.literal(nextToken = nextToken.asInstanceOf[js.Any], previousToken = previousToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITokenInformation]
  }
}

