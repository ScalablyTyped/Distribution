package typings.tableau.tableau

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Error Classes
trait TableauException extends Error {
  var tableauSoftwareErrorCode: ErrorCode
}

object TableauException {
  @scala.inline
  def apply(message: String, name: String, tableauSoftwareErrorCode: ErrorCode, stack: String = null): TableauException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tableauSoftwareErrorCode = tableauSoftwareErrorCode.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableauException]
  }
}

