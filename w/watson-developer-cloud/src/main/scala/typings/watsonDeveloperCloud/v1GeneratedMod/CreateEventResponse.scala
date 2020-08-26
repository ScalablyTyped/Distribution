package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object defining the event being created. */
@js.native
trait CreateEventResponse extends js.Object {
  /** Query event data object. */
  var data: js.UndefOr[EventData] = js.native
  /** The event type that was created. */
  var `type`: js.UndefOr[String] = js.native
}

object CreateEventResponse {
  @scala.inline
  def apply(): CreateEventResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventResponse]
  }
  @scala.inline
  implicit class CreateEventResponseOps[Self <: CreateEventResponse] (val x: Self) extends AnyVal {
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
    def setData(value: EventData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

