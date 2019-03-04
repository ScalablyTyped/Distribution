package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointUpdateModel extends js.Object {
  var outcome: java.lang.String
  var resetToActive: scala.Boolean
  var tester: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
}

object PointUpdateModel {
  @scala.inline
  def apply(
    outcome: java.lang.String,
    resetToActive: scala.Boolean,
    tester: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  ): PointUpdateModel = {
    val __obj = js.Dynamic.literal(outcome = outcome, resetToActive = resetToActive, tester = tester)
  
    __obj.asInstanceOf[PointUpdateModel]
  }
}

