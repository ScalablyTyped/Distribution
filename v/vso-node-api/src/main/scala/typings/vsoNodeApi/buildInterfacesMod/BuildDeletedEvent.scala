package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDeletedEvent extends RealtimeBuildEvent {
  var build: Build
}

object BuildDeletedEvent {
  @scala.inline
  def apply(build: Build, buildId: Double): BuildDeletedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDeletedEvent]
  }
}

