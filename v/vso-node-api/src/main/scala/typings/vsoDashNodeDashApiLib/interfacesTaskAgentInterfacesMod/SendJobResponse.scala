package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendJobResponse extends js.Object {
  var events: JobEventsConfig
  var variables: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object SendJobResponse {
  @scala.inline
  def apply(events: JobEventsConfig, variables: org.scalablytyped.runtime.StringDictionary[java.lang.String]): SendJobResponse = {
    val __obj = js.Dynamic.literal(events = events, variables = variables)
  
    __obj.asInstanceOf[SendJobResponse]
  }
}

