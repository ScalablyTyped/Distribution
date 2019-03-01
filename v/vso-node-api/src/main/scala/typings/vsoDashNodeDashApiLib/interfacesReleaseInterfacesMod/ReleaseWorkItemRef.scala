package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseWorkItemRef extends js.Object {
  var assignee: java.lang.String
  var id: java.lang.String
  var state: java.lang.String
  var title: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object ReleaseWorkItemRef {
  @scala.inline
  def apply(
    assignee: java.lang.String,
    id: java.lang.String,
    state: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): ReleaseWorkItemRef = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("assignee")(assignee)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ReleaseWorkItemRef]
  }
}

