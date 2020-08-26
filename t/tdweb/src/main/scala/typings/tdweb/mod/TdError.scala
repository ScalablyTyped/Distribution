package typings.tdweb.mod

import typings.tdweb.tdwebStrings.error
import typings.tdweb.tdwebStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TdError extends js.Object {
  var `@extra`: js.UndefOr[string] = js.native
  var `@type`: error = js.native
  /**
    * Error code; subject to future changes. If the error code is 406, the error message
    * must not be processed in any way and must not be displayed to the user
    */
  var code: Double = js.native
  /** Error message; subject to future changes */
  var message: String = js.native
}

object TdError {
  @scala.inline
  def apply(`@type`: error, code: Double, message: String): TdError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TdError]
  }
  @scala.inline
  implicit class TdErrorOps[Self <: TdError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `set@type`(value: error): Self = this.set("@type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def `set@extra`(value: string): Self = this.set("@extra", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete@extra`: Self = this.set("@extra", js.undefined)
  }
  
}

