package typings.tannin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TanninOptions extends js.Object {
  /**
    * Joiner in string lookup with context.
    */
  var contextDelimiter: js.UndefOr[String] = js.undefined
  /**
    * Callback to invoke when key missing.
    */
  var onMissingKey: js.UndefOr[js.Function] = js.undefined
}

object TanninOptions {
  @scala.inline
  def apply(contextDelimiter: String = null, onMissingKey: js.Function = null): TanninOptions = {
    val __obj = js.Dynamic.literal()
    if (contextDelimiter != null) __obj.updateDynamic("contextDelimiter")(contextDelimiter.asInstanceOf[js.Any])
    if (onMissingKey != null) __obj.updateDynamic("onMissingKey")(onMissingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TanninOptions]
  }
}

