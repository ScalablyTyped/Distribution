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
    val __obj = js.Dynamic.literal(dependsOn = dependsOn.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], helpText = helpText.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EndpointUrl]
  }
}

