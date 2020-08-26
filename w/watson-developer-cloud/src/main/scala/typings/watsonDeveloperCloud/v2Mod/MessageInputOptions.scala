package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Optional properties that control how the assistant responds. */
@js.native
trait MessageInputOptions extends js.Object {
  /** Whether to return more than one intent. Set to `true` to return all matching intents. */
  var alternate_intents: js.UndefOr[Boolean] = js.native
  /** Whether to return additional diagnostic information. Set to `true` to return additional information under the `output.debug` key. */
  var debug: js.UndefOr[Boolean] = js.native
  /** Whether to restart dialog processing at the root of the dialog, regardless of any previously visited nodes. **Note:** This does not affect `turn_count` or any other context variables. */
  var restart: js.UndefOr[Boolean] = js.native
  /** Whether to return session context with the response. If you specify `true`, the response will include the `context` property. */
  var return_context: js.UndefOr[Boolean] = js.native
}

object MessageInputOptions {
  @scala.inline
  def apply(): MessageInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageInputOptions]
  }
  @scala.inline
  implicit class MessageInputOptionsOps[Self <: MessageInputOptions] (val x: Self) extends AnyVal {
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
    def setAlternate_intents(value: Boolean): Self = this.set("alternate_intents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternate_intents: Self = this.set("alternate_intents", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setRestart(value: Boolean): Self = this.set("restart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestart: Self = this.set("restart", js.undefined)
    @scala.inline
    def setReturn_context(value: Boolean): Self = this.set("return_context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_context: Self = this.set("return_context", js.undefined)
  }
  
}

