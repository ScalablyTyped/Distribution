package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResolutionState extends js.Object {
  var id: scala.Double
  var name: java.lang.String
  var project: ShallowReference
}

object TestResolutionState {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String, project: ShallowReference): TestResolutionState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[TestResolutionState]
  }
}

