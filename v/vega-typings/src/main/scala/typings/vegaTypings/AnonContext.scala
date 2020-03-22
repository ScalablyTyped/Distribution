package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonContext {
  @scala.inline
  def apply(context: js.Any = null, `type`: String = null): AnonContext = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

