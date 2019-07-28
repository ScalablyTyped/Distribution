package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointUrl extends js.Object {
  var dependsOn: DependsOn
  var displayName: String
  var helpText: String
  var isVisible: String
  var value: String
}

object EndpointUrl {
  @scala.inline
  def apply(dependsOn: DependsOn, displayName: String, helpText: String, isVisible: String, value: String): EndpointUrl = {
    val __obj = js.Dynamic.literal(dependsOn = dependsOn, displayName = displayName, helpText = helpText, isVisible = isVisible, value = value)
  
    __obj.asInstanceOf[EndpointUrl]
  }
}

