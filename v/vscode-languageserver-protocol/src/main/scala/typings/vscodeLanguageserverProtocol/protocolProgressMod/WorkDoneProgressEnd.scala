package typings.vscodeLanguageserverProtocol.protocolProgressMod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.end
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkDoneProgressEnd extends js.Object {
  var kind: end
  /**
    * Optional, a final message indicating to for example indicate the outcome
    * of the operation.
    */
  var message: js.UndefOr[String] = js.undefined
}

object WorkDoneProgressEnd {
  @scala.inline
  def apply(kind: end, message: String = null): WorkDoneProgressEnd = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgressEnd]
  }
}

