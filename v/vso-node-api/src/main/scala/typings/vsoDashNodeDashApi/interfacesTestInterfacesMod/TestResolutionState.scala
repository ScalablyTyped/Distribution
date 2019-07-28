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
    val __obj = js.Dynamic.literal(id = id, name = name, project = project)
  
    __obj.asInstanceOf[TestResolutionState]
  }
}

