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
    val __obj = js.Dynamic.literal(dependsOn = dependsOn, displayName = displayName, helpText = helpText, isVisible = isVisible, value = value)
  
    __obj.asInstanceOf[EndpointUrl]
  }
}

