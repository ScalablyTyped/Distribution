package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStepModel extends js.Object {
  var id: Double
  var revision: Double
}

object SharedStepModel {
  @scala.inline
  def apply(id: Double, revision: Double): SharedStepModel = {
    val __obj = js.Dynamic.literal(id = id, revision = revision)
  
    __obj.asInstanceOf[SharedStepModel]
  }
}

