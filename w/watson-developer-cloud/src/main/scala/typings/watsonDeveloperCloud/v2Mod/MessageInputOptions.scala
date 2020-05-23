package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Optional properties that control how the assistant responds. */
trait MessageInputOptions extends js.Object {
  /** Whether to return more than one intent. Set to `true` to return all matching intents. */
  var alternate_intents: js.UndefOr[Boolean] = js.undefined
  /** Whether to return additional diagnostic information. Set to `true` to return additional information under the `output.debug` key. */
  var debug: js.UndefOr[Boolean] = js.undefined
  /** Whether to restart dialog processing at the root of the dialog, regardless of any previously visited nodes. **Note:** This does not affect `turn_count` or any other context variables. */
  var restart: js.UndefOr[Boolean] = js.undefined
  /** Whether to return session context with the response. If you specify `true`, the response will include the `context` property. */
  var return_context: js.UndefOr[Boolean] = js.undefined
}

object MessageInputOptions {
  @scala.inline
  def apply(
    alternate_intents: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    restart: js.UndefOr[Boolean] = js.undefined,
    return_context: js.UndefOr[Boolean] = js.undefined
  ): MessageInputOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alternate_intents)) __obj.updateDynamic("alternate_intents")(alternate_intents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restart)) __obj.updateDynamic("restart")(restart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(return_context)) __obj.updateDynamic("return_context")(return_context.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageInputOptions]
  }
}

