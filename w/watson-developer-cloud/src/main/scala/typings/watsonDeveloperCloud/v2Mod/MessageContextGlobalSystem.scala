package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Built-in system properties that apply to all skills used by the assistant. */
@js.native
trait MessageContextGlobalSystem extends js.Object {
  /** The user time zone. The assistant uses the time zone to correctly resolve relative time references. */
  var timezone: js.UndefOr[String] = js.native
  /** A counter that is automatically incremented with each turn of the conversation. A value of 1 indicates that this is the the first turn of a new conversation, which can affect the behavior of some skills (for example, triggering the start node of a dialog). */
  var turn_count: js.UndefOr[Double] = js.native
  /** A string value that identifies the user who is interacting with the assistant. The client must provide a unique identifier for each individual end user who accesses the application. For Plus and Premium plans, this user ID is used to identify unique users for billing purposes. This string cannot contain carriage return, newline, or tab characters. */
  var user_id: js.UndefOr[String] = js.native
}

object MessageContextGlobalSystem {
  @scala.inline
  def apply(): MessageContextGlobalSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageContextGlobalSystem]
  }
  @scala.inline
  implicit class MessageContextGlobalSystemOps[Self <: MessageContextGlobalSystem] (val x: Self) extends AnyVal {
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
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    @scala.inline
    def setTurn_count(value: Double): Self = this.set("turn_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTurn_count: Self = this.set("turn_count", js.undefined)
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
  }
  
}

