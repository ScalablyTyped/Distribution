package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointUrl extends js.Object {
  var dependsOn: DependsOn
  var displayName: java.lang.String
  var helpText: java.lang.String
  var isVisible: java.lang.String
  var value: java.lang.String
}

object EndpointUrl {
  @scala.inline
  def apply(
    dependsOn: DependsOn,
    displayName: java.lang.String,
    helpText: java.lang.String,
    isVisible: java.lang.String,
    value: java.lang.String
  ): EndpointUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dependsOn")(dependsOn)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("helpText")(helpText)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EndpointUrl]
  }
}

