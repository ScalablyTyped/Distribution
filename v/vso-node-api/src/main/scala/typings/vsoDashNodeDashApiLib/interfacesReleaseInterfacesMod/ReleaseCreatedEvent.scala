package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseCreatedEvent extends js.Object {
  var project: ProjectReference
  var release: Release
}

object ReleaseCreatedEvent {
  @scala.inline
  def apply(project: ProjectReference, release: Release): ReleaseCreatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[ReleaseCreatedEvent]
  }
}

