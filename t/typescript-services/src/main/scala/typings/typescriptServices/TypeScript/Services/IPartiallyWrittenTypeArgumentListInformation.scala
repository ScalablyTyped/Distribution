package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.PositionedToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPartiallyWrittenTypeArgumentListInformation extends js.Object {
  var argumentIndex: Double
  var genericIdentifer: PositionedToken
  var lessThanToken: PositionedToken
}

object IPartiallyWrittenTypeArgumentListInformation {
  @scala.inline
  def apply(argumentIndex: Double, genericIdentifer: PositionedToken, lessThanToken: PositionedToken): IPartiallyWrittenTypeArgumentListInformation = {
    val __obj = js.Dynamic.literal(argumentIndex = argumentIndex.asInstanceOf[js.Any], genericIdentifer = genericIdentifer.asInstanceOf[js.Any], lessThanToken = lessThanToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPartiallyWrittenTypeArgumentListInformation]
  }
}

