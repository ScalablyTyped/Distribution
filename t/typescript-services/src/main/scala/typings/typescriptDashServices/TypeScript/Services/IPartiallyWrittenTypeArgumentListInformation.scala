package typings.typescriptDashServices.TypeScript.Services

import typings.typescriptDashServices.TypeScript.PositionedToken
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
    val __obj = js.Dynamic.literal(argumentIndex = argumentIndex, genericIdentifer = genericIdentifer, lessThanToken = lessThanToken)
  
    __obj.asInstanceOf[IPartiallyWrittenTypeArgumentListInformation]
  }
}

