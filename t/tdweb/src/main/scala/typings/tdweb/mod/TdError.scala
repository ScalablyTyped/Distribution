package typings.tdweb.mod

import typings.tdweb.tdwebStrings.error
import typings.tdweb.tdwebStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TdError extends js.Object {
  var `@extra`: js.UndefOr[string] = js.undefined
  var `@type`: error
  /**
    * Error code; subject to future changes. If the error code is 406, the error message
    * must not be processed in any way and must not be displayed to the user
    */
  var code: Double
  /** Error message; subject to future changes */
  var message: String
}

object TdError {
  @scala.inline
  def apply(`@type`: error, code: Double, message: String, `@extra`: string = null): TdError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    if (`@extra` != null) __obj.updateDynamic("@extra")(`@extra`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TdError]
  }
}

