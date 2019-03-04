package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPartiallyWrittenTypeArgumentListInformation extends js.Object {
  var argumentIndex: scala.Double
  var genericIdentifer: typescriptDashServicesLib.TypeScriptNs.PositionedToken
  var lessThanToken: typescriptDashServicesLib.TypeScriptNs.PositionedToken
}

object IPartiallyWrittenTypeArgumentListInformation {
  @scala.inline
  def apply(
    argumentIndex: scala.Double,
    genericIdentifer: typescriptDashServicesLib.TypeScriptNs.PositionedToken,
    lessThanToken: typescriptDashServicesLib.TypeScriptNs.PositionedToken
  ): IPartiallyWrittenTypeArgumentListInformation = {
    val __obj = js.Dynamic.literal(argumentIndex = argumentIndex, genericIdentifer = genericIdentifer, lessThanToken = lessThanToken)
  
    __obj.asInstanceOf[IPartiallyWrittenTypeArgumentListInformation]
  }
}

