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
    val __obj = js.Dynamic.literal(id = id, name = name, project = project)
  
    __obj.asInstanceOf[TestResolutionState]
  }
}

