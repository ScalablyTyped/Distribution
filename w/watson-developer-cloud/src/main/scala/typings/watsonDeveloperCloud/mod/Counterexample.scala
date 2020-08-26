package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Counterexample. */
@js.native
trait Counterexample extends js.Object {
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.native
  /** The text of a user input marked as irrelevant input. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters - It cannot consist of only whitespace characters - It must be no longer than 1024 characters. */
  var text: String = js.native
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.native
}

object Counterexample {
  @scala.inline
  def apply(text: String): Counterexample = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counterexample]
  }
  @scala.inline
  implicit class CounterexampleOps[Self <: Counterexample] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

