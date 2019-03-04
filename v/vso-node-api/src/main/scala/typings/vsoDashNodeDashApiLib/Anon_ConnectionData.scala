package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionData extends js.Object {
  var ConnectionData: js.Any
  var InheritLevel: Anon_EnumValuesAnonAccount
  var LocationServiceData: js.Any
  var RelativeToSetting: Anon_EnumValuesAnonContext
  var ServiceDefinition: js.Any
  var ServiceStatus: Anon_EnumValuesAnonActiveAssigned
}

object Anon_ConnectionData {
  @scala.inline
  def apply(
    ConnectionData: js.Any,
    InheritLevel: Anon_EnumValuesAnonAccount,
    LocationServiceData: js.Any,
    RelativeToSetting: Anon_EnumValuesAnonContext,
    ServiceDefinition: js.Any,
    ServiceStatus: Anon_EnumValuesAnonActiveAssigned
  ): Anon_ConnectionData = {
    val __obj = js.Dynamic.literal(ConnectionData = ConnectionData, InheritLevel = InheritLevel, LocationServiceData = LocationServiceData, RelativeToSetting = RelativeToSetting, ServiceDefinition = ServiceDefinition, ServiceStatus = ServiceStatus)
  
    __obj.asInstanceOf[Anon_ConnectionData]
  }
}

