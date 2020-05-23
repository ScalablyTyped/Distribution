package typings.vegaTypings.runtimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToCanvasOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var externalContext: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ToCanvasOptions {
  @scala.inline
  def apply(context: js.Any = null, externalContext: js.Any = null, `type`: String = null): ToCanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (externalContext != null) __obj.updateDynamic("externalContext")(externalContext.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToCanvasOptions]
  }
}

