package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointAssignment extends js.Object {
  var configuration: ShallowReference
  var tester: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
}

object PointAssignment {
  @scala.inline
  def apply(
    configuration: ShallowReference,
    tester: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  ): PointAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configuration")(configuration)
    __obj.updateDynamic("tester")(tester)
    __obj.asInstanceOf[PointAssignment]
  }
}

