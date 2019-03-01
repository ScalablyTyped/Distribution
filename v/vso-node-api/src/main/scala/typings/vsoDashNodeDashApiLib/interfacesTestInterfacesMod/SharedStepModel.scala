package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStepModel extends js.Object {
  var id: scala.Double
  var revision: scala.Double
}

object SharedStepModel {
  @scala.inline
  def apply(id: scala.Double, revision: scala.Double): SharedStepModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("revision")(revision)
    __obj.asInstanceOf[SharedStepModel]
  }
}

