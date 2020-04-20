package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendJobResponse extends js.Object {
  var events: JobEventsConfig
  var variables: StringDictionary[String]
}

object SendJobResponse {
  @scala.inline
  def apply(events: JobEventsConfig, variables: StringDictionary[String]): SendJobResponse = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendJobResponse]
  }
}

