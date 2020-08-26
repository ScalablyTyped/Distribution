package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendJobResponse extends js.Object {
  var events: JobEventsConfig = js.native
  var variables: StringDictionary[String] = js.native
}

object SendJobResponse {
  @scala.inline
  def apply(events: JobEventsConfig, variables: StringDictionary[String]): SendJobResponse = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendJobResponse]
  }
  @scala.inline
  implicit class SendJobResponseOps[Self <: SendJobResponse] (val x: Self) extends AnyVal {
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
    def setEvents(value: JobEventsConfig): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: StringDictionary[String]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

