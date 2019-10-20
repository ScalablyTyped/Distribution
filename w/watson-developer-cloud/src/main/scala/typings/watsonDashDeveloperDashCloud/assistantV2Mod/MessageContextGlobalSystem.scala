package typings.watsonDashDeveloperDashCloud.assistantV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Built-in system properties that apply to all skills used by the assistant. */
trait MessageContextGlobalSystem extends js.Object {
  /** The user time zone. The assistant uses the time zone to correctly resolve relative time references. */
  var timezone: js.UndefOr[String] = js.undefined
  /** A counter that is automatically incremented with each turn of the conversation. A value of 1 indicates that this is the the first turn of a new conversation, which can affect the behavior of some skills (for example, triggering the start node of a dialog). */
  var turn_count: js.UndefOr[Double] = js.undefined
  /** A string value that identifies the user who is interacting with the assistant. The client must provide a unique identifier for each individual end user who accesses the application. For Plus and Premium plans, this user ID is used to identify unique users for billing purposes. This string cannot contain carriage return, newline, or tab characters. */
  var user_id: js.UndefOr[String] = js.undefined
}

object MessageContextGlobalSystem {
  @scala.inline
  def apply(timezone: String = null, turn_count: Int | Double = null, user_id: String = null): MessageContextGlobalSystem = {
    val __obj = js.Dynamic.literal()
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (turn_count != null) __obj.updateDynamic("turn_count")(turn_count.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[MessageContextGlobalSystem]
  }
}

