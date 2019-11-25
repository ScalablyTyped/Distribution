package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResolutionState extends js.Object {
  var id: Double
  var name: String
  var project: ShallowReference
}

object TestResolutionState {
  @scala.inline
  def apply(id: Double, name: String, project: ShallowReference): TestResolutionState = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestResolutionState]
  }
}

