package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildUpdatedEvent extends RealtimeBuildEvent {
  var build: Build
}

object BuildUpdatedEvent {
  @scala.inline
  def apply(build: Build, buildId: Double): BuildUpdatedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildUpdatedEvent]
  }
}

